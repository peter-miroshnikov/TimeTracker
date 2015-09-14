package com.seeburger.controller;


import java.io.*;
import java.util.logging.*;

import com.seeburger.model.DatabaseConnector;
import com.seeburger.model.ModelManager;
import com.seeburger.model.MyLogger;
import com.seeburger.model.ObjectFactory;
import com.seeburger.model.EmployeeList.Employee;
import com.seeburger.model.EmployeeList.Employee.EmployeeInfo;
import com.seeburger.model.EmployeeList.Employee.EnterDateList.Enter;
import com.seeburger.model.EmployeeList.Employee.ExitDateList.Exit;

import au.com.bytecode.opencsv.CSVReader;


public class CVSRead
{

    private static final String ENTER = "Eingang";
    private static final String EXIT = "Ausgang";
    private CSVReader readerc;
    private ObjectFactory factory = new ObjectFactory();
    private ModelManager mm;
    private Convertors con;
    private int counter = 0;
   


    public CVSRead(ModelManager mm)
    {
        this.mm = mm;
        con = new Convertors();
        
    }


    public void readAll(File words)
    {

        try
        {
            readerc = new CSVReader(new FileReader(words));

        }
        catch (FileNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String[] row = null;
        int town = -1;
        try
        {
            if (mm.getDb().addFile(words))
            {
                while ((row = readerc.readNext()) != null)
                {

                    if (words.getName().startsWith("ar_sf"))
                    {

                        town = 0;
                    }
                    else
                    {
                        town = 1;
                    }

                    counter++;
                    String personName = con.getNameOnly(row[14]);
                    int personID = con.getIdOnly(row[14])[0];
                    String[] names = con.getFirstLastName(personName);

                    mm.getDb().addNewEmployee(names[0], names[1], personID);

                    String enteringType = con.getEnterOrExitStatus(row[15]);
                    // Employee emp = factory.createEmployeeListEmployee();
                    // MyLogger.getInstance().getLogger().log(Level.CONFIG, "Creating Employee counter :" +
                    // counter);
                    // EmployeeInfo ei = factory.createEmployeeListEmployeeEmployeeInfo();
                    // MyLogger.getInstance()
                    // .getLogger()
                    // .log(Level.CONFIG,
                    // "Creating Inforation Object for Employee With name " + personName + " and ID: "
                    // + personID + "/" + counter);
                    // ei.setId(personID);
                    // MyLogger.getInstance()
                    // .getLogger()
                    // .log(Level.CONFIG, "Setting the ID to the Object" + counter);
                    // ei.setName(personName);
                    // MyLogger.getInstance()
                    // .getLogger()
                    // .log(Level.CONFIG, "Setting the name to the Object" + counter);
                    // emp.setEmployeeInfo(ei);
                    // MyLogger.getInstance()
                    // .getLogger()
                    // .log(Level.CONFIG,
                    // "Setting the Employee Information Object to the Employee" + counter);
                    //
                    // mm.getEmployeeHolder().addEmployee(emp);
                    // MyLogger.getInstance()
                    // .getLogger()
                    // .log(Level.CONFIG, "Adding the Employee to the Employee Holder class");

                    mm.getDb().addNewWorkingDay(names[0], names[1], con.getTimeFromString(row[12]));

                    if (enteringType.equals(ENTER))
                    {
                    	mm.getDb().addEnterTime(names[0], names[1], con.getTimeFromString(row[12]));
                        // MyLogger.getInstance()
                        // .getLogger()
                        // .log(Level.CONFIG, "Creating Enter Object for person :" + personName);
                        // Enter e = factory.createEmployeeListEmployeeEnterDateListEnter();
                        // MyLogger.getInstance()
                        // .getLogger()
                        // .log(Level.CONFIG, "Setting enter date for the Enter Object");
                        // e.setEnterDate(row[12]);
                        // MyLogger.getInstance()
                        // .getLogger()
                        // .log(Level.CONFIG, "Seeting enter floo for the Enter Object");
                        // e.setFloor(town);
                        // if (mm.getEmployeeHolder().getEmployeeByName(personName).getEnterDateList() ==
                        // null)
                        // {
                        // MyLogger.getInstance()
                        // .getLogger()
                        // .log(Level.CONFIG,
                        // "Creating new instance of Enter Date List for person :" + personName);
                        // mm.getEmployeeHolder()
                        // .getEmployeeByName(personName)
                        // .setEnterDateList(factory.createEmployeeListEmployeeEnterDateList());
                        // }
                        // MyLogger.getInstance()
                        // .getLogger()
                        // .log(Level.CONFIG,
                        // "Adding the Enter Object to the Enter Date's List of person :" + personName);
                        // mm.getEmployeeHolder().getEmployeeByName(personName).getEnterDateList().getEnter().add(e);

                    }
                    else if (enteringType.equals(EXIT))
                    {
                    	mm.getDb().addExitTime(names[0], names[1], con.getTimeFromString(row[12]));
                        // MyLogger.getInstance()
                        // .getLogger()
                        // .log(Level.CONFIG, "Creating Exit Object for person :" + personName);
                        // Exit ex = factory.createEmployeeListEmployeeExitDateListExit();
                        // MyLogger.getInstance()
                        // .getLogger()
                        // .log(Level.CONFIG, "Setting exit tate for the exit Object");
                        // ex.setExitDate(row[12]);
                        // MyLogger.getInstance()
                        // .getLogger()
                        // .log(Level.CONFIG, "Setting exit floor for the exit Object");
                        // ex.setFloor(town);
                        //
                        // if (mm.getEmployeeHolder().getEmployeeByName(personName).getExitDateList() == null)
                        // {
                        // MyLogger.getInstance()
                        // .getLogger()
                        // .log(Level.CONFIG,
                        // "Creating new instance of Exit Date List for person :" + personName);
                        //
                        // mm.getEmployeeHolder()
                        // .getEmployeeByName(personName)
                        // .setExitDateList(factory.createEmployeeListEmployeeExitDateList());
                        // }
                        // MyLogger.getInstance()
                        // .getLogger()
                        // .log(Level.CONFIG,
                        // "Adding the Exit Object to the Exit Date's List of person :" + personName);
                        // mm.getEmployeeHolder().getEmployeeByName(personName).getExitDateList().getExit().add(ex);
                    }

                } // Closing the While loop

            }
            else
            {
                System.out.println("The File has already Been read and saved on the DB");
            }
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            MyLogger.getInstance()
                    .getLogger()
                    .log(Level.SEVERE, "I/O Exception with the reading of a File :  " + e.getMessage());
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if (readerc != null)
                {
                    MyLogger.getInstance().getLogger().log(Level.CONFIG, "Closing the Reader");
                    readerc.close();
                }
            }
            catch (IOException e)
            {
                MyLogger.getInstance()
                        .getLogger()
                        .log(Level.CONFIG, " I/O Exception while trying to close the reader.");
                e.printStackTrace();
            }
        }

    }
}
