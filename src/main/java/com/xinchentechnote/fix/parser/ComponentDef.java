package com.xinchentechnote.fix.parser;

import lombok.Data;

import java.util.List;

@Data
public class ComponentDef implements StructuredDef {
  String name;
  List<Entry> entries;

  public static ComponentDef build(String name, List<Entry> entries) {
    ComponentDef componentDef = new ComponentDef();
    componentDef.setName(name);
    componentDef.setEntries(entries);
    return componentDef;
  }
}
