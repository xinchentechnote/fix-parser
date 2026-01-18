package com.xinchentechnote.fix;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

@Data
public class MessageDef implements StructuredDef {
  String name;
  String msgType;
  List<Entry> entries;

  public TemplateModel buildTemplateModel() {
    return new TemplateModel(name);
  }

  @Data
  public static class TemplateModel {
    private String name;
    private String instanceName;

    public TemplateModel(String name) {
      this.name = name;
      this.instanceName = StringUtils.uncapitalize(name);
    }
  }
}
