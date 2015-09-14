/*
 * StatisticHolder.java
 *
 * created at Jul 23, 2013 by p.miroshnikov <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.seeburger.model;


import org.joda.time.DateTime;


public class Statistic
{
    DateTime day;
    DateTime dayStart;
    DateTime dayEnd;
    DateTime lbStart;
    DateTime lbEnd;
    DateTime dayDiff;
    DateTime lbDiff;


    public Statistic()
    {
        dayStart = null;
        dayEnd = null;
        dayDiff = null;
        lbStart = null;
        lbEnd = null;
        lbDiff = null;
        day = null;
    }

    public void setDay(DateTime arg)
    {
        day = arg;

    }
    public boolean setDayStart(DateTime arg)
    {
        dayStart = arg;
        return true;
    }

    public boolean setDayEnd(DateTime arg)
    {
        dayEnd = arg;
        return true;
    }
    public boolean setDayDifference(DateTime arg)
    {
        dayDiff = arg;
        return true;

    }

    public boolean setLbStart(DateTime arg)
    {

        lbStart = arg;
        return true;
    }

    public boolean setLbEnd(DateTime arg)
    {
        lbEnd = arg;
        return true;
    }

    public boolean setLbDifference(DateTime arg)
    {
        lbDiff = arg;
        return true;
    }

    public DateTime getDayDifference()
    {
        return dayDiff;
    }
    public DateTime getLbDifference()
    {
        try{
        return lbDiff;
        }catch(NullPointerException e)
        {
            e.printStackTrace();
        }
        return new DateTime(day.getYear(),day.getMonthOfYear(),day.getDayOfMonth(),0,0,0);
    }

    public DateTime getDay()
    {
        return day;
    }



}
