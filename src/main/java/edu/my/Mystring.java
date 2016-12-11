package edu.my;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Created by Alex on 05.12.2016.
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JacksonXmlRootElement(localName = "t2")
public class Mystring {

    //@JacksonXmlProperty(localName = "t3")
    String test;

}
