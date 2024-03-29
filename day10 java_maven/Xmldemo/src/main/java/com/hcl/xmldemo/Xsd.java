package com.hcl.xmldemo;

import java.io.*;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.*;
import org.xml.sax.SAXException;

public class Xsd {
	public static void main(String[] args) throws SAXException, IOException {
        SchemaFactory factory = 
            SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
        
        File schemaLocation = new File("C:/day10 java_maven/Xmldemo/src/main/java/com/hcl/xmldemo/emp.xsd");
        Schema schema = factory.newSchema(schemaLocation);
        Validator validator = schema.newValidator();
        Source source = new StreamSource("C:/day10 java_maven/Xmldemo/src/main/java/com/hcl/xmldemo/emp.xml");
        
        try {
            validator.validate(source);
            System.out.println(" is valid.");
        }
        catch (SAXException ex) {
            System.out.println( " is not valid because ");
            System.out.println(ex.getMessage());
        }  
        
    }
}