package com.seeburger.controller;


import java.util.ArrayList;

import javax.swing.SwingUtilities;

import org.joda.time.DateTime;

import com.seeburger.model.*;
import com.seeburger.view.LoadingBar;
import com.seeburger.view.SimpleExample;
import com.seeburger.view.view2;


public class Controller
{
    private ModelManager mm;
    @SuppressWarnings("unused")
    private view2 view;
    private Controller con;
    private Functionality fun;
    private Search search;
    private SimpleExample ex;
    private LoadingBar lb;
    public Controller()
    {
        lb= new LoadingBar();
        lb.setVisible(true);
        search = new Search();
        fun = new Functionality();
        mm = new ModelManager(this);

        sortEnterDateList();
        sortExitDateList();



        lb.closeTheBar();

        con = this;
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {



                  ex = new SimpleExample(con);
                ex.setVisible(true);

            }
        });

    }

    public LoadingBar getLoadingBar()
    {
        return lb;
    }

    public int getNumberOfFilesRead()
    {
        return mm.getNumberOfFilesRead();
    }


    public ArrayList<String> search(String args)
    {
        // TODO Auto-generated method stub
        return search.search(args);
    }


    public String getPerson(int i)
    {
        return mm.getPerson(i);
    }


    public String getTown(String name)
    {
        System.out.println(mm.getTown(name));
        if (mm.getTown(name) == 0)
        {
            return "Sofia";
        }
        else
        {
            return "Plovidv";
        }

    }


    public ArrayList<DateTime> getFilteredEnterDateList(int day, int month, int year, String name)
    {

        return fun.getFilteredEnterDateList(day, month, year, name);
    }


    public ArrayList<DateTime> getFilteredExitDateList(int day, int month, int year, String name)
    {
        return fun.getFilteredExitDateList(day, month, year, name);
    }


    public DateTime getWorkedForTheDay(String name, int day, int mounth, int year)
    {

        return fun.getWorkedForTheDay(name, day, mounth, year);
    }


    public DateTime getWorkedForTheMounth(String name, int mounth, int year)
    {
        return fun.getWorkedForTheMounth(name, mounth, year);
    }


    public DateTime getLunchBreak(String name, int day, int mounth, int year)
    {
        return mm.getLunchBreak(name, day, mounth, year);
    }


    public DateTime getAVGYear(String name, int i)
    {

        return fun.getAVGYear(name, i);
    }


    public String[] getTopWorkers()
    {
        return fun.getTopWokers();

    }


    public String[] getWorstWokers()
    {
        return fun.getWorstWokers();
    }


    public DateTime getWorkedForTheYear(String string, int i)
    {

        return fun.getWorkedForTheYear(string, i);
    }


    public int getLateForWork(String tempName)
    {

        return mm.getLateForWork(tempName);
    }


    public boolean transformXmlToHtml(String fileName)
    {
        return XmlToHtmlTransformer.transfor(fileName);
    }


    public void sortEnterDateList()
    {
        fun.sortEnterDateList();
    }


    public void sortExitDateList()
    {
        fun.sortExitDateList();
    }


    public void addStatisticToEmployee(String name)
    {
        fun.calculateStatsTimeForEmployee(name);
    }

	public void loadEmployeeList() {
		// TODO Auto-generated method stub
		
		mm.loadEmployeeList();
	}

}
