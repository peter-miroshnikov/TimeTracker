/*
 * DatabaseConnector.java
 *
 * created at Aug 9, 2013 by p.miroshnikov <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.seeburger.model;


import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.joda.time.DateTime;

import com.mysql.jdbc.exceptions.jdbc4.MySQLDataException;


public class DatabaseConnector
{

    Connection connection;


    public DatabaseConnector()
    {
        try
        {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/timemanagment", "root", "");

        }
        catch (SQLException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public boolean addNewEmployee(String firstName, String lastName, int chipNumber)
    {
        try
        {
            PreparedStatement prep = connection.prepareStatement("SELECT * FROM temployee WHERE cFirstName = ? AND cLastName = ? ");
            ResultSet rs = null;
            prep.setString(1, firstName);
            prep.setString(2, lastName);
            try
            {
                rs = prep.executeQuery();

            }
            catch (MySQLDataException e)
            {
                // XXX
            }

            if (rs == null || rs.next() == false)
            {
                System.out.println("Addvam person  :" + firstName + " " + lastName);
                String Query = "INSERT INTO temployee (cFirstName , cLastName , cChipNumber) VALUES (?,?,?)";
                PreparedStatement insertStatement = connection.prepareStatement(Query);
                insertStatement.setString(1, firstName);
                insertStatement.setString(2, lastName);
                insertStatement.setInt(3, chipNumber);
                insertStatement.executeUpdate();
                return true;
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        return false;
    }


    public boolean addNewWorkingDay(String firstName, String lastName, DateTime time)
    {
        java.sql.Date sqlDate;
        try
        {

            PreparedStatement prep = connection.prepareStatement("SELECT * FROM tworkdays WHERE cID = (SELECT cID FROM temployee WHERE cFirstName = ? AND cLastName = ?) AND cDay = ? ");
            ResultSet rs = null;
            prep.setString(1, firstName);
            prep.setString(2, lastName);
            sqlDate = new java.sql.Date(time.getMillis());
            prep.setDate(3, sqlDate);
            try
            {
                rs = prep.executeQuery();

            }
            catch (MySQLDataException e)
            {
                // XXX
            }

            if (rs == null || rs.next() == false)
            {

                String Query = "INSERT INTO tworkdays (cDay , cID  ) VALUES (?,(SELECT cID FROM temployee WHERE cFirstName = ? AND cLastName = ?) )";

                PreparedStatement insertStatement = connection.prepareStatement(Query);
                insertStatement.setDate(1, sqlDate);
                insertStatement.setString(2, firstName);
                insertStatement.setString(3, lastName);
                System.out.println(insertStatement.toString());
                insertStatement.executeUpdate();
                return true;
            }
        }
        catch (SQLException e)
        {

            System.out.println(firstName + " / " + lastName);
            e.printStackTrace();
        }

        return false;
    }


    public boolean addStatistics()
    {
        return false;
    }


    public boolean addEnterTime(String firstName, String lastName, DateTime time)
    {
        java.sql.Date sqlDate;
        java.sql.Time sqlTime;
        try
        {
            sqlDate = new java.sql.Date(time.getMillis());
            sqlTime = new java.sql.Time(time.getMillis());
            PreparedStatement prep = connection.prepareStatement("SELECT * FROM tenterlist WHERE cDay_ID = (SELECT cDay_ID FROM tworkdays WHERE cID = (SELECT cID FROM temployee WHERE cFirstName = ? AND cLastName = ? )  AND cDay = ?) AND cTime= ? ");
            ResultSet rs = null;
            prep.setString(1, firstName);
            prep.setString(2, lastName);
            sqlDate = new java.sql.Date(time.getMillis());
            prep.setDate(3, sqlDate);
            prep.setTime(4, sqlTime);
            try
            {
                rs = prep.executeQuery();

            }
            catch (MySQLDataException e)
            {
                // XXX
            }
            if (rs == null || rs.next() == false)
            {
                String Query = "INSERT INTO tenterlist (cDay_ID , cTime  ) VALUES ( (SELECT cDay_ID FROM tworkdays WHERE cID = (SELECT cID FROM temployee WHERE cFirstName = ? AND cLastName = ? )  AND cDay = ?),? )";

                PreparedStatement insertStatement = connection.prepareStatement(Query);
                insertStatement.setString(1, firstName);
                insertStatement.setString(2, lastName);
                insertStatement.setDate(3, sqlDate);
                insertStatement.setTime(4, sqlTime);

                insertStatement.executeUpdate();
                return true;
            }
        }
        catch (SQLException e)
        {

            System.out.println(firstName + " / " + lastName);
            e.printStackTrace();
        }

        return false;
    }


    public boolean addExitTime(String firstName, String lastName, DateTime time)
    {
        try
        {
            java.sql.Date sqlDate;
            java.sql.Time sqlTime;
            sqlDate = new java.sql.Date(time.getMillis());
            sqlTime = new java.sql.Time(time.getMillis());
            PreparedStatement prep = connection.prepareStatement("SELECT * FROM tenterlist WHERE cDay_ID = (SELECT cDay_ID FROM tworkdays WHERE cID = (SELECT cID FROM temployee WHERE cFirstName = ? AND cLastName = ? )  AND cDay = ?) AND cTime= ? ");
            ResultSet rs = null;
            prep.setString(1, firstName);
            prep.setString(2, lastName);
            sqlDate = new java.sql.Date(time.getMillis());
            prep.setDate(3, sqlDate);
            prep.setTime(4, sqlTime);
            try
            {
                rs = prep.executeQuery();

            }
            catch (MySQLDataException e)
            {
                // XXX
            }

            if (rs == null || rs.next() == false)
            {
                String Query = "INSERT INTO texitlist (cDay_ID , cTime  ) VALUES ( (SELECT cDay_ID FROM tworkdays WHERE cID = (SELECT cID FROM temployee WHERE cFirstName = ? AND cLastName = ? )  AND cDay = ?),? )";

                PreparedStatement insertStatement = connection.prepareStatement(Query);
                insertStatement.setString(1, firstName);
                insertStatement.setString(2, lastName);
                insertStatement.setDate(3, sqlDate);
                insertStatement.setTime(4, sqlTime);

                insertStatement.executeUpdate();
                return true;
            }
        }
        catch (SQLException e)
        {

            System.out.println(firstName + " / " + lastName);
            e.printStackTrace();
        }

        return false;
    }


    public boolean addFile(File name)
    {

        try
        {

            java.sql.Timestamp ts = new java.sql.Timestamp(name.lastModified());

            ResultSet rs = null;
            PreparedStatement check = connection.prepareStatement("SELECT cLastAdded FROM tfiles WHERE cFileName = ? ");
            check.setString(1, name.getName());

            rs = check.executeQuery();

            if (rs.next() == true)
            {
                if (ts.getTime() - rs.getTimestamp(1).getTime() > 1000)
                {
                    System.out.println(rs.getTimestamp(1).getTime() + " - " + ts.getTime()
                                       + " Po tova Sravnenie promenqmam Last Edit TIme na File-a");
                    PreparedStatement prep = connection.prepareStatement("UPDATE tfiles SET cLastAdded=? WHERE cFileName = ? ");
                    prep.setString(2, name.getName());
                    ts = new java.sql.Timestamp(name.lastModified());

                    prep.setTimestamp(1, ts);

                    prep.executeUpdate();
                    return true;
                }
                else if (rs.getTimestamp(1).getTime() == name.lastModified())
                {
                    return false;
                }
            }
            else
            {

                PreparedStatement prep = connection.prepareStatement("INSERT INTO tfiles (cFileName , cLastAdded) VALUES (?,?)");
                prep.setString(1, name.getName());

                prep.setTimestamp(2, ts);

                prep.executeUpdate();
                return true;
            }
        }
        catch (SQLException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;

    }
}
