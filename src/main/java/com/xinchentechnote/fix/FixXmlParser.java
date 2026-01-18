package com.xinchentechnote.fix;

public interface FixXmlParser {
  FixSchema parse(String xml) throws Exception;

  FixSchema parseFromXml(String xml) throws Exception;
}
