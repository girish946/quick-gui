/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.guigen.uigen;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author girish
 */

public class Window_Listener_Panel extends java.awt.Panel implements ActionListener
{
	public Window_Listener_Panel(org.guigen.uigen.Guigen gui)
	{
		super();
                this.gui=gui;
		setLayout(new BorderLayout());
		one=new java.awt.Panel();
		two=new java.awt.Panel();
		three=new java.awt.Panel();
		cl=new java.awt.CardLayout();
		two.setLayout(cl);
		for (int i=0;i<editText.length ;i++ )
		{
			event_button[i]=new java.awt.Button(label_String[i]);
			event_button[i].addActionListener(this);
			one.add(event_button[i]);
			cardPanel[i]=new Panel();
			cardPanel[i].setLayout(new GridLayout(2,1));
			cardPanel[i].setBackground(Color.red);
			editText[i]=new java.awt.TextArea(20,10);
			event_label[i]=new java.awt.Label(label_String[i]);
			cardPanel[i].add(event_label[i]);
			cardPanel[i].add(editText[i]);
			two.add(cardPanel[i],label_String[i]);
		}
		add(one,BorderLayout.NORTH);
		add(two,BorderLayout.CENTER);
		add(three,BorderLayout.SOUTH);
		OK_button=new javax.swing.JButton("Ok");
		three.add(OK_button);
		OK_button.addActionListener(this);
		validate();
		invalidate();
		resize(950,500);
		repaint();
		show();
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==OK_button)
		{
					//this.setVisible(false);
                                        //org.guigen.uigen.Guigen.panel_guigen.setVisible(true);
                                        org.guigen.uigen.AppUIMainTopComponent.showPanel(gui);
                                        org.guigen.uigen.AppUIMainTopComponent.currentPanel=gui;
		}
		else
		{
			Button b1=(Button)e.getSource();
		cl.show(two,b1.getLabel());
		}
	}
	java.awt.Panel one,two,three;
	public java.lang.String label_String[]={"windowOpened","windowActivated","windowDeactivated","windowIconified","windowDeiconified","windowClosing","windowClosed"};
	java.awt.Panel cardPanel[]=new java.awt.Panel[7];
	java.awt.Label event_label[]=new java.awt.Label[7];
	java.awt.CardLayout cl;
	java.awt.Button event_button[]= new java.awt.Button[7];
	static java.awt.TextArea editText[]=new java.awt.TextArea[7];
	//java.awt.Button OK_button;
        javax.swing.JButton OK_button;
        static org.guigen.uigen.Guigen gui;
}
    
