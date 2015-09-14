/*
 * Search.java
 *
 * created at Jul 23, 2013 by p.miroshnikov <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.seeburger.controller;


import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import com.seeburger.model.EmployeeHolder;


public class Search
{
    private Pattern pattern;
    private Matcher matcher;


    public Search()
    {

    }


    public ArrayList<String> search(String args)
    {
        int choice = 1;
        String tempS;
        ArrayList<String> temp = new ArrayList<String>();
        switch (choice)
        {
            case 1:
                tempS = args + "[a-z]*\\s[A-Z][a-z]+";

                pattern = Pattern.compile(tempS);
                String tempName;

                for (int i = 0; i < EmployeeHolder.getInstance().getSize(); i++)
                {
                    tempName = EmployeeHolder.getInstance()
                                             .getEmployeeByNumberInTheArray(i)
                                             .getEmployeeInfo()
                                             .getName();
                    matcher = pattern.matcher(tempName);

                    if (matcher.find())
                    {
                        temp.add(tempName);
                    }
                }
                if (!temp.isEmpty())
                {
                    break;
                }

            case 2:
                tempS = "^[A-Z]" + args + "[a-z]*\\s[A-Z][a-z]+";
                pattern = Pattern.compile(tempS);
                for (int i = 0; i < EmployeeHolder.getInstance().getSize(); i++)
                {
                    tempName = EmployeeHolder.getInstance()
                                             .getEmployeeByNumberInTheArray(i)
                                             .getEmployeeInfo()
                                             .getName();
                    matcher = pattern.matcher(tempName);

                    if (matcher.find())
                    {
                        temp.add(tempName);
                    }
                }
                if (!temp.isEmpty())
                {
                    break;

                }
                choice = 3;
            case 3:
                tempS = "^[A-Z][a-z]+\\s"+args+"[a-z]*";
                pattern = Pattern.compile(tempS);

                for (int i = 0; i < EmployeeHolder.getInstance().getSize(); i++)
                {
                    tempName = EmployeeHolder.getInstance()
                                             .getEmployeeByNumberInTheArray(i)
                                             .getEmployeeInfo()
                                             .getName();

                    matcher = pattern.matcher(tempName);

                    if (matcher.find())
                    {

                        temp.add(tempName);
                    }
                }
                if (!temp.isEmpty())
                {
                    break;
                }
                choice = 4;
            case 4:
                String tempArgs = args + " ";
                for (int i = 0; i < EmployeeHolder.getInstance().getSize(); i++)
                {
                    tempName = EmployeeHolder.getInstance()
                                             .getEmployeeByNumberInTheArray(i)
                                             .getEmployeeInfo()
                                             .getName();

                    if(tempArgs.equals(tempName))
                    {
                        temp.add(tempName);
                    }
                }


                if(!temp.isEmpty())
                {
                    break;
                }

        }
        if(temp.isEmpty())
        {
            temp.add("We found nothing");
        }
        return temp;
    }

}
