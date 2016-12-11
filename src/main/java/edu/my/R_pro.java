package edu.my;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

/**
 * Created by Alex on 05.12.2016.
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JacksonXmlRootElement(localName = "t1")
public class R_pro {

    public void setTest(List test) {
        this.test.addAll(test);
    }

    public List<String> getTest() {
 /*       ArrayList<String> list = new ArrayList<String>();
        test.
        list.addAll(test.toArray());*/
        return test;
    }

    //@JsonDeserialize(using = MyImmutableListDeserializer.class, as = ImmutableList.class, keyAs = int.class, contentAs = String.class)
   // @JsonView(Views.Normal.class)
    @JacksonXmlProperty(localName = "t2")
    ObservableList<String> test = FXCollections.observableArrayList();
        //    List<String> test = new ArrayList<>();
}
