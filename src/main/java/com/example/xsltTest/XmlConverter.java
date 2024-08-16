package com.example.xsltTest;

import java.io.File;

import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XmlConverter {
    public static void convert()
    {
        try
        {
            File xsltFile=new File("D:\\workSFTLNK\\xsltDoc.xslt");
            StreamSource xsltSource = new StreamSource(xsltFile);
        
            File xmlFile = new File("D:\\workSFTLNK\\xmlDoc.xml");
            StreamSource xmlSource = new StreamSource(xmlFile);

            StreamResult jsonResult = new StreamResult(new File("D:\\workSFTLNK\\jsonDoc.json"));
            
            TransformerFactory transformerFactory = TransformerFactory.newInstance(
                "org.apache.xalan.processor.TransformerFactoryImpl",null
            );
            javax.xml.transform.Transformer transformer = transformerFactory.newTransformer(xsltSource);
            transformer.transform(xmlSource,jsonResult);

            System.out.println("Converted");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public static void callFromXslt()
    {
        try
        {
            File xsltFile=new File("D:\\workSFTLNK\\callingXSLT.xslt");
            StreamSource xsltSource = new StreamSource(xsltFile);
            

            File xmlFile = new File("D:\\workSFTLNK\\xmlDoc.xml");
            StreamSource xmlSource = new StreamSource(xmlFile);

            StreamResult jsonResult = new StreamResult(new File("D:\\workSFTLNK\\changedXml.xml"));
            
            TransformerFactory transformerFactory = TransformerFactory.newInstance(
                "org.apache.xalan.processor.TransformerFactoryImpl",null
            );
            javax.xml.transform.Transformer transformer = transformerFactory.newTransformer(xsltSource);
            transformer.transform(xmlSource,jsonResult);

            System.out.println("Changed");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
}
