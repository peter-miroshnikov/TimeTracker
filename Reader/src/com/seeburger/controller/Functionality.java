package com.seeburger.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;

import org.joda.time.DateTime;
import org.joda.time.IllegalFieldValueException;

import com.seeburger.model.EmployeeHolder;
import com.seeburger.model.EmployeeList;
import com.seeburger.model.EmployeeStatisticHolder;
import com.seeburger.model.MyLogger;
import com.seeburger.model.ObjectFactory;
import com.seeburger.model.Statistic;
import com.seeburger.model.EmployeeList.Employee;
import com.seeburger.model.EmployeeList.Employee.EnterDateList;
import com.seeburger.model.EmployeeList.Employee.ExitDateList;
import com.seeburger.model.EmployeeList.Employee.EnterDateList.Enter;
import com.seeburger.model.EmployeeList.Employee.ExitDateList.Exit;


public class Functionality
{
    // CHANGED
    public DateTime getWorkedForTheDay(String name, int day, int month, int year)
    {
        return EmployeeStatisticHolder.getInstance().getWorkedForDayTime(name, day, month);

    }


    // Employee Holder Classes
    public DateTime getWorkedForTheMounth(String name, int month, int year)
    {
        int h = 0, m = 0, s = 0, d = 1;
        if (month > 13)
        {
            return null;
        }
        else if (year != 2008)
        {
            return null;
        }

        for (int n = 0; n < 31; n++)
        {

            try
            {
                if (EmployeeStatisticHolder.getInstance().getWorkedForDayTime(name, n, month) != null)
                {
                    h += EmployeeStatisticHolder.getInstance().getWorkedForDayTime(name, n, month)

                    .getHourOfDay();
                    m += EmployeeStatisticHolder.getInstance().getWorkedForDayTime(name, n, month)

                    .getMinuteOfHour();
                    s += EmployeeStatisticHolder.getInstance().getWorkedForDayTime(name, n, month)

                    .getSecondOfMinute();
                }
            }
            catch (NullPointerException e)
            {
                // XXX
            }
        }

        int[] temp = Convertors.getTheTime(1, d, h, m, s);

        return new DateTime(year, temp[0], temp[1], temp[2], temp[3], temp[4]);
    }


    public DateTime getWorkedForTheYear(String name, int year)
    {

        int h = 0, m = 0, s = 0, d = 1;

        for (int i = 0; i < 12; i++)
        {
            for (int n = 0; n < 31; n++)
            {
                try
                {
                    if (EmployeeStatisticHolder.getInstance().getWorkedForDayTime(name, n, i) != null)
                    {

                        h += EmployeeStatisticHolder.getInstance()
                                                    .getWorkedForDayTime(name, n, i)
                                                    .getHourOfDay();
                        m += EmployeeStatisticHolder.getInstance()
                                                    .getWorkedForDayTime(name, n, i)
                                                    .getMinuteOfHour();
                        s += EmployeeStatisticHolder.getInstance()
                                                    .getWorkedForDayTime(name, n, i)
                                                    .getSecondOfMinute();

                    }
                }
                catch (NullPointerException e)
                {
                    // XXX
                }
            }

        }

        int[] temp = Convertors.getTheTime(1, d, h, m, s);

        return new DateTime(year, temp[0], temp[1], temp[2], temp[3], temp[4]);
    }


    public DateTime getAVGYear(String name, int year)
    {
        int c = 0;

        int h = 0, m = 0, s = 0;
        for (int n = 0; n < 12; n++)
        {
            for (int i = 0; i < 31; i++)
            {
                try
                {
                    if (EmployeeStatisticHolder.getInstance().getWorkedForDayTime(name, i, m) != null)

                    {
                        c++;
                        h += EmployeeStatisticHolder.getInstance()
                                                    .getWorkedForDayTime(name, n, i)
                                                    .getHourOfDay();
                        m += EmployeeStatisticHolder.getInstance()
                                                    .getWorkedForDayTime(name, n, i)
                                                    .getMinuteOfHour();
                        s += EmployeeStatisticHolder.getInstance()
                                                    .getWorkedForDayTime(name, n, i)
                                                    .getSecondOfMinute();
                    }
                }
                catch (NullPointerException e)
                {
                    // XXX
                }
            }
        }
        int[] temp = Convertors.getTheTimeND(h, m, s);
        if (c > 0)
        {
            return new DateTime(year, 1, 1, temp[1] / c, temp[2] / c, temp[3]);
        }
        else
        {
            return new DateTime(year, 1, 1, temp[1], temp[2], temp[3]);
        }
    }


    public DateTime getAVGMounth(String name, int month, int year)
    {
        int c = 0;

        int h = 0, m = 0, s = 0, d = 1;
        for (int i = 0; i < 31; i++)
        {
            try
            {

                if (EmployeeStatisticHolder.getInstance().getWorkedForDayTime(name, i, m) != null)
                {
                    c++;
                    h += EmployeeStatisticHolder.getInstance()
                                                .getWorkedForDayTime(name, i, month)
                                                .getHourOfDay();
                    m += EmployeeStatisticHolder.getInstance()
                                                .getWorkedForDayTime(name, i, month)
                                                .getMinuteOfHour();
                    s += EmployeeStatisticHolder.getInstance()
                                                .getWorkedForDayTime(name, i, month)
                                                .getSecondOfMinute();
                }
            }
            catch (NullPointerException e)
            {
                // XXX
            }
        }
        int[] temp = Convertors.getTheTime(1, d, h, m, s);
        return new DateTime(year, temp[0], temp[1] / c, temp[2] / c, temp[3] / c, temp[4]);
    }


    public String[] getTopWokers()
    {

        String[] temp = new String[3];

        Iterator it = EmployeeStatisticHolder.getInstance().getTheMap().entrySet().iterator();
        while (it.hasNext())
        {
            Map.Entry pairs = (Map.Entry)it.next();

            for (int i = 0; i < 3; i++)
            {
                if (temp[i] == null)
                {
                    temp[i] = (String)pairs.getKey();
                    break;
                }

                if (getWorkedForTheYear(temp[i], 2008).getDayOfMonth() < getWorkedForTheYear((String)pairs.getKey(),
                                                                                             2008).getDayOfMonth())
                {
                    temp[i] = (String)pairs.getKey();
                    break;
                }
                else if (getWorkedForTheYear(temp[i], 2008).getDayOfMonth() == getWorkedForTheYear((String)pairs.getKey(),
                                                                                                   2008).getDayOfMonth()
                         && getWorkedForTheYear(temp[i], 2008).getHourOfDay() < getWorkedForTheYear((String)pairs.getKey(),
                                                                                                    2008).getHourOfDay())
                {
                    temp[i] = (String)pairs.getKey();
                    break;
                }
            }
        }

        return temp;
    }


    public String[] getWorstWokers()
    {

        String[] temp = new String[3];
        Iterator it = EmployeeStatisticHolder.getInstance().getTheMap().entrySet().iterator();
        int counter = 0;
        while (it.hasNext())
        {

            Map.Entry pairs = (Map.Entry)it.next();

            for (int i = 0; i < 3; i++)
            {

                if (temp[i] == null)
                {

                    temp[i] = (String)pairs.getKey();
                    break;
                }

                if (getWorkedForTheYear(temp[i], 2008).getDayOfMonth() > getWorkedForTheYear((String)pairs.getKey(),
                                                                                             2008).getDayOfMonth())
                {
                    temp[i] = (String)pairs.getKey();
                    break;
                }
                else if (getWorkedForTheYear(temp[i], 2008).getDayOfMonth() == getWorkedForTheYear((String)pairs.getKey(),
                                                                                                   2008).getDayOfMonth()
                         && getWorkedForTheYear(temp[i], 2008).getHourOfDay() > getWorkedForTheYear((String)pairs.getKey(),
                                                                                                    2008).getHourOfDay())
                {
                    temp[i] = (String)pairs.getKey();
                    break;
                }
            }
        }

        return temp;
    }


    public void sortEnterDateList()
    {
        ObjectFactory fac = new ObjectFactory();
        int size = 0;
        int town = -1;
        for (int emp = 0; emp < EmployeeHolder.getInstance().getSize(); emp++)
        {
            MyLogger.getInstance()
                    .getLogger()
                    .log(Level.FINEST,
                         "Sorting the Enter Date's for person :"
                                         + EmployeeHolder.getInstance()
                                                         .getEmployeeByNumberInTheArray(emp)
                                                         .getEmployeeInfo()
                                                         .getName());

            if (EmployeeHolder.getInstance().getEmployeeByNumberInTheArray(emp).getEnterDateList() != null)
            {
                size = EmployeeHolder.getInstance()
                                     .getEmployeeByNumberInTheArray(emp)
                                     .getEnterDateList()
                                     .getEnter()
                                     .size();
                town = EmployeeHolder.getInstance().getEmployeeByNumberInTheArray(emp).getEnterDateList().getEnter().get(0).getFloor();
                EmployeeList.Employee.EnterDateList list = EmployeeHolder.getInstance()
                                                                         .getEmployeeByNumberInTheArray(emp)
                                                                         .getEnterDateList();
                DateTime[] temp2 = new DateTime[size];

                for (int i = 0; i < list.getEnter().size(); i++)
                {
                    try
                    {
                        temp2[i] = Convertors.getTimeFromString(list.getEnter().get(i).getEnterDate());

                    }
                    catch (NumberFormatException e)
                    {
                        temp2[i] = Convertors.getTimeFromString(list.getEnter().get(i).getEnterDate());
                    }
                }

                Convertors.sortDateTime(temp2);

                EmployeeHolder.getInstance()
                              .getEmployeeByNumberInTheArray(emp)
                              .setEnterDateList(fac.createEmployeeListEmployeeEnterDateList());
                for (int n = 0; n < temp2.length; n++)
                {
                    Enter e = fac.createEmployeeListEmployeeEnterDateListEnter();
                    e.setEnterDate(temp2[n].toString());
                    e.setFloor(town);

                    EmployeeHolder.getInstance()
                                  .getEmployeeByNumberInTheArray(emp)
                                  .getEnterDateList()
                                  .getEnter()
                                  .add(e);
                }
            }
        }
    }


    public void sortExitDateList()
    {

        ObjectFactory fac = new ObjectFactory();
        for (int emp = 0; emp < EmployeeHolder.getInstance().getSize(); emp++)
        {
            MyLogger.getInstance()
                    .getLogger()
                    .log(Level.FINEST,
                         "Sorting the Exit Date's for person :"
                                         + EmployeeHolder.getInstance()
                                                         .getEmployeeByNumberInTheArray(emp)
                                                         .getEmployeeInfo()
                                                         .getName());
            if (EmployeeHolder.getInstance().getEmployeeByNumberInTheArray(emp).getExitDateList() != null)
            {

                int size = EmployeeHolder.getInstance()
                                         .getEmployeeByNumberInTheArray(emp)
                                         .getExitDateList()
                                         .getExit()
                                         .size();
                int     town = EmployeeHolder.getInstance().getEmployeeByNumberInTheArray(emp).getExitDateList().getExit().get(0).getFloor();
                EmployeeList.Employee.ExitDateList list = EmployeeHolder.getInstance()
                                                                        .getEmployeeByNumberInTheArray(emp)
                                                                        .getExitDateList();
                DateTime[] temp2 = new DateTime[size];

                for (int i = 0; i < list.getExit().size(); i++)
                {
                    temp2[i] = Convertors.getTimeFromString(list.getExit().get(i).getExitDate());
                }

                Convertors.sortDateTime(temp2);

                EmployeeHolder.getInstance()
                              .getEmployeeByNumberInTheArray(emp)
                              .setExitDateList(fac.createEmployeeListEmployeeExitDateList());
                for (int n = 0; n < temp2.length; n++)
                {
                    Exit e = fac.createEmployeeListEmployeeExitDateListExit();
                    e.setExitDate(temp2[n].toString());
                    e.setFloor(town);
                    EmployeeHolder.getInstance()
                                  .getEmployeeByNumberInTheArray(emp)
                                  .getExitDateList()
                                  .getExit()
                                  .add(e);
                }
            }
        }
    }


    public ArrayList<DateTime> getFilteredEnterDateList(int day, int month, int year, String name)
    {
        List<Enter> tempEnter = null;
        ArrayList<DateTime> tempEnterReasult = new ArrayList<DateTime>();
        DateTime tempDate = null;
        DateTime wantedDate = new DateTime(year, month, day, 1, 1, 1);
        try
        {
            tempEnter = EmployeeHolder.getInstance().getEmployeeByName(name).getEnterDateList().getEnter();

            for (int i = 0; i < tempEnter.size(); i++)
            {
                tempDate = Convertors.getTimeFromString(tempEnter.get(i).getEnterDate());
                if (isTheSameDayForTheFilterMethods(wantedDate, tempDate))
                {
                    tempEnterReasult.add(tempDate);
                }
            }
        }

        catch (NullPointerException e)
        {
            System.out.println(name
                               + " Does not have enter List's to Filter. =================================================================");
        }

        return tempEnterReasult;
    }


    public ArrayList<DateTime> getFilteredExitDateList(int day, int month, int year, String name)
    {
        List<Exit> tempExit = null;
        ArrayList<DateTime> tempExitReasult = new ArrayList<DateTime>();
        DateTime tempDate = null;
        DateTime wantedDate = new DateTime(year, month, day, 1, 1, 1);
        try
        {
            tempExit = EmployeeHolder.getInstance().getEmployeeByName(name).getExitDateList().getExit();

            for (int i = 0; i < tempExit.size(); i++)
            {
                tempDate = Convertors.getTimeFromString(tempExit.get(i).getExitDate());
                if (isTheSameDayForTheFilterMethods(wantedDate, tempDate))
                {
                    tempExitReasult.add(tempDate);
                }
            }
        }

        catch (NullPointerException e)
        {
            System.out.println(name
                               + " Does not have exit List's to Filter. =================================================================");
        }

        return tempExitReasult;
    }


    private boolean isTheSameDayForTheFilterMethods(DateTime wantedDate, DateTime tempDate)
    {
        // TODO Auto-generated method stub
        return tempDate.getYear() == wantedDate.getYear()
               && tempDate.getMonthOfYear() == wantedDate.getMonthOfYear()
               && tempDate.getDayOfMonth() == wantedDate.getDayOfMonth();
    }


    public ArrayList<String> getFilterdExitDateList(int day, int month, int year, String name)
    {
        return null;
    }


    /**
     * Fills the statistics in EmployeeStatisticHolder
     *
     * @param name- employee name
     */
    public static void calculateStatsTimeForEmployee(String name)
    {
        List<Enter> tempEnter = null;
        List<Exit> tempExit = null;
        try
        {
            tempEnter = EmployeeHolder.getInstance().getEmployeeByName(name).getEnterDateList().getEnter();
            tempExit = EmployeeHolder.getInstance().getEmployeeByName(name).getExitDateList().getExit();
        }
        catch (NullPointerException e)
        {
            System.out.println(name
                               + " Does not have enter or exit List's =================================================================");
        }
        DateTime[][] tempStats = new DateTime[55][7];
        if (name.equals("Christo Teliatinov "))
        {
            System.out.println();
        }
        int dayCounter;
        setWorkingDayStartTime(tempEnter, tempStats);

        dayCounter = setWorkingDayEndTime(name, tempExit, tempStats);

        setLbStartTime(tempExit, tempStats);

        setLbEndTime(tempEnter, tempStats);

        calculateDifferences(name, tempStats, dayCounter);

        ArrayList<Statistic> al = new ArrayList<Statistic>();
        Statistic sh;
        System.out.println("Seting the Stats  for : " + name);
        for (int i = 0; i < tempStats.length; i++)
        {
            sh = new Statistic();
            sh.setDay(tempStats[i][0]);
            sh.setDayStart(tempStats[i][1]);
            sh.setDayEnd(tempStats[i][2]);
            sh.setDayDifference(tempStats[i][3]);
            sh.setLbStart(tempStats[i][4]);
            sh.setLbEnd(tempStats[i][5]);
            sh.setLbDifference(tempStats[i][6]);

            al.add(sh);

        }

        EmployeeStatisticHolder.getInstance().add(name, al);
    }


    private static void setWorkingDayStartTime(List<Enter> tempEnter, DateTime[][] tempStats)
    {
        int dayCounter = 0;

        DateTime tempDate = null;
        DateTime tempDate2 = new DateTime(2013, 1, 1, 0, 0);
        try
        {
            for (int i = 0; i < tempEnter.size(); i++)
            {

                tempDate = Convertors.getTimeFromString(tempEnter.get(i).getEnterDate());

                if (isNewDay(tempDate2, tempDate)&&tempDate.getHourOfDay()>6||(i==0&&tempDate.getDayOfMonth()==1))
                {

                    tempDate2 = tempDate;

                    tempStats[dayCounter][0] = tempDate;
                    tempStats[dayCounter][1] = tempDate;
                    dayCounter++;
                }

            }
        }
        catch (NullPointerException e)
        {
            System.out.println("This Emplyee  Does not have Enter Date List");
        }
    }


    private static int setWorkingDayEndTime(String name, List<Exit> tempExit, DateTime[][] tempStats)
    {
        int dayCounter;
        DateTime tempDate;
        DateTime tempDate2;
        dayCounter = 0;
        try
        {
            tempDate2 = Convertors.getTimeFromString(tempExit.get(0).getExitDate());

            for (int i = 0; i < tempExit.size(); i++)
            {

                tempDate = Convertors.getTimeFromString(tempExit.get(i).getExitDate());
                if (i > 0)
                {
                    tempDate2 = Convertors.getTimeFromString(tempExit.get(i - 1).getExitDate());
                }
                if (name.equals("Nikola Todorov ")&& dayCounter==16)
                {
                    System.out.println();
                }
                // Find a way to workout the Night Shifts
                if (isNewDay(tempDate2, tempDate))
                {



                    if (isTheSameDay(tempStats, dayCounter, tempDate2))
                    {

                        tempStats[dayCounter][2] = tempDate2;

                        dayCounter++;
                    }
                    else if (isNightShift(tempStats[dayCounter][1], tempDate2))
                    {
                        tempStats[dayCounter][2] = tempDate2;
                        dayCounter++;
                    }

                }
                // Tuka trqbva da se dobavi statement koito da glasi
                // Ako Nachaloto na Rabotniq den za opredelena data e otbelqzan sled 16:00 to kraq na rabotniq
                // den se tarsi na sledvashtata data predi 12:00
                // tova predpolaga poqvata na bugove koito shte trqbva da budat ichisteni v processa.

                if (i == tempExit.size() - 1)
                {
                    tempStats[dayCounter][2] = tempDate;
                }

            }
            while (dayCounter < tempExit.size())
            {
                tempStats[dayCounter][2] = new DateTime(tempStats[dayCounter][0].getYear(),
                                                        tempStats[dayCounter][0].getMonthOfYear(),
                                                        tempStats[dayCounter][0].getDayOfMonth(),
                                                        23,
                                                        0);
                dayCounter++;
            }
        }
        catch (NullPointerException e)
        {
            System.out.println("This Employee Does Not Have Exit Date List.");
        }

        return dayCounter;
    }


    private static boolean isNightShift(DateTime dateTime , DateTime dateTime2)
    {
        // TODO Auto-generated method stub
        return dateTime.getHourOfDay() > 16 && dateTime2.getDayOfMonth() - dateTime.getDayOfMonth()==1;
    }


    private static void setLbEndTime(List<Enter> tempEnter, DateTime[][] tempStats)
    {
        DateTime tempDate;

        try
        {
            for (int i = 0; i < tempEnter.size(); i++)
            {
                tempDate = Convertors.getTimeFromString(tempEnter.get(i).getEnterDate());

                for (int n = 0; n < tempStats.length; n++)
                {
                    if (tempStats[n][0] != null && isTheSameDay(tempStats, n, tempDate))
                    {

                        if (tempStats[n][5] == null || tempStats[n][5].getMillis() < tempDate.getMillis()
                            && isBreakEndTime(tempDate))
                        {

                            tempStats[n][5] = tempDate;

                        }

                    }

                }

            }
        }
        catch (NullPointerException e)
        {
            System.out.println("This Employee Does Not Have Enter Date List");
        }
    }


    private static void setLbStartTime(List<Exit> tempExit, DateTime[][] tempStats)
    {
        DateTime tempDate;
        try
        {
            for (int i = 0; i < tempExit.size(); i++)
            {
                tempDate = Convertors.getTimeFromString(tempExit.get(i).getExitDate());

                for (int n = 0; n < tempStats.length; n++)
                {
                    if (tempStats[n][0] != null && isTheSameDay(tempStats, n, tempDate))
                    {
                        if (isBreakTime(tempDate))
                        {
                            if (tempStats[n][4] == null || tempStats[n][4].getMillis() > tempDate.getMillis())
                            {
                                tempStats[n][4] = tempDate;
                                break;
                            }
                        }
                        else
                        {
                            break;
                        }

                    }

                }

            }
        }
        catch (NullPointerException e)
        {
            System.out.println("This Employee Does Not Have Exit date List.");
        }
    }


    private static void calculateDifferences(String name, DateTime[][] tempStats, int dayCounter)
    {
        for (int i = 0; i <= dayCounter; i++)
        {
            long diffsec;
            long diffmin;
            long diffH;
            long diff;
            // Nachalo na Izchislenie na Rabotniq Den
            if (tempStats[i][2] != null && tempStats[i][1] != null
                && (tempStats[i][2].getMillis() > tempStats[i][1].getMillis()))
            {

                diff = tempStats[i][2].getMillis() - tempStats[i][1].getMillis();

                diffsec = diff / 1000 % 60;
                diffmin = diff / (60 * 1000) % 60;
                diffH = diff / (60 * 60 * 1000);
                try
                {
                    tempStats[i][3] = new DateTime(tempStats[i][0].getYear(),
                                                   tempStats[i][0].getMonthOfYear(),
                                                   tempStats[i][0].getDayOfMonth(),
                                                   (int)diffH,
                                                   (int)diffmin,
                                                   (int)diffsec);
                }
                catch (IllegalFieldValueException e)
                {
                    System.out.println(name + " --------------------------------- ");
                }
            }
            diff = 0;
            diffsec = 0;
            diffmin = 0;
            diffH = 0;

            // Nachalo na izchislenie na poChivkite !
            if (tempStats[i][5] != null && tempStats[i][4] != null
                && tempStats[i][5].getMillis() > tempStats[i][4].getMillis())
            {

                diff = tempStats[i][5].getMillis() - tempStats[i][4].getMillis();
                diffsec = diff / 1000 % 60;
                diffmin = diff / (60 * 1000) % 60;
                diffH = diff / (60 * 60 * 1000);
            }
            if (tempStats[i][0] != null)
            {
                tempStats[i][6] = new DateTime(tempStats[i][0].getYear(),
                                               tempStats[i][0].getMonthOfYear(),
                                               tempStats[i][0].getDayOfMonth(),
                                               (int)diffH,
                                               (int)diffmin,
                                               (int)diffsec);
            }
        }
    }


    private static boolean isBreakEndTime(DateTime tempDate)
    {
        return tempDate.getHourOfDay() >= 12 && tempDate.getHourOfDay() < 15;
    }


    private static boolean isTheSameDay(DateTime[][] tempStats, int dayCounter, DateTime tempDate2)
    {
        return tempStats[dayCounter][0].getDayOfMonth() == tempDate2.getDayOfMonth()
               && tempStats[dayCounter][0].getMonthOfYear() == tempDate2.getMonthOfYear()
               && tempStats[dayCounter][0].getYear() == tempDate2.getYear();
    }


    private static boolean isNewDay(DateTime tempDate2, DateTime tempDate)
    {

        return tempDate.getDayOfMonth() > tempDate2.getDayOfMonth()
               || (tempDate.getMonthOfYear() > tempDate2.getMonthOfYear() && tempDate.getDayOfMonth() < tempDate2.getDayOfMonth())
               || (tempDate.getMonthOfYear() < tempDate2.getMonthOfYear() && tempDate.getYear() > tempDate2.getYear());
    }


    private static boolean isBreakTime(DateTime tempDate)
    {
        return (tempDate.getHourOfDay() == 11 && tempDate.getMinuteOfHour() >= 30)
               || (tempDate.getHourOfDay() == 12 && tempDate.getMinuteOfHour() <= 59)
               || (tempDate.getHourOfDay() == 13 && tempDate.getMinuteOfHour() <= 30);
    }
}
