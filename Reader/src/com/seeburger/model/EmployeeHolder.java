/*
 * EmployeeHolder.java
 *
 * created at Jul 17, 2013 by p.miroshnikov <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.seeburger.model;


import java.util.ArrayList;

import com.seeburger.model.EmployeeList.Employee;


public class EmployeeHolder
{
    private static EmployeeHolder eh;
    private static EmployeeList el;
    private static ObjectFactory factory;


    private EmployeeHolder()
    {
        factory = new ObjectFactory();
        el = factory.createEmployeeList();
    }


    public static EmployeeHolder getInstance()
    {
        if (eh == null)
        {
            eh = new EmployeeHolder();
        }
        return eh;
    }


    public Employee getEmployeeByName(String name)
    {
        for (int i = 0; i < el.getEmployee().size(); i++)
        {
            if (el.getEmployee().get(i).getEmployeeInfo().getName().equals(name))
            {
                return el.getEmployee().get(i);
            }
        }
        return null;
    }


    public int getSize()
    {
        return el.getEmployee().size();
    }


    public EmployeeList getEmployeeList()
    {
        return el;
    }


    public boolean addEmployee(Employee emp)
    {
        for (int i = 0; i < el.getEmployee().size(); i++)
        {
            if (el.getEmployee().get(i).getEmployeeInfo().getName().equals(emp.getEmployeeInfo().getName()))
            {
                return false;
            }
        }
        el.getEmployee().add(emp);
        return true;
    }


    public Employee getEmployeeByNumberInTheArray(int i)
    {
        if (i < el.getEmployee().size())
        {
            return el.getEmployee().get(i);
        }

        return null;
    }
}
