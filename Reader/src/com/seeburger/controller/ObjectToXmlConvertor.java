/*
 * ObjectToXmlConvertor.java
 *
 * created at Jul 17, 2013 by p.miroshnikov <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.seeburger.controller;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.seeburger.model.EmployeeList;


public class ObjectToXmlConvertor
{
    private ObjectToXmlConvertor()
    {

    }


    public static void write(EmployeeList emp)
    {

        try
        {
            JAXBContext jc = JAXBContext.newInstance("com.seeburger.model");
            Marshaller m = jc.createMarshaller();

            OutputStream os = new FileOutputStream("nosferatu.xml");

            m.marshal(emp, os);
        }
        catch (FileNotFoundException | JAXBException e)
        {
            e.printStackTrace();
        }

    }

}
