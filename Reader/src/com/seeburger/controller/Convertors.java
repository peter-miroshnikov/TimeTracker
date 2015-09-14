package com.seeburger.controller;


import java.util.Date;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import org.joda.time.DateTime;


public class Convertors
{

    public static DateTime getTimeFromString(String time)
    {
        DateTime dt;
        StringTokenizer tok = new StringTokenizer(time, "/: ");
        try
        {
            int day = Integer.parseInt(tok.nextToken());
            int month = Integer.parseInt(tok.nextToken());
            int year = Integer.parseInt(tok.nextToken());
            int hour = Integer.parseInt(tok.nextToken());
            int minutes = Integer.parseInt(tok.nextToken());
            int seconds = Integer.parseInt(tok.nextToken());

            dt = new DateTime(year, month, day, hour, minutes, seconds);
        }
        catch (NumberFormatException e)
        {
            return getTimeFromStringVersionTwo(time);
        }
        return dt;
    }


    public static DateTime getTimeFromStringVersionTwo(String time)
    {

        StringTokenizer tok = new StringTokenizer(time, "-T:. ");

        int year = Integer.parseInt(tok.nextToken());
        int month = Integer.parseInt(tok.nextToken());
        int day = Integer.parseInt(tok.nextToken());
        int hour = Integer.parseInt(tok.nextToken());
        int minutes = Integer.parseInt(tok.nextToken());
        int seconds = Integer.parseInt(tok.nextToken());
        DateTime dt = new DateTime(year, month, day, hour, minutes, seconds);

        return dt;
    }

    public static DateTime getTimeFromStringForTheViewClass(String time)
    {
        StringTokenizer tok = new StringTokenizer(time , "/ ");
        int day = Integer.parseInt(tok.nextToken());
        int month = Integer.parseInt(tok.nextToken());
        int year = Integer.parseInt(tok.nextToken());


        return new DateTime(year,month,day,1,1,1);
    }

    public int getYear(Date date)
    {
        long temp = date.getTime();

        long diffYear = temp / (1000 * 60 * 60 * 24 * 30) % 365;

        return (int)diffYear;
    }


    public String getNameOnly(String name)
    {
        StringTokenizer tok = new StringTokenizer(name, "()");

        return tok.nextToken();
    }

    public String[] getFirstLastName(String name)
    {
        String[] temp = new String[2];
        StringTokenizer tok = new StringTokenizer(name , " ");
        temp[0] = tok.nextToken();
        try{
        temp[1] = tok.nextToken();
        }catch(NoSuchElementException e)
        {
            temp[1] = "test";
        }
        return temp;
    }

    public int[] getIdOnly(String string)
    {

        int[] temp = new int[2];
        StringTokenizer tok = new StringTokenizer(string, "(:)");
        tok.nextToken();
        temp[0] = Integer.parseInt(tok.nextToken());
        temp[1] = Integer.parseInt(tok.nextToken());

        return temp;
    }


    public String getEnterOrExitStatus(String args)
    {

        StringTokenizer tok = new StringTokenizer(args, " ");
        return tok.nextToken();
    }


    public static int[] getTheTime(int mo, int d, int h, int m, int s)
    {

        int tempVal;
        int[] temp = new int[5];
        if (s >= 60)
        {
            tempVal = s % 60;
            m += (s - tempVal) / 60;
            temp[4] = tempVal;
        }
        else if (s < 60)
        {
            temp[4] = s;
        }
        if (m >= 60)
        {
            tempVal = m % 60;
            h += (m - tempVal) / 60;
            temp[3] = tempVal;
        }
        else if (m < 60)
        {
            temp[3] = m;
        }
        if (h >= 8)
        {
            tempVal = h % 8;
            d += (h - tempVal) / 8;

            temp[2] = tempVal;
        }
        else if (h < 8)
        {
            temp[2] = h;
        }

        if (d >= 30)
        {
            tempVal = d % 30;
            mo += (d - tempVal) / 30;
            temp[1] = tempVal;
        }
        else if (d < 30)

        {
            temp[1] = d;
        }

        if (temp[1] == 0)
        {
            temp[1] = 1;
        }

        if (temp[0] == 0)
        {
            mo = 1;
        }

        temp[0] = mo;

        return temp;
    }


    public static int[] getTheTimeND(int h, int m, int s)
    {
        int tempVal;
        int[] temp = new int[4];
        if (s >= 60)
        {
            tempVal = s % 60;
            m += (s - tempVal) / 60;
            temp[3] = tempVal;
        }
        else if (s < 60)
        {
            temp[3] = s;
        }
        if (m >= 60)
        {
            tempVal = m % 60;
            h += (m - tempVal) / 60;
            temp[2] = tempVal;
        }
        else if (m < 60)
        {
            temp[2] = m;
        }
        temp[1] = h;

        return temp;
    }


    public static void sortDateTime(DateTime[] dt)
    {

        int n = dt.length;
        for (int pass = 1; pass < n; pass++)
        { // count how many times
          // This next loop becomes shorter and shorter
            for (int i = 0; i < n - pass; i++)
            {
                if (dt[i].getMillis() > dt[i + 1].getMillis())
                {
                    // exchange elements
                    DateTime temp = dt[i];
                    dt[i] = dt[i + 1];
                    dt[i + 1] = temp;
                }
            }
        }

    }
}
