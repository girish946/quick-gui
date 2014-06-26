/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.guigen.uigen;

/**
 *
 * @author girish
 */
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Color;


public class Color_Panel extends java.awt.Panel implements AdjustmentListener,ItemListener,ActionListener
{
	public Color_Panel(Guigen gui)
	{
		super();
                org.guigen.uigen.Color_Panel.gui=gui;
		ScrRed=new javax.swing.JScrollBar(0,0,50,0,255);
		ScrBlue=new javax.swing.JScrollBar(0,0,50,0,255);
		ScrGreen=new javax.swing.JScrollBar(0,0,50,0,255);
		ScrRed.addAdjustmentListener(this);
		ScrGreen.addAdjustmentListener(this);
		ScrBlue.addAdjustmentListener(this);
		setLayout(new BorderLayout());
		one=new java.awt.Panel();
		two=new java.awt.Panel();
		center=new java.awt.Panel();
		extra=new java.awt.Panel();
		extra.setLayout(new BorderLayout());
		two.setLayout(new java.awt.GridLayout(4,1));
		two.add(ScrRed);
		two.add(ScrGreen);
		two.add(ScrBlue);
		two.add(extra);
		Ok_button=new java.awt.Button("Ok");
		Ok_button.addActionListener(this);
		extra.add(Ok_button,BorderLayout.EAST);
		add(one,java.awt.BorderLayout.NORTH);
		add(center,java.awt.BorderLayout.CENTER);
		add(two,java.awt.BorderLayout.SOUTH);
		colorcbg=new java.awt.CheckboxGroup();
		white=new java.awt.Checkbox("white",colorcbg,true);
		gray=new  java.awt.Checkbox("gray",colorcbg,false);
		lightGray= new java.awt.Checkbox("lightGray",colorcbg,false);
		darkGray=new  java.awt.Checkbox("darkGray",colorcbg,false);
		black=new  java.awt.Checkbox("black",colorcbg,false);
		red=new  java.awt.Checkbox("red",colorcbg,false);
		pink=new  java.awt.Checkbox("pink",colorcbg,false);
		orange=new  java.awt.Checkbox("orange",colorcbg,false);
		yellow=new  java.awt.Checkbox("yellow",colorcbg,false);
		green=new  java.awt.Checkbox("green",colorcbg,false);
		magenta=new  java.awt.Checkbox("magenta",colorcbg,false);
		cyan=new  java.awt.Checkbox("cyan",colorcbg,false);
		blue=new  java.awt.Checkbox("blue",colorcbg,false);
		custom=new  java.awt.Checkbox("CustomColor",colorcbg,false);
		white.addItemListener(this);
		gray.addItemListener(this);
		lightGray.addItemListener(this);
		darkGray.addItemListener(this);
		black.addItemListener(this);
		red.addItemListener(this);
		pink.addItemListener(this);
		orange.addItemListener(this);
		yellow.addItemListener(this);
		green.addItemListener(this);
		magenta.addItemListener(this);
		cyan.addItemListener(this);
		blue.addItemListener(this);
		custom.addItemListener(this);
		one.add(white);
		one.add(gray);
		one.add(lightGray);
		one.add(darkGray);
		one.add(black);
		one.add(red);
		one.add(pink);
		one.add(orange);
		one.add(yellow);
		one.add(green);
		one.add(magenta);
		one.add(cyan);
		one.add(blue);
		one.add(custom);
		validate();
		invalidate();
		resize(1000,700);
		repaint();
		scrdec();
		show();

	}

		public void adjustmentValueChanged(AdjustmentEvent aj)
			{
				r=ScrRed.getValue();
				g=ScrGreen.getValue();
				b=ScrBlue.getValue();
				col=new java.awt.Color(r,g,b);
				center.setBackground(col);
				repaint();		
			}
			public void itemStateChanged(ItemEvent ie)
	{
				if (white.getState()==true)
				{
					scrdec();
					col=java.awt.Color.white;
					center.setBackground(col);
					repaint();
				}
				if (black.getState()==true)
				{
					scrdec();
					col=java.awt.Color.black;
					center.setBackground(col);
					repaint();
				}
				if (gray.getState()==true)
				{
					scrdec();
					col=java.awt.Color.gray;
					center.setBackground(col);
					repaint();
				}
				if (lightGray.getState()==true)
				{
					scrdec();
					col=java.awt.Color.lightGray;
					center.setBackground(col);
					repaint();
				}
				if (darkGray.getState()==true)
				{
					scrdec();
					col=java.awt.Color.darkGray;
					center.setBackground(col);
					repaint();
				}
				if (red.getState()==true)
				{
					scrdec();
					col=java.awt.Color.red;
					center.setBackground(col);
					repaint();
				}
				if (orange.getState()==true)
				{
					scrdec();
					col=java.awt.Color.orange;
					center.setBackground(col);
					repaint();
				}
				if (pink.getState()==true)
				{
					scrdec();
					col=java.awt.Color.pink;
					center.setBackground(col);
					repaint();
				}
				if (yellow.getState()==true)
				{
					scrdec();
					col=java.awt.Color.yellow;
					center.setBackground(col);
					repaint();
				}
				if (green.getState()==true)
				{
					scrdec();
					col=java.awt.Color.green;
					center.setBackground(col);
					repaint();
				}
				if (magenta.getState()==true)
				{
					scrdec();
					col=java.awt.Color.magenta;
					center.setBackground(col);
					repaint();
				}
				if (cyan.getState()==true)
				{
					scrdec();
					col=java.awt.Color.cyan;
					center.setBackground(col);
					repaint();
				}
				if (blue.getState()==true)
				{
					scrdec();
					col=java.awt.Color.blue;
					center.setBackground(col);
					repaint();
				}
				if (custom.getState()==true)
				{
					ScrRed.setEnabled(true);
					ScrGreen.setEnabled(true);
					ScrBlue.setEnabled(true);
					r=ScrRed.getValue();
					g=ScrGreen.getValue();
					b=ScrBlue.getValue();
					col=new java.awt.Color(r,g,b);
					center.setBackground(col);
					repaint();		
				}
	}
	public void actionPerformed(ActionEvent e)
	{
			if (e.getSource()==Ok_button)
			{
				okc=false;
			col=center.getBackground();
			
		try
			{	
			colorinfo=new java.io.File("bgcolor.info");
			colorwriter=new java.io.FileWriter(colorinfo);
			colorprint=new java.io.PrintWriter(colorwriter);
			}
		catch (java.io.IOException ioe)
			{
			}
			colorprint.println(col.getRed());
			System.out.println(col.getRed());
			colorprint.println(col.getGreen());
			System.out.println(col.getGreen());
			colorprint.println(col.getBlue());
			System.out.println(col.getBlue());
			colorprint.flush();
			colorprint.close();
				//show main panel 
                        org.guigen.uigen.AppUIMainTopComponent.showPanel(gui);
                        org.guigen.uigen.AppUIMainTopComponent.currentPanel=gui;

			}
	}
	private void scrdec()
	{
					if (ScrRed.isEnabled()==true)
					{
					ScrRed.setEnabled(false);
					ScrGreen.setEnabled(false);
					ScrBlue.setEnabled(false);
					}
					center.setBackground(col);
	}
	public Color getbgColor()
	{
		return col;
	}
	public boolean getOk()
	{
		return okc;
	}
	public int getR()
	{
		return r;
	}
	public javax.swing.JScrollBar ScrRed,ScrBlue,ScrGreen;
	public java.awt.Panel one,two,center,extra;
	public java.awt.CheckboxGroup colorcbg;
	public java.awt.Button Ok_button;
	public java.awt.Checkbox white,gray,lightGray,darkGray,black,red,pink,orange,yellow,green,magenta,cyan,blue,custom;
	int r=255,g=255,b=255;
	java.awt.Color col= java.awt.Color.white;
	boolean okc=true;
	
	private java.io.File colorinfo;
	private java.io.FileWriter colorwriter;
	private java.io.PrintWriter colorprint;
        static Guigen gui;
	
}