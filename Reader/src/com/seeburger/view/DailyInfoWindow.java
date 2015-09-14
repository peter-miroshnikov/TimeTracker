/*
 * DailyInfoWindow.java
 *
 * created at Aug 2, 2013 by p.miroshnikov <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.seeburger.view;


import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;
import java.awt.MouseInfo;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.ListModel;

import org.joda.time.DateTime;


public class DailyInfoWindow
    extends JFrame
{
    private static DefaultListModel<String> model;
    private static DefaultListModel<String> model2;


    public DailyInfoWindow(ArrayList<DateTime> enterList, ArrayList<DateTime> exitList)
    {
        initUI(enterList, exitList);
    }


    private void initUI(ArrayList<DateTime> enterList, ArrayList<DateTime> exitList)
    {
        DateTime tempDay;
        GridBagConstraints c = new GridBagConstraints();
        model = new DefaultListModel();
        model2 = new DefaultListModel();

        JList listEnter = new JList(model);
        JList listExit = new JList(model2);
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        for (int i = 0; i < enterList.size(); i++)
        {
            tempDay = enterList.get(i);

            model.addElement(tempDay.getDayOfMonth() + "/" + tempDay.getMonthOfYear()
                                         + "/" + tempDay.getYear() + "  :: "
                                         + tempDay.getHourOfDay() + ":"
                                         + tempDay.getMinuteOfHour() + ":"
                                         + tempDay.getSecondOfMinute());

        }

        for (int i = 0; i < exitList.size(); i++)
        {
            tempDay = exitList.get(i);

            model2.addElement(tempDay.getDayOfMonth() + "/" + tempDay.getMonthOfYear()
                                         + "/" + tempDay.getYear() + " :: "
                                         + tempDay.getHourOfDay() + ":"
                                         + tempDay.getMinuteOfHour() + ":"
                                         + tempDay.getSecondOfMinute());
        }
        listEnter.setPreferredSize(new Dimension(200, 580));
        listEnter.setMinimumSize(new Dimension(100, 200));
        listEnter.setMaximumSize(new Dimension(400, 600));
        listExit.setPreferredSize(new Dimension(200, 580));
        listExit.setMinimumSize(new Dimension(100  , 200));
        listExit.setMaximumSize(new Dimension(400 ,600));

        setMinimumSize(new Dimension(500 ,600));
        setMaximumSize(new Dimension(800, 700));


        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;

        c.anchor = GridBagConstraints.FIRST_LINE_START;
        add(new JLabel(" Enter Lists "),c);


        c.gridx = 0;
        c.gridy = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.LINE_START;
        add(listEnter , c);

        c.gridx = 1;
        c.gridy = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.CENTER;
        c.fill = GridBagConstraints.HORIZONTAL;
        add(new JSeparator(JSeparator.VERTICAL), c);

        c.gridx = 2;
        c.gridy = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel(" Exit List ") , c);

        c.gridx = 2;
        c.gridy = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.LAST_LINE_END;

        add(listExit , c);

//        panel.setLayout(new GridBagLayout());

        setLocation(MouseInfo.getPointerInfo().getLocation());
        setTitle("Enter and Exit Lists");
        setResizable(false);
        pack();
    }

}
