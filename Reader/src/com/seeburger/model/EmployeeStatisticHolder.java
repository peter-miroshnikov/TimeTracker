/*
 * EmployeeStatisticHolder.java
 *
 * created at Jul 22, 2013 by p.miroshnikov <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.seeburger.model;


import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.transform.Templates;

import org.joda.time.DateTime;

import com.seeburger.controller.Functionality;


public class EmployeeStatisticHolder
{

    private HashMap<String, ArrayList<Statistic>> hm;
    private static EmployeeStatisticHolder sh;


    private EmployeeStatisticHolder()
    {
        hm = new HashMap<String, ArrayList<Statistic>>();
    }


    public static EmployeeStatisticHolder getInstance()
    {
        if (sh == null)
        {
            sh = new EmployeeStatisticHolder();
        }
        return sh;
    }


    public boolean add(String key, ArrayList<Statistic> values)
    {

        hm.put(key, values);
        return false;
    }


    public ArrayList<Statistic> getValuesForEmployee(String key)
    {
        if (hm.get(key) == null)
        {
            Functionality.calculateStatsTimeForEmployee(key);
        }
        return hm.get(key);
    }


    public int getWorkingDays(String key)
    {
        int counter = 0;
        if (hm.get(key) == null)
        {
            Functionality.calculateStatsTimeForEmployee(key);
        }

        return hm.get(key).size();
    }


    public DateTime getWorkedForDayTime(String key, int day, int month)
    {
        if (hm.get(key) == null)
        {
            Functionality.calculateStatsTimeForEmployee(key);
        }

        ArrayList<Statistic> temp = hm.get(key);

        for (int i = 0; i < temp.size(); i++)
        {
            try
            {
                if (temp.get(i) != null && temp.get(i).getDay().getDayOfMonth() == day
                    && temp.get(i).getDay().getMonthOfYear() == month)
                {

                    return temp.get(i).getDayDifference();
                }
            }
            catch (NullPointerException e)
            {
                // XXX
            }
        }

        return null;
    }


    public int getSize()
    {
        return hm.size();
    }


    public HashMap getTheMap()
    {
        return hm;
    }


    public DateTime getLunchBreak(String key, int day, int month)
    {
        if (hm.get(key) == null)
        {
            Functionality.calculateStatsTimeForEmployee(key);
        }
        ArrayList<Statistic> temp = hm.get(key);
        for (int i = 0; i < temp.size(); i++)
        {
            if (temp.get(i).getLbDifference() != null && temp.get(i).getDay().getDayOfMonth() == day
                && temp.get(i).getDay().getMonthOfYear() == month)
            {
                return temp.get(i).getLbDifference();
            }
        }

        return null;
    }

}
