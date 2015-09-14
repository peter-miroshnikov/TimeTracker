/*
 * LoadingBar.java
 *
 * created at Aug 5, 2013 by p.miroshnikov <YOURMAILADDRESS>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */
package com.seeburger.view;


import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import com.seeburger.model.ModelManager;


public class LoadingBar
    extends JFrame
{
    private JLabel label;
    private    JProgressBar progressBar;
    private static LoadingBar lb ;
    private ActionListener updateProBar;

    public LoadingBar( )
    {
        initUI();


    }


    public JProgressBar getTheBar()
    {
        return progressBar;
    }
    public void closeTheBar()
    {
        dispose();
    }

    public  void initUI()
    {
        // TODO Auto-generated method stub
        setTitle("JProgressBar");
        setLayout(null);
        label = new JLabel("Loading ...");
        label.setBounds(215 , 30, 200, 15);
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 700, 500);
        panel.setLayout(null);
        progressBar = new JProgressBar();
        setUndecorated(true);
        progressBar.setBounds(70 , 60 , 350, 30);
        progressBar.setMinimum(0);
        progressBar.setMaximum(130);
        progressBar.setStringPainted(true);
        progressBar.setVisible(true);
        add(panel);
        panel.add(progressBar);
        panel.add(label);
        setSize(500,150);
        setResizable(false);
        setLocation(700,500);
        // TODO Change after the TESTS!
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
