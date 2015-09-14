package com.seeburger.view;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.seeburger.controller.Controller;
import com.seeburger.controller.ObjectToXmlConvertor;
import com.seeburger.model.EmployeeHolder;
import com.seeburger.model.EmployeeStatisticHolder;
import com.seeburger.model.Statistic;


/*
 * ButtonListener.java
 *
 * created at Jul 26, 2013 by p.miroshnikov <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */

public class ButtonListener
    implements ActionListener
{
    Controller con;


    public ButtonListener(Controller con)
    {
        this.con = con;
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        JButton o = (JButton)e.getSource();
        String label = o.getText();

        SimpleExample.addTheReminder(" " + label + " button clicked");

        if (label.equals("List"))
        {
            SimpleExample.clearTheList();

            Iterator it = EmployeeStatisticHolder.getInstance().getTheMap().entrySet().iterator();
            int tempWorkDays = 0;
            while (it.hasNext())
            {
                tempWorkDays = 0;
                Map.Entry pairs = (Map.Entry)it.next();
                ArrayList<Statistic> temp = ((ArrayList<Statistic>)pairs.getValue());
                for (int i = 0; i < temp.size(); i++)
                {
                    if (temp.get(i).getDayDifference() != null)
                    {
                        tempWorkDays++;
                    }
                }
                String name = (String)pairs.getKey();
                String town = con.getTown(name);

                SimpleExample.addTheReminder(name + " From :" + town + " With total working days of : "
                                             + tempWorkDays);
            }
        }

        if(label.equals("Transform"))
        {
            ObjectToXmlConvertor.write(EmployeeHolder.getInstance().getEmployeeList());
            con.transformXmlToHtml("nosferatu.xml");
        }
    }

}
