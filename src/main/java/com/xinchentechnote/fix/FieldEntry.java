package com.xinchentechnote.fix;

import lombok.Data;

@Data
public final class FieldEntry implements Entry {
  private String name;
  private boolean required;
  private FieldDef def;

  public static FieldEntry build(String name, boolean required, int number, FixType type) {
    FieldEntry entry = new FieldEntry();
    entry.setName(name);
    entry.setRequired(required);
    FieldDef def = new FieldDef();
    def.setNumber(number);
    def.setName(name);
    def.setType(type);
    entry.setDef(def);
    return entry;
  }

  public TemplateModel buildTemplateModel(MsgType msgType, String parentName) {
    TemplateModel model = new TemplateModel();
    model.setName(name);
    model.setParentName(parentName);
    switch (msgType) {
      case TRAILER:
        model.parentFixName = "trailer";
        break;
      case HEADER:
        model.parentFixName = "header";
        break;
      default:
        model.parentFixName = parentName;
    }
    return model;
  }

  @Data
  public static class TemplateModel {
    private String name;
    private String parentName = "";
    private String parentFixName = "";
    private String afterSetMethod = "";
    private String fixGetMethod = "";
    private String afterGetMethod = "";
  }
}
