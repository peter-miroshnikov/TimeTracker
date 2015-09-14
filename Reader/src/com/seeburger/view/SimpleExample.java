package com.seeburger.view;


/*
 * Main.java
 *
 * created at Jul 25, 2013 by p.miroshnikov <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.Document;

import org.joda.time.DateTime;

import com.seeburger.controller.Controller;
import com.seeburger.controller.Convertors;


//TODO  Remove all the Absolute Postion's and use Layout manager with preffered size..
// That is task with Priority #1 after finishing this you are free to cntinue with experimenting with the GUI and improving the Architecture.
//
public class SimpleExample
    extends JFrame
{
    private static JList list;
    private static DefaultListModel<String> model;
    private static JTextField input;
    private JScrollPane scrollPane;

    private static final String[] pictures = {"pic\\Peter.jpg", "pic\\Georgi.jpg", "pic\\Krasio.jpg",
                                              "pic\\Dimitar.jpg"};
    private JComboBox combobox = null;
    private static JLabel display = null;


    public SimpleExample(Controller con)
    {

        initUI(con);
    }


    public static void doSomethingFunny()
    {
        while (true)
        {
            int lastIndex = list.getModel().getSize() - 1;
            if (lastIndex > 0)
            {
                list.ensureIndexIsVisible(lastIndex);
            }
        }

    }


    public static String getPictureName(int i)

    {
        return pictures[i];
    }


    public static void addTheReminder(String text)
    {

        model.addElement(text);
    }


    public static void clearTheList()
    {
        model.clear();
    }


    public static JLabel getDisplay()
    {
        return display;
    }


    private void initUI(final Controller con)
    {

        // JPanel panel = new JPanel();
        // GridBagConstraints c = new GridBagConstraints();
        // panel.setLayout(new GridBagLayout());
        // setLayout(new GridBagLayout());
        setLayout(null);
        JMenuBar menuBar = new JMenuBar();
        // menuBar.setBounds(0, 0, 1000, 20);
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu help = new JMenu("Help");

        file.setMnemonic(KeyEvent.VK_F);
        edit.setMnemonic(KeyEvent.VK_E);
        help.setMnemonic(KeyEvent.VK_H);

        JMenuItem fMenuItemFile = new JMenuItem("File");
        JMenuItem fMenuItemOpen = new JMenuItem("Open");
        JMenuItem fMenuItemExit = new JMenuItem("Exit");

        JMenuItem eMenuItemUndo = new JMenuItem("Undo");
        JMenuItem eMenuItemRedo = new JMenuItem("Redo");

        JMenuItem hMenuItemHelp = new JMenuItem("Help");

        hMenuItemHelp.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                // TODO Auto-generated method stub

            }
        });

        fMenuItemExit.setMnemonic(KeyEvent.VK_E);
        fMenuItemExit.setToolTipText("Exits the Application");
        fMenuItemExit.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                System.exit(0);
            }
        });

        file.add(fMenuItemExit);
        file.add(fMenuItemFile);
        file.add(fMenuItemOpen);

        edit.add(eMenuItemUndo);
        edit.add(eMenuItemRedo);

        help.add(hMenuItemHelp);

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);

        menuBar.setVisible(true);
        menuBar.setPreferredSize(new Dimension(1200, 30));

        model = new DefaultListModel();

        list = new JList(model);
        // list.setLocation(500, 400);

        final NameService nameService = new NameService(con);

        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("pic\\Peter.jpg"));
        input = new JTextField();

        Document autoCompleteDocument = new AutoCompleteDocument(nameService, input);
        // TODO Remove the Absolute Position

        input.setBounds(25, 173, 170, 20);
        // input.setPreferredSize(new Dimension(170, 20));
        // input.setMaximumSize(new Dimension(170, 20));
        // input.setMinimumSize(new Dimension(170, 20));

        input.setDocument(autoCompleteDocument);
        input.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                String[] temp = nameService.getList();
                for (int i = 0; i < temp.length; i++)
                {
                    if (temp[i].equals(input.getText()))
                    {
                        combobox.setSelectedIndex(i);
                    }
                }

            }
        });

        combobox = new JComboBox(NameService.getList());
        // TODO remove the Absolute Position
        combobox.setSelectedIndex(-1);
        combobox.addItemListener(new MyItemListener());
        combobox.setVisible(true);
        // combobox.setPreferredSize(new Dimension(170, 20));
        // combobox.setMaximumSize(new Dimension(170, 20));
        // combobox.setMinimumSize(new Dimension(170, 20));
        combobox.setBounds(25, 200, 170, 20);

        display = new JLabel();
        // TODO remove the Absolute Postion
        display.setAlignmentX(Component.CENTER_ALIGNMENT);
        display.setBorder(LineBorder.createBlackLineBorder());
        // display.setPreferredSize(new Dimension(170, 140));
        // display.setMaximumSize(new Dimension(170, 140));
        // display.setMinimumSize(new Dimension(170, 140));
        display.setBounds(25, 25, 170, 140);
        display.setVisible(true);
        display.setIcon(new ImageIcon(ClassLoader.getSystemResource(pictures[0])));

        scrollPane = new JScrollPane(list);
        // TODO Remove the Absolute Position
        scrollPane.getViewport().add(list);
        // scrollPane.setPreferredSize(new Dimension(550, 600));
        // scrollPane.setMinimumSize(new Dimension(300, 300));
        scrollPane.setBounds(400, 30, 550, 600);
        scrollPane.setAutoscrolls(true);

        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent m)
            {
                JList tempList = (JList)m.getSource();
                ArrayList<DateTime> tempDateTimeListEnter;
                ArrayList<DateTime> tempDateTimeListExit;
                DateTime tempDate;
                if (m.getClickCount() == 2)
                {
                    tempDate = Convertors.getTimeFromStringForTheViewClass((String)tempList.getSelectedValue());
                    tempDateTimeListEnter = con.getFilteredEnterDateList(tempDate.getDayOfMonth(),
                                                                         tempDate.getMonthOfYear(),
                                                                         tempDate.getYear(),
                                                                         combobox.getItemAt(combobox.getSelectedIndex())
                                                                                 .toString());
                    tempDateTimeListExit = con.getFilteredExitDateList(tempDate.getDayOfMonth(),
                                                                       tempDate.getMonthOfYear(),
                                                                       tempDate.getYear(),
                                                                       combobox.getItemAt(combobox.getSelectedIndex())
                                                                               .toString());

                    DailyInfoWindow di = new DailyInfoWindow(tempDateTimeListEnter, tempDateTimeListExit);
                    di.setVisible(true);

                }
                // addTheReminder(tempList.getSelectedValue().toString() + " From the valueChanged method :"
                // );
                //
                // for(int i = 0 ; i < tempDateTimeListEnter.size(); i ++ )
                // {
                // addTheReminder(tempDateTimeListEnter.get(i).toString());
                // }
            }
        });

        JButton quitButton = new JButton("Do Something");
        JButton openButton = new JButton("Transform");
        JButton saveButton = new JButton("Save");
        JButton listButton = new JButton("List");
        // TODO Remove the Absolute Position
        quitButton.setBounds(30, 330, 100 , 25);
        openButton.setBounds(30, 380, 100, 25);
        saveButton.setBounds(30, 430, 100, 25);
        listButton.setBounds(30, 470, 100, 25);

        // quitButton.setPreferredSize(new Dimension(80, 25));
        // quitButton.setMaximumSize(new Dimension(80, 25));
        // quitButton.setMinimumSize(new Dimension(80, 25));
        //
        // openButton.setPreferredSize(new Dimension(80, 25));
        // openButton.setMaximumSize(new Dimension(80, 25));
        // openButton.setMinimumSize(new Dimension(80, 25));
        //
        // saveButton.setPreferredSize(new Dimension(80, 25));
        // saveButton.setMaximumSize(new Dimension(80, 25));
        // saveButton.setMinimumSize(new Dimension(80, 25));
        //
        // listButton.setPreferredSize(new Dimension(80, 25));
        // listButton.setMaximumSize(new Dimension(80, 25));
        // listButton.setMinimumSize(new Dimension(80, 25));

        quitButton.addActionListener(new ButtonListener(con));
        openButton.addActionListener(new ButtonListener(con));
        saveButton.addActionListener(new ButtonListener(con));
        listButton.addActionListener(new ButtonListener(con));

        // c.weightx = 0.1 ;
        // c.weighty = 0;
        // c.fill = 0;
        // c.gridx = 0;
        // c.gridy = 0;
        // c.anchor = GridBagConstraints.FIRST_LINE_START;

        add(display);

        // c.fill = 0;
        // c.weighty = 0;
        // c.weightx = 0;
        // c.gridx = 0;
        // c.gridy = 4;

        add(input);

        //
        // c.gridx = 0;
        // c.gridy = 5;

        add(combobox);

        // c.gridx = 0;
        // c.gridy = 6;

        add(quitButton);

        // c.gridx = 0;
        // c.gridy = 8;

        add(openButton);
        // c.gridx = 0;
        // c.gridy = 10;

        add(listButton);

        // c.gridx = 0;
        // c.gridy = 12;

        add(saveButton);

        // c.gridheight =14;
        // c.gridwidth = 0;
        // c.gridx = 3;
        // c.gridy = 0;

        add(scrollPane);
        setJMenuBar(menuBar);
        pack();
        setTitle("Pepy's Something");
        setSize(1000, 700);
        // setPreferredSize(new Dimension(1000, 700));
        // setMinimumSize(new Dimension(1000, 400));
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
