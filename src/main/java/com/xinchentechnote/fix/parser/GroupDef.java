package com.xinchentechnote.fix.parser;

import lombok.Data;

import java.util.List;

@Data
public class GroupDef implements StructuredDef {
  String name;
  int number;
  String delimiter;
  int delimiterNumber;
  List<Entry> entries;
}
