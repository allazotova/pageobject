package com.aqacourses.project.utils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XmlParser {

    /**
     * Parse XML configuration file
     *
     * @return Data that represents content from xml file
     * @throws JAXBException
     */
    public static Data getXmlData() throws JAXBException {

        JAXBContext jaxbContext = JAXBContext.newInstance(Data.class);

        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        return (Data) unmarshaller.unmarshal(new File("src/main/resources/configuration.xml"));
    }

}
