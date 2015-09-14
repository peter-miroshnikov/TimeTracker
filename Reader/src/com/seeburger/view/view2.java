/*
 * view2.java
 *
 * created at Jul 23, 2013 by p.miroshnikov <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.seeburger.view;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import org.joda.time.DateTime;

import com.seeburger.controller.Controller;
import com.seeburger.controller.ObjectToXmlConvertor;
import com.seeburger.model.EmployeeHolder;
import com.seeburger.model.EmployeeStatisticHolder;
import com.seeburger.model.Statistic;


public class view2
{

    private Controller con;
    private Scanner keyboard;


    public view2(Controller con)
    {
        this.con = con;
        this.keyboard = new Scanner(System.in);

        start();
    }


    public void start()
    {
        String tempName;
        DateTime tempDay;
        DateTime tempDayDiff;
        DateTime tempLbDiff = null;
        ArrayList<Statistic> tempDateTime = null;
        boolean found = false;
//        for (int i = 0; i < EmployeeHolder.getInstance().getSize(); i++)
//        {
//            System.out.println(i
//                               + ") "
//                               + EmployeeHolder.getInstance()
//                                               .getEmployeeByNumberInTheArray(i)
//                                               .getEmployeeInfo()
//                                               .getName());
//            // Tova go polzvam da init vsichki employees za sega ........
//            // TODO Find a better way
//            tempDateTime = EmployeeStatisticHolder.getInstance()
//                                                  .getValuesForEmployee(EmployeeHolder.getInstance()
//                                                                                      .getEmployeeByNumberInTheArray(i)
//                                                                                      .getEmployeeInfo()
//                                                                                      .getName());
//        }
        System.out.println("Marshalvam");
      ObjectToXmlConvertor.write(EmployeeHolder.getInstance().getEmployeeList());
      con.transformXmlToHtml("nosferatu.xml");
        while (true)
        {

            tempDateTime = null;
            System.out.println("Please type in one of the Names listed above.");
            System.out.println("If you want Information for all the Employees please type in  STATS with capital letters");
            while (keyboard.hasNextInt())
            {
                keyboard.next();
                System.out.println("Please Enter a String not Number");
            }
            tempName = keyboard.nextLine();
            if(tempName.equals("END"))
            {
                System.out.println("Bai Bai Bai");
                break;
            }
            if (tempName.equals("STATS"))
            {

                for (int i = 0; i < EmployeeHolder.getInstance().getSize(); i++)
                {

                    tempName = EmployeeHolder.getInstance()
                                             .getEmployeeByNumberInTheArray(i)
                                             .getEmployeeInfo()
                                             .getName();
                    String lbreak;
                    for (int m = 0; m < 12; m++)
                    {
                        for (int n = 0; n < 31; n++)
                        {
                            if (con.getWorkedForTheDay(tempName, n, m, 2008) != null)
                            {
                                tempDay = con.getWorkedForTheDay(tempName, n, m, 2008);
                                tempDayDiff = con.getWorkedForTheDay(tempName, n, m, 2008);
                                if (con.getLunchBreak(tempName, n, m, 2008) == null)
                                {
                                    lbreak = " The persons Did not Left the Building for a Launch Break";
                                }
                                else
                                {
                                    tempLbDiff = con.getLunchBreak(tempName, n, m, 2008);
                                }
                                System.out.println(tempName + " | For Date : " + tempDay.getDayOfMonth()
                                                   + "/" + tempDay.getMonthOfYear() + "/" + tempDay.getYear()
                                                   + " Working Hours :" + tempDayDiff.getHourOfDay() + ":"
                                                   + tempDayDiff.getMinuteOfHour() + ":"
                                                   + tempDayDiff.getSecondOfMinute() + " | Lunch Break : "
                                                   + tempLbDiff.getHourOfDay() + ":"
                                                   + tempLbDiff.getMinuteOfHour() + ":"
                                                   + tempLbDiff.getSecondOfMinute());
                            }
                        }

                    }

                }
                System.out.println("========================================================");
                System.out.println(" TOP Workers ");

                System.out.println(con.getTopWorkers()[0] + " , " + con.getTopWorkers()[1] + " , "
                                   + con.getTopWorkers()[2]);
                System.out.println("========================================================");
                System.out.println(" Worst Workers ");

                System.out.println(con.getWorstWokers()[0] + " , " + con.getWorstWokers()[1] + " , "
                                   + con.getWorstWokers()[2]);
                System.out.println("========================================================");

            }
            else
            {
                ArrayList<String> tempArrayList = con.search(tempName);

                if (tempArrayList.size() == 1 && !tempArrayList.get(0).equals("We found nothing"))
                {
                    tempName = tempArrayList.get(0);
                    System.out.println(tempName);
                    tempDateTime = EmployeeStatisticHolder.getInstance().getValuesForEmployee(tempName);

                    for (int i = 0; i < tempArrayList.size(); i++)
                    {
                        try
                        {
                            for (int n = 0; n < tempDateTime.size(); n++)
                            {

                                if (tempDateTime.get(n).getDay() != null)
                                {
                                    tempDay = tempDateTime.get(n).getDay();
                                    tempDayDiff = tempDateTime.get(n).getDayDifference();
                                    tempLbDiff = tempDateTime.get(n).getLbDifference();
                                    System.out.println(tempDay.getDayOfMonth() + "/"
                                                       + tempDay.getMonthOfYear() + "/" + tempDay.getYear()
                                                       + " total Working hours : "
                                                       + tempDayDiff.getHourOfDay() + ":"
                                                       + tempDayDiff.getMinuteOfHour() + ":"
                                                       + tempDayDiff.getSecondOfMinute()
                                                       + " With Lunch break of : "
                                                       + tempLbDiff.getHourOfDay() + ":"
                                                       + tempLbDiff.getMinuteOfHour() + ":"
                                                       + tempLbDiff.getSecondOfMinute());
                                }

                            }
                        }
                        catch (NullPointerException e)
                        {
                            // XXX
                        }
                    }
                }
                else
                {
                    System.out.println("Please write the Full name as it apears on the screen");
                    for (int i = 0; i < tempArrayList.size(); i++)
                    {
                        System.out.println(tempArrayList.get(i));
                    }
                }
            }

        }

    }

}
