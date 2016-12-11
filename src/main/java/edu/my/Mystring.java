package edu.my;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by Alex on 05.12.2016.
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Mystring {

    //@JacksonXmlProperty(localName = "t3")
    String test;

}
