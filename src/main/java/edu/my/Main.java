package edu.my;

import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        JacksonXmlModule module = new JacksonXmlModule();
        module.setDefaultUseWrapper(false);
        XmlMapper xmlMapper = new XmlMapper(module);
        try (BufferedReader reader = new BufferedReader(new FileReader("test.xml"))) {
            String xml = reader.readLine();
            R_pro readed = xmlMapper.readValue(xml, R_pro.class);
            System.out.println(readed.test);

            readed.test.add("test");

            write(new File("test"), readed);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //mapper.readValue()


    }

    public static void write(File directory, R_pro pr) throws IOException {
        JacksonXmlModule module = new JacksonXmlModule();
        module.setDefaultUseWrapper(false);
        XmlMapper xmlMapper = new XmlMapper(module);
        //File file = new File(directory, "project.rtran");
        //file.createNewFile();
        BufferedWriter writer = new BufferedWriter(new FileWriter("test2.xml"));
        xmlMapper.writeValue(writer, pr);

    }
}
