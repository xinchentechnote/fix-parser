package com.xinchentechnote.fix.parser;

import com.xinchentechnote.fix.parser.FixSchema;

public interface FixXmlParser {
  FixSchema parse(String xml) throws Exception;

  FixSchema parseFromXml(String xml) throws Exception;
}
