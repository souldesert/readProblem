package edu.my;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here

        XmlMapper mapper = new XmlMapper();
        try (BufferedReader reader = new BufferedReader(new FileReader("test.xml"))) {
            String xml = reader.readLine();
            R_pro readed = mapper.readValue(xml, R_pro.class);
            System.out.println(readed.test);
        } catch (IOException e){
            e.printStackTrace();
        }
        //mapper.readValue()



    }
}
