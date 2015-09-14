/*
 * MyLogger.java
 *
 * created at Jul 19, 2013 by p.miroshnikov <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.seeburger.model;


import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class MyLogger
{
    private Logger logger = Logger.getLogger("My logger");
    private FileHandler fh;
    private static MyLogger log;
    private SimpleFormatter sf;


    private MyLogger()

    {
        try
        {
            sf = new SimpleFormatter();
            fh = new FileHandler("D:\\MyLogFile.log");
            fh.setFormatter(sf);
            logger.addHandler(fh);
            logger.setLevel(Level.ALL);
        }
        catch (SecurityException | IOException e)
        {
            e.printStackTrace();
        }
    }


    public static MyLogger getInstance()
    {
        if (log == null)
        {
            log = new MyLogger();
        }
        return log;
    }


    public Logger getLogger()
    {
        return logger;
    }
}
