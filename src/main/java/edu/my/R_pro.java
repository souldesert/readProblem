package edu.my;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.datatype.guava.deser.ImmutableListDeserializer;
import com.google.common.collect.ImmutableList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 05.12.2016.
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JacksonXmlRootElement(localName = "t1")
public class R_pro {

    //@JsonDeserialize(using = MyImmutableListDeserializer.class, as = ImmutableList.class, keyAs = int.class, contentAs = String.class)
    @JacksonXmlProperty(localName = "t2")
    ObservableList<String> test = FXCollections.observableArrayList();

}
