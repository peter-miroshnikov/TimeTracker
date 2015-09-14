/*
 * XmlToHtmlTransformer.java
 *
 * created at Jul 18, 2013 by p.miroshnikov <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.seeburger.controller;


import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import java.io.*;


public class XmlToHtmlTransformer
{

    private static TransformerFactory tf = TransformerFactory.newInstance();
    private static Source xslt = new StreamSource(new File("test.xsl"));
    private static Transformer transformer;


    public static boolean transfor(String fileName)
    {
        try
        {
            transformer = tf.newTransformer(xslt);
            Source text = new StreamSource(new File(fileName));

            transformer.transform(text, new StreamResult(new File("D:\\output.html")));
            return true;
        }
        catch (TransformerException e)
        {
            e.printStackTrace();
        }
        return false;
    }
}
