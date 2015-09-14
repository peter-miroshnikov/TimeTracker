package com.seeburger.view;


import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;

import org.joda.time.DateTime;

import com.seeburger.model.EmployeeStatisticHolder;
import com.seeburger.model.Statistic;


/*
 * MyItemListener.java
 *
 * created at Jul 26, 2013 by p.miroshnikov <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */

public class MyItemListener
    implements ItemListener
{

    @Override
    public void itemStateChanged(ItemEvent e)
    {
        if (e.getStateChange() == ItemEvent.SELECTED)
        {
            JComboBox combo = (JComboBox)e.getSource();
            // int index = combo.getSelectedIndex();
            Random generator = new Random();

            int index = generator.nextInt(3);
            SimpleExample.getDisplay()
                         .setIcon(new ImageIcon(ClassLoader.getSystemResource(SimpleExample.getPictureName(index))));

            ArrayList<Statistic> al = EmployeeStatisticHolder.getInstance()
                                                             .getValuesForEmployee(combo.getItemAt(combo.getSelectedIndex())
                                                                                   .toString());
            //TODO
                // Ako EMployeeStatisticHolder-a e Empty request information from DB ako v DB e Empty Calculate and Save on DB // Repeat
            //



            SimpleExample.clearTheList();

            DateTime tempDay;
            DateTime tempDayDiff;
            DateTime tempLbDiff = null;
            for (int n = 0; n < al.size(); n++)
            {
                try
                {

                    if (al.get(n).getDay() != null)
                    {
                        tempDay = al.get(n).getDay();
                        tempDayDiff = al.get(n).getDayDifference();
                        tempLbDiff = al.get(n).getLbDifference();
                        SimpleExample.addTheReminder(tempDay.getDayOfMonth() + "/" + tempDay.getMonthOfYear()
                                                     + "/" + tempDay.getYear() + " total Working hours : "
                                                     + tempDayDiff.getHourOfDay() + ":"
                                                     + tempDayDiff.getMinuteOfHour() + ":"
                                                     + tempDayDiff.getSecondOfMinute()
                                                     + " With Lunch break of : " + tempLbDiff.getHourOfDay()
                                                     + ":" + tempLbDiff.getMinuteOfHour() + ":"
                                                     + tempLbDiff.getSecondOfMinute());
                    }

                }
                catch (NullPointerException f)
                {


                    SimpleExample.addTheReminder("Something is Wrong ... for :"
                                                 + combo.getItemAt(combo.getSelectedIndex()).toString());
                    // XXX
                }

            }
            SimpleExample.addTheReminder(combo.getItemAt(combo.getSelectedIndex()).toString());

        }
    }
}
