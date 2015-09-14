//package com.seeburger.view;
//
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//import org.joda.time.DateTime;
//
//import com.seeburger.controller.Controller;
//import com.seeburger.model.EmployeeHolder;
//import com.seeburger.model.EmployeeList;
//import com.seeburger.model.EmployeeStatisticHolder;
//import com.seeburger.model.Functionality;
//import com.seeburger.model.ObjectToXmlConvertor;
//import com.seeburger.model.StatisticHolder;
//
//
//public class view
//{
//    Controller con;
//    Scanner keyboard;
//
//
//    public view(Controller con)
//    {
//        this.con = con;
//        keyboard = new Scanner(System.in);
//        start();
//    }
//
//
//    private void start()
//    {
//
//        System.out.println("Wellcome!");
//
//        int z = 1;
//        int day, mounth, year;
//        String name;
//        DateTime temp;
//        while (z == 1)
//        {
//            String[] top;
//            name = null;
//            day = 0;
//            mounth = 0;
//            year = 0;
//            temp = null;
//            System.out.println("1) Get the working hours for an Employee");
//            System.out.println("2) Get the mounthly working hours for an Employee");
//            System.out.println("3) Get the Lunch Breaker of employee at Certant Day");
//            System.out.println("4) get Avarage for the year");
//            System.out.println("5) get Top Workers");
//            System.out.println("6) get Worst Workers");
//            System.out.println("7) Get OverAll Stats for All Workers");
//            System.out.println("8) Exit the Program");
//            System.out.println("9)  test Funkcii");
//            System.out.println("10) oshte test funkcii");
//            while (!keyboard.hasNextInt())
//            {
//                keyboard.next();
//                System.out.println("Please Enter a Number not String");
//            }
//            int choice = keyboard.nextInt();
//            int choice1;
//
//            while (choice < 1 || choice > 10)
//            {
//                System.out.println("Wrong number , please try again !");
//                choice1 = keyboard.nextInt();
//            }
//            switch (choice)
//
//            {
//                case 1:
//                    System.out.println("Please Enter the Name of the Employee you want to check (First and Last name separated with space)");
//                    keyboard.nextLine();
//
//                    for (int i = 0; i < con.getPersonHolderSize(); i++)
//                    {
//                        System.out.println(i + ") " + con.getPerson(i).());
//
//                    }
//                    System.out.println("Please Select the  Employee you want to check by pressing the number infront of theire names");
//
//                    String tempName2 = keyboard.nextLine() + " ";
//
//                    System.out.println("Plesae enter a Date to check");
//
//
//
//                    System.out.println(con.getWorkedForTheDay(tempName2, 7, 11, 2008));
//
////                    while (!keyboard.hasNextInt())
////                    {
////                        keyboard.next();
////                        System.out.println("Please Enter a Number not String");
////                    }
////                    choice1 = keyboard.nextInt();
////                    while (choice1 < 0 || choice1 > 16)
////                    {
////                        System.out.println("Wrong number , please try again !");
////                        choice1 = keyboard.nextInt();
//////                    }
////                    switch (choice1)
////                    {
////                        case 0:
////                            for (int m = 0; m < 12; m++)
////                            {
////                                for (int i = 0; i < 31; i++)
////                                {
////                                    if (con.getWorkedForTheDay(con.getPerson(choice1).getName(), i, m, 2008) != null)
////                                    {
////                                        System.out.println(i + "/" + m + "/" + 2008);
////                                    }
////                                }
////                            }
////
////                            System.out.println("Select the Date you want to check");
////                            break;
////                        case 1:
////                            for (int m = 0; m < 12; m++)
////                            {
////                                for (int i = 0; i < 31; i++)
////                                {
////                                    if (con.getWorkedForTheDay(con.getPerson(choice1).getName(), i, m, 2008) != null)
////                                    {
////                                        System.out.println(i + "/" + m + "/" + 2008);
////                                    }
////                                }
////                            }
////
////                            System.out.println("Select the Date you want to check");
////                            break;
////                        case 2:
////                            for (int m = 0; m < 12; m++)
////                            {
////                                for (int i = 0; i < 31; i++)
////                                {
////                                    if (con.getWorkedForTheDay(con.getPerson(choice1).getName(), i, m, 2008) != null)
////                                    {
////                                        System.out.println(i + "/" + m + "/" + 2008);
////                                    }
////                                }
////                            }
////
////                            System.out.println("Select the Date you want to check");
////                            break;
////                        case 3:
////                            for (int m = 0; m < 12; m++)
////                            {
////                                for (int i = 0; i < 31; i++)
////                                {
////                                    if (con.getWorkedForTheDay(con.getPerson(choice1).getName(), i, m, 2008) != null)
////                                    {
////                                        System.out.println(i + "/" + m + "/" + 2008);
////                                    }
////                                }
////                            }
////
////                            System.out.println("Select the Date you want to check");
////                            break;
////                        case 4:
////                            for (int m = 0; m < 12; m++)
////                            {
////                                for (int i = 0; i < 31; i++)
////                                {
////                                    if (con.getWorkedForTheDay(con.getPerson(choice1).getName(), i, m, 2008) != null)
////                                    {
////                                        System.out.println(i + "/" + m + "/" + 2008);
////                                    }
////                                }
////                            }
////
////                            System.out.println("Select the Date you want to check");
////                            break;
////                        case 5:
////                            for (int m = 0; m < 12; m++)
////                            {
////                                for (int i = 0; i < 31; i++)
////                                {
////                                    if (con.getWorkedForTheDay(con.getPerson(choice1).getName(), i, m, 2008) != null)
////                                    {
////                                        System.out.println(i + "/" + m + "/" + 2008);
////                                    }
////                                }
////                            }
////
////                            System.out.println("Select the Date you want to check");
////                            break;
////                        case 6:
////                            for (int m = 0; m < 12; m++)
////                            {
////                                for (int i = 0; i < 31; i++)
////                                {
////                                    if (con.getWorkedForTheDay(con.getPerson(choice1).getName(), i, m, 2008) != null)
////                                    {
////                                        System.out.println(i + "/" + m + "/" + 2008);
////                                    }
////                                }
////                            }
////
////                            System.out.println("Select the Date you want to check");
////                            break;
////                        case 7:
////                            for (int m = 0; m < 12; m++)
////                            {
////                                for (int i = 0; i < 31; i++)
////                                {
////                                    if (con.getWorkedForTheDay(con.getPerson(choice1).getName(), i, m, 2008) != null)
////                                    {
////                                        System.out.println(i + "/" + m + "/" + 2008);
////                                    }
////                                }
////                            }
////
////                            System.out.println("Select the Date you want to check");
////                            break;
////                        case 8:
////                            for (int m = 0; m < 12; m++)
////                            {
////                                for (int i = 0; i < 31; i++)
////                                {
////                                    if (con.getWorkedForTheDay(con.getPerson(choice1).getName(), i, m, 2008) != null)
////                                    {
////                                        System.out.println(i + "/" + m + "/" + 2008);
////                                    }
////                                }
////                            }
////
////                            System.out.println("Select the Date you want to check");
////                            break;
////                        case 9:
////                            for (int m = 0; m < 12; m++)
////                            {
////                                for (int i = 0; i < 31; i++)
////                                {
////                                    if (con.getWorkedForTheDay(con.getPerson(choice1).getName(), i, m, 2008) != null)
////                                    {
////                                        System.out.println(i + "/" + m + "/" + 2008);
////                                    }
////                                }
////                            }
////
////                            System.out.println("Select the Date you want to check");
////                            break;
////                        case 10:
////                            for (int m = 0; m < 12; m++)
////                            {
////                                for (int i = 0; i < 31; i++)
////                                {
////                                    if (con.getWorkedForTheDay(con.getPerson(choice1).getName(), i, m, 2008) != null)
////                                    {
////                                        System.out.println(i + "/" + m + "/" + 2008);
////                                    }
////                                }
////                            }
////
////                            System.out.println("Select the Date you want to check");
////                            break;
////                        case 11:
////                            for (int m = 0; m < 12; m++)
////                            {
////                                for (int i = 0; i < 31; i++)
////                                {
////                                    if (con.getWorkedForTheDay(con.getPerson(choice1).getName(), i, m, 2008) != null)
////                                    {
////                                        System.out.println(i + "/" + m + "/" + 2008);
////                                    }
////                                }
////                            }
////
////                            System.out.println("Select the Date you want to check");
////                            break;
////                        case 12:
////                            for (int m = 0; m < 12; m++)
////                            {
////                                for (int i = 0; i < 31; i++)
////                                {
////                                    if (con.getWorkedForTheDay(con.getPerson(choice1).getName(), i, m, 2008) != null)
////                                    {
////                                        System.out.println(i + "/" + m + "/" + 2008);
////                                    }
////                                }
////                            }
////
////                            System.out.println("Select the Date you want to check");
////                            break;
////                        case 13:
////                            for (int m = 0; m < 12; m++)
////                            {
////                                for (int i = 0; i < 31; i++)
////                                {
////                                    if (con.getWorkedForTheDay(con.getPerson(choice1).getName(), i, m, 2008) != null)
////                                    {
////                                        System.out.println(i + "/" + m + "/" + 2008);
////                                    }
////                                }
////                            }
////
////                            System.out.println("Select the Date you want to check");
////                            break;
////                        case 14:
////                            for (int m = 0; m < 12; m++)
////                            {
////                                for (int i = 0; i < 31; i++)
////                                {
////                                    if (con.getWorkedForTheDay(con.getPerson(choice1).getName(), i, m, 2008) != null)
////                                    {
////                                        System.out.println(i + "/" + m + "/" + 2008);
////                                    }
////                                }
////                            }
////
////                            System.out.println("Select the Date you want to check");
////                            break;
////                        case 15:
////                            for (int m = 0; m < 12; m++)
////                            {
////                                for (int i = 0; i < 31; i++)
////                                {
////                                    if (con.getWorkedForTheDay(con.getPerson(choice1).getName(), i, m, 2008) != null)
////                                    {
////                                        System.out.println(i + "/" + m + "/" + 2008);
////                                    }
////                                }
////                            }
////
////                            System.out.println("Select the Date you want to check");
////                            break;
////                        case 16:
////                            for (int m = 0; m < 12; m++)
////                            {
////                                for (int i = 0; i < 31; i++)
////                                {
////                                    if (con.getWorkedForTheDay(con.getPerson(choice1).getName(), i, m, 2008) != null)
////                                    {
////                                        System.out.println(i + "/" + m + "/" + 2008);
////                                    }
////                                }
////                            }
////
////                            System.out.println("Select the Date you want to check");
////                            break;
////
////                    }
//
////                    name = keyboard.nextLine() + " ";
////                    System.out.println("Please enter the Date you want to check (D/M/Y)");
////                    while (!keyboard.hasNextInt())
////                    {
////                        keyboard.next();
////                        System.out.println("Please Enter a Number not String");
////                    }
////                    day = keyboard.nextInt();
////                    while (!keyboard.hasNextInt())
////                    {
////                        keyboard.next();
////                        System.out.println("Please Enter a Number not String");
////                    }
////                    mounth = keyboard.nextInt();
////                    while (!keyboard.hasNextInt())
////                    {
////                        keyboard.next();
////                        System.out.println("Please Enter a Number not String");
////                    }
////                    year = keyboard.nextInt();
////
////                    while (con.getWorkedForTheDay(con.getPerson(choice1).getName(), day, mounth, year) == null)
////                    {
////                        System.out.println("You have enterd Wrong date , please try again");
////                        while (!keyboard.hasNextInt())
////                        {
////                            keyboard.next();
////                            System.out.println("Please Enter a Number not String");
////                        }
////                        day = keyboard.nextInt();
////                        while (!keyboard.hasNextInt())
////                        {
////                            keyboard.next();
////                            System.out.println("Please Enter a Number not String");
////                        }
////                        mounth = keyboard.nextInt();
////                        while (!keyboard.hasNextInt())
////                        {
////                            keyboard.next();
////                            System.out.println("Please Enter a Number not String");
////                        }
////                        year = keyboard.nextInt();
////                    }
////
////                    temp = con.getWorkedForTheDay(con.getPerson(choice1).getName(), day, mounth, year);
////                    System.out.println(temp.toString());
//                    break;
//
//                case 2:
//
//                    for (int i = 0; i < con.getPersonHolderSize(); i++)
//                    {
//                        System.out.println(i + ") " + con.getPerson(i).());
//
//                    }
//                    System.out.println("Please Select the Employee you want to check by pressing the number infront of there names");
//                    while (!keyboard.hasNextInt())
//                    {
//                        keyboard.next();
//                        System.out.println("Please Enter a Number not String");
//                    }
//                    choice1 = keyboard.nextInt();
//                    while (choice1 < 0 || choice1 > 16)
//                    {
//                        System.out.println("Wrong number , please try again !");
//                        choice1 = keyboard.nextInt();
//                    }
//                    switch (choice1)
//                    {
//                        case 0:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                System.out.println("proverqvam mesec : " + m);
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getWorkedForTheDay(con.getPerson(choice1).(), i, m, 2008) != null)
//                                    {
//                                        System.out.println("Proverqvam den : " + i);
//                                        System.out.println(m + "/" + 2008);
//                                        break;
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//                            break;
//                        case 1:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getWorkedForTheDay(con.getPerson(choice1).(), i, m, 2008) != null)
//                                    {
//                                        System.out.println(m + "/" + 2008);
//                                        break;
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//                            break;
//                        case 2:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getWorkedForTheDay(con.getPerson(choice1).(), i, m, 2008) != null)
//                                    {
//                                        System.out.println(m + "/" + 2008);
//                                        break;
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//                            break;
//                        case 3:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getWorkedForTheDay(con.getPerson(choice1).(), i, m, 2008) != null)
//                                    {
//                                        System.out.println(m + "/" + 2008);
//                                        break;
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//                            break;
//                        case 4:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getWorkedForTheDay(con.getPerson(choice1).(), i, m, 2008) != null)
//                                    {
//                                        System.out.println(m + "/" + 2008);
//                                        break;
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//                            break;
//                        case 5:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getWorkedForTheDay(con.getPerson(choice1).(), i, m, 2008) != null)
//                                    {
//                                        System.out.println(m + "/" + 2008);
//                                        break;
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//                            break;
//                        case 6:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getWorkedForTheDay(con.getPerson(choice1).(), i, m, 2008) != null)
//                                    {
//                                        System.out.println(m + "/" + 2008);
//                                        break;
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//                            break;
//                        case 7:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getWorkedForTheDay(con.getPerson(choice1).(), i, m, 2008) != null)
//                                    {
//                                        System.out.println(m + "/" + 2008);
//                                        break;
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//                            break;
//                        case 8:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getWorkedForTheDay(con.getPerson(choice1).(), i, m, 2008) != null)
//                                    {
//                                        System.out.println(m + "/" + 2008);
//                                        break;
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//                            break;
//                        case 9:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getWorkedForTheDay(con.getPerson(choice1).(), i, m, 2008) != null)
//                                    {
//                                        System.out.println(m + "/" + 2008);
//                                        break;
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//                            break;
//                        case 10:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getWorkedForTheDay(con.getPerson(choice1).(), i, m, 2008) != null)
//                                    {
//                                        System.out.println(m + "/" + 2008);
//                                        break;
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//                            break;
//                        case 11:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getWorkedForTheDay(con.getPerson(choice1).(), i, m, 2008) != null)
//                                    {
//                                        System.out.println(m + "/" + 2008);
//                                        break;
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//                            break;
//                        case 12:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getWorkedForTheDay(con.getPerson(choice1).(), i, m, 2008) != null)
//                                    {
//                                        System.out.println(m + "/" + 2008);
//                                        break;
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//                            break;
//                        case 13:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getWorkedForTheDay(con.getPerson(choice1).(), i, m, 2008) != null)
//                                    {
//                                        System.out.println(m + "/" + 2008);
//                                        break;
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//                            break;
//                        case 14:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getWorkedForTheDay(con.getPerson(choice1).(), i, m, 2008) != null)
//                                    {
//                                        System.out.println(m + "/" + 2008);
//                                        break;
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//                            break;
//                        case 15:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getWorkedForTheDay(con.getPerson(choice1).(), i, m, 2008) != null)
//                                    {
//                                        System.out.println(m + "/" + 2008);
//                                        break;
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//                            break;
//                        case 16:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getWorkedForTheDay(con.getPerson(choice1).(), i, m, 2008) != null)
//                                    {
//                                        System.out.println(m + "/" + 2008);
//                                        break;
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//
//                    }
//                    name = keyboard.nextLine() + " ";
//                    System.out.println("Please enter the Mounth and Year  that you want to check (M/Y)");
//                    mounth = keyboard.nextInt();
//                    year = keyboard.nextInt();
//                    while (con.getWorkedForTheMounth(con.getPerson(choice1).(), mounth, year) == null)
//                    {
//
//                        if (con.getWorkedForTheMounth(con.getPerson(choice1).(), mounth, year) == null)
//                        {
//                            System.out.println("Wrong date , please try again.");
//                            System.out.println("Please enter the Mounth and Year  that you want to check (M/Y)");
//                            while (!keyboard.hasNextInt())
//                            {
//                                keyboard.next();
//                                System.out.println("Please Enter a Number not String");
//                            }
//                            mounth = keyboard.nextInt();
//                            while (!keyboard.hasNextInt())
//                            {
//                                keyboard.next();
//                                System.out.println("Please Enter a Number not String");
//                            }
//                            year = keyboard.nextInt();
//                        }
//                    }
//                    temp = con.getWorkedForTheMounth(con.getPerson(choice1).(), mounth, year);
//                    System.out.println("Days :" + temp.getDayOfMonth() + " Hours : " + temp.getHourOfDay()
//                                       + " Minutes :" + temp.getMinuteOfHour());
//
//                    break;
//                case 3:
//                    // Lunch break
//
//                    for (int i = 0; i < con.getPersonHolderSize(); i++)
//                    {
//                        System.out.println(i + ") " + con.getPerson(i).());
//
//                    }
//                    System.out.println(" IT DOESNT WORK DO NOT TOUCH !");
//                    System.out.println("Please Select the  Employee you want to check by pressing the number infront of theire names");
//
//                    choice1 = keyboard.nextInt();
//                    while (choice1 < 0 || choice1 > 16)
//                    {
//                        System.out.println("Wrong number , please try again !");
//                        choice1 = keyboard.nextInt();
//                    }
//                    switch (choice1)
//                    {
//                        case 0:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getLunchBreak(con.getPerson(choice1).(), i, m, 2008) != null)
//                                    {
//                                        System.out.println(i + "/" + m + "/" + 2008);
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//                            break;
//                        case 1:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getLunchBreak(con.getPerson(choice1).(), i, m, 2008) != null)
//                                    {
//                                        System.out.println(i + "/" + m + "/" + 2008);
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//                            break;
//                        case 2:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getLunchBreak(con.getPerson(choice1).(), i, m, 2008) != null)
//                                    {
//                                        System.out.println(i + "/" + m + "/" + 2008);
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//                            break;
//                        case 3:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getLunchBreak(con.getPerson(choice1).(), i, m, 2008) != null)
//                                    {
//                                        System.out.println(i + "/" + m + "/" + 2008);
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//                            break;
//                        case 4:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getLunchBreak(con.getPerson(choice1).(), i, m, 2008) != null)
//                                    {
//                                        System.out.println(i + "/" + m + "/" + 2008);
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//                            break;
//                        case 5:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getLunchBreak(con.getPerson(choice1).(), i, m, 2008) != null)
//                                    {
//                                        System.out.println(i + "/" + m + "/" + 2008);
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//                            break;
//                        case 6:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getLunchBreak(con.getPerson(choice1).(), i, m, 2008) != null)
//                                    {
//                                        System.out.println(i + "/" + m + "/" + 2008);
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//                            break;
//                        case 7:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getLunchBreak(con.getPerson(choice1).(), i, m, 2008) != null)
//                                    {
//                                        System.out.println(i + "/" + m + "/" + 2008);
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//                            break;
//                        case 8:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getLunchBreak(con.getPerson(choice1).(), i, m, 2008) != null)
//                                    {
//                                        System.out.println(i + "/" + m + "/" + 2008);
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//                            break;
//                        case 9:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getLunchBreak(con.getPerson(choice1).(), i, m, 2008) != null)
//                                    {
//                                        System.out.println(i + "/" + m + "/" + 2008);
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//                            break;
//                        case 10:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getLunchBreak(con.getPerson(choice1).(), i, m, 2008) != null)
//                                    {
//                                        System.out.println(i + "/" + m + "/" + 2008);
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//                            break;
//                        case 11:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getLunchBreak(con.getPerson(choice1).(), i, m, 2008) != null)
//                                    {
//                                        System.out.println(i + "/" + m + "/" + 2008);
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//                            break;
//                        case 12:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getLunchBreak(con.getPerson(choice1).(), i, m, 2008) != null)
//                                    {
//                                        System.out.println(i + "/" + m + "/" + 2008);
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//                            break;
//                        case 13:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getLunchBreak(con.getPerson(choice1).(), i, m, 2008) != null)
//                                    {
//                                        System.out.println(i + "/" + m + "/" + 2008);
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//                            break;
//                        case 14:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getLunchBreak(con.getPerson(choice1).(), i, m, 2008) != null)
//                                    {
//                                        System.out.println(i + "/" + m + "/" + 2008);
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//                            break;
//                        case 15:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getLunchBreak(con.getPerson(choice1).(), i, m, 2008) != null)
//                                    {
//                                        System.out.println(i + "/" + m + "/" + 2008);
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//                            break;
//                        case 16:
//                            for (int m = 0; m < 12; m++)
//                            {
//                                for (int i = 0; i < 31; i++)
//                                {
//                                    if (con.getLunchBreak(con.getPerson(choice1).(), i, m, 2008) != null) // SLOJI
//                                                                                                                 // GO
//                                                                                                                 // NAVSQKADE
//                                    {
//                                        System.out.println(i + "/" + m + "/" + 2008);
//                                    }
//                                }
//                            }
//
//                            System.out.println("Select the Date you want to check");
//                            break;
//
//                    }
//
//                    name = keyboard.nextLine() + " ";
//
//                    // System.out
//                    // .println("Please enter the Date you want to check (D/M/Y)");
//                    // day = keyboard.nextInt();
//                    // mounth = keyboard.nextInt();
//                    // year = keyboard.nextInt();
//
//                    while (con.getLunchBreak(con.getPerson(choice1).(), day, mounth, year) == null)
//                    {
//                        System.out.println("You have enterd a wrong date please try again  (D/M/Y)");
//                        day = keyboard.nextInt();
//                        while (!keyboard.hasNextInt())
//                        {
//                            keyboard.next();
//                            System.out.println("Please Enter a Number not String");
//                        }
//                        mounth = keyboard.nextInt();
//                        while (!keyboard.hasNextInt())
//                        {
//                            keyboard.next();
//                            System.out.println("Please Enter a Number not String");
//                        }
//                        year = keyboard.nextInt();
//                        while (!keyboard.hasNextInt())
//                        {
//                            keyboard.next();
//                            System.out.println("Please Enter a Number not String");
//                        }
//
//                        temp = con.getLunchBreak(con.getPerson(choice1).(), day, mounth, year);
//
//                    }
//
//                    System.out.println(temp.toString());
//                    break;
//                case 4:
//
//
//                    for (int i = 0; i < con.getPersonHolderSize(); i++)
//                    {
//                        System.out.println(i + ") " + con.getPerson(i));
//
//                    }
//                    System.out.println("Please Select the  Employee you want to check by pressing the number infront of theire names");
//
//                    choice1 = keyboard.nextInt();
//                    while (choice1 < 0 || choice1 > 16)
//                    {
//                        System.out.println("Wrong number , please try again !");
//                        choice1 = keyboard.nextInt();
//                    }
//                    temp = con.getAVGYear(con.getPerson(choice1), 2008);
//                    System.out.println("Avarage Worked Hours Per day : " + temp.toString());
//                    break;
//
//                case 5:
//                    top = con.getTopWorkers();
//
//                    for (int i = 0; i < top.length; i++)
//                    {
//                        temp = con.getWorkedForTheYear(top[i], 2008);
//
//                        System.out.println(top[i] + " With " + (temp.getMonthOfYear() - 1) + "Mounths and "
//                                           + (temp.getDayOfMonth() - 1) + "days " + temp.getHourOfDay()
//                                           + "Hours " + temp.getMinuteOfHour() + "minutes ");
//                    }
//                    break;
//                case 6:
//                    top = con.getWorstWokers();
//
//                    for (int i = 0; i < top.length; i++)
//                    {
//                        temp = con.getWorkedForTheYear(top[i], 2008);
//
//                        System.out.println(top[i] + " With " + (temp.getMonthOfYear() - 1) + "Mounths and "
//                                           + (temp.getDayOfMonth() - 1) + "days " + temp.getHourOfDay()
//                                           + "Hours " + temp.getMinuteOfHour() + "minutes ");
//                    }
//                    break;
//                case 7:
//                    for (int i = 0; i < con.getPersonHolderSize(); i++)
//                    {
//                        String tempName = con.getPerson(i);
//                        String lbreak;
//                        for (int m = 0; m < 12; m++)
//                        {
//                            for (int n = 0; n < 31; n++)
//                            {
//                                if (con.getWorkedForTheDay(con.getPerson(i), n, m, 2008) != null)
//                                {
//                                    if (con.getLunchBreak(tempName, n, m, 2008) == null)
//                                    {
//                                        lbreak = " The persons Did not Left the Building for a Launch Break";
//                                    }
//                                    else
//                                    {
//                                        lbreak = con.getLunchBreak(tempName, n, m, 2008).toString();
//                                    }
//                                    System.out.println(tempName + " | "
//                                                       + con.getWorkedForTheDay(tempName, n, m, 2008) + " | "
//                                                       + lbreak);
//                                }
//                            }
//
//                        }
//                        System.out.println(tempName + " | " + " Avarage worked for the Year :"
//                                           + con.getAVGYear(tempName, 2008) + " | " + " Came late for work :"
//                                           + con.getLateForWork(tempName));
//                    }
//
//                    break;
//                case 8:
//                    System.out.println("Good bai");
//                    z = 0;
//                    break;
//                case 9:
//
//                    System.out.println("Marshalvam");
//                    ObjectToXmlConvertor.write(EmployeeHolder.getInstance().getEmployeeList());
//                    con.transformXmlToHtml("nosferatu.xml");
//                    break;
//
//                case 10:
//                    System.out.println("Sortiram Listi");
//
//                    con.sortEnterDateList();
//                    con.sortExitDateList();
//
//                    System.out.println("Please Enter the Name of the Employee you want to check (First and Last name separated with space)");
//                    keyboard.nextLine();
//                    for (int i = 0; i < EmployeeHolder.getInstance().getSize(); i++)
//                    {
//                        System.out.println(i + ") " + EmployeeHolder.getInstance().getEmployeeByNumberInTheArray(i).getEmployeeInfo().getName());
//
//                        ArrayList<StatisticHolder> tempDateTime = EmployeeStatisticHolder.getInstance().getValuesForEmployee(EmployeeHolder.getInstance().getEmployeeByNumberInTheArray(i).getEmployeeInfo().getName());
//                    }
//                    System.out.println("Please type in one of the Names listed above.");
//                    String tempName = keyboard.nextLine() + " ";
//
//
//                    ArrayList<StatisticHolder> tempDateTime = EmployeeStatisticHolder.getInstance().getValuesForEmployee(tempName);
//                    for(int n = 0 ; n < tempDateTime.size();n++)
//                    {
//                        if(tempDateTime.get(n).getLbDifference()!=null)
//                        {
//                            System.out.println(tempDateTime.get(n).getLbDifference());
//                        }
//                    }
//                    System.out.println("========================================================");
//                    System.out.println(con.getTopWorkers()[0] + " , " + con.getTopWorkers()[1] + " , " + con.getTopWorkers()[2]);
//
//
//                    break;
//            }
//
//        }
//
//    }
//
//}
