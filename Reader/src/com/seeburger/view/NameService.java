package com.seeburger.view;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.seeburger.controller.Controller;
import com.seeburger.model.EmployeeHolder;
import com.seeburger.model.EmployeeList.Employee;
import com.seeburger.model.EmployeeStatisticHolder;


/*
 * NameService.java
 *
 * created at Jul 26, 2013 by p.miroshnikov <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */

public class NameService
    implements CompletionService<String>
{
    private Pattern pattern;
    private Matcher matcher;
    private static List<String> data;


    public NameService(Controller con)
    {

        data = new ArrayList();
        if(EmployeeHolder.getInstance().getEmployeeList().getEmployee() == null)
        {
            // Load Employee List From DB
            //TODO
        }
        List<Employee> temp = EmployeeHolder.getInstance().getEmployeeList().getEmployee();
        for (int i = 0; i < temp.size(); i++)
        {
            data.add(temp.get(i).getEmployeeInfo().getName());
        }

    }


    public static String[] getList()
    {
        String[] stringArray = data.toArray(new String[data.size()]);
        System.out.println(data.size());
        return stringArray;
    }


    /** {@inheritDoc} */
    @Override
    public String toString()
    {
        StringBuilder b = new StringBuilder();
        for (String o : data)
        {
            b.append(o).append("\n");
        }
        return b.toString();
    }


    @Override
    public String autoComplete(String args)
    {
        String hit = null;
        for (String o : data)
        {
            if (o.startsWith(args))
            {
                // CompletionService contract states that we only
                // should return completion for unique hits.
                if (hit == null)
                {
                    hit = o;
                }
                else
                {
                    hit = null;
                    break;
                }
            }
        }
        return hit;

        // // int choice = 1;
        // // String tempS;
        // // String temp = null;
        // // switch (choice)
        // // {
        // // case 1:
        // // tempS = args + "[a-z]*\\s[A-Z][a-z]+";
        // //
        // // pattern = Pattern.compile(tempS);
        // // String tempName;
        // //
        // // for (String o : data)
        // // {
        // //
        // // matcher = pattern.matcher(o);
        // //
        // // if (matcher.find())
        // // {
        // // temp = o;
        // // }
        // // }
        // // if (temp != null)
        // // {
        // // break;
        // // }
        // //
        // // case 2:
        // // tempS = "^[A-Z]" + args + "[a-z]*\\s[A-Z][a-z]+";
        // // pattern = Pattern.compile(tempS);
        // // for (String o : data)
        // // {
        // //
        // // matcher = pattern.matcher(o);
        // //
        // // if (matcher.find())
        // // {
        // // temp = o;
        // // }
        // // }
        // //
        // // if (temp != null)
        // // {
        // // break;
        // //
        // // }
        // // choice = 3;
        // // case 3:
        // // tempS = "^[A-Z][a-z]+\\s" + args + "[a-z]*";
        // // pattern = Pattern.compile(tempS);
        // //
        // // for (String o : data)
        // // {
        // //
        // // matcher = pattern.matcher(o);
        // //
        // // if (matcher.find())
        // // {
        // // temp = o;
        // // }
        // // }
        // // if (temp != null)
        // // {
        // // break;
        // // }
        // //
        // // }
        //
        // return temp;
    }

}
