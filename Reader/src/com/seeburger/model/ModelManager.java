package com.seeburger.model;


import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;

import javax.swing.SwingUtilities;

import org.joda.time.DateTime;

import com.seeburger.controller.CVSRead;
import com.seeburger.controller.Controller;
import com.seeburger.view.LoadingBar;
import com.seeburger.view.SimpleExample;


public class ModelManager
{

    private CVSRead cvsr;
    private int filesRead = 0;
    private LoadingBar lbar;
    private Controller con;
    private DatabaseConnector db;

    public ModelManager(Controller controller)
    {
        con = controller;
        cvsr = new CVSRead(this);
        MyLogger.getInstance().getLogger().log(Level.FINE, "Beging to read the files");

        db = new DatabaseConnector();
        
        final File folder = new File("C:\\Work\\Java\\Data\\tracker");


        readAllFilesInFolder(folder);
    }






    private void readAllFilesInFolder(final File folder)
    {



        for (final File fileEntry : folder.listFiles())
        {
            if (fileEntry.isDirectory())
            {

                readAllFilesInFolder(fileEntry);
            }
            else
            {
                con.getLoadingBar().getTheBar().setValue(con.getLoadingBar().getTheBar().getValue() + 1);
                con.getLoadingBar().getTheBar().setString(fileEntry.getName());
                cvsr.readAll(fileEntry);

            }
        }
    }


    public int getNumberOfFilesRead()
    {
        return filesRead;
    }


    public String getPerson(int i)
    {

        return EmployeeHolder.getInstance().getEmployeeByNumberInTheArray(i).getEmployeeInfo().getName();
    }


    public int getTown(String name)
    {
        return EmployeeHolder.getInstance()
                             .getEmployeeByName(name)
                             .getEnterDateList()
                             .getEnter()
                             .get(0)
                             .getFloor();
    }


    public MyLogger getMyLogger()
    {
        return MyLogger.getInstance();
    }


    public DateTime getLunchBreak(String name, int day, int month, int year)
    {
        return EmployeeStatisticHolder.getInstance().getLunchBreak(name, day, month);
    }


    public int getLateForWork(String tempName)
    {

        return 0;
    }


    public EmployeeHolder getEmployeeHolder()
    {
        return EmployeeHolder.getInstance();
    }






	public void loadEmployeeList() {
		// TODO Auto-generated method stub
		try {
			db.loadEmployeeList();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}






	public DatabaseConnector getDb() {
		// TODO Auto-generated method stub
		return db;
	}

}
