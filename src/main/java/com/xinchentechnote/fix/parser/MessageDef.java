package com.xinchentechnote.fix.parser;

import lombok.Data;

import java.util.List;

@Data
public class MessageDef implements StructuredDef {
  String name;
  String msgType;
  List<Entry> entries;
}
