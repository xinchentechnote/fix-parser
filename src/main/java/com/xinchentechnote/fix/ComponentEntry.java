package com.xinchentechnote.fix;

import lombok.Data;

@Data
public final class ComponentEntry implements Entry {
  private String name;
  private boolean required;
  private ComponentDef def;

  public static ComponentEntry build(String name, boolean required) {
    ComponentEntry componentEntry = new ComponentEntry();
    componentEntry.setName(name);
    componentEntry.setRequired(required);
    return componentEntry;
  }

  public TemplateModel buildTemplateModel(MsgType msgType, String parentName) {
    return new TemplateModel(name, msgType, parentName);
  }

  public static class TemplateModel extends BaseTemplateModel {
    public TemplateModel(String name, MsgType msgType, String parentName) {
      super(name, msgType, parentName);
    }
  }
}
