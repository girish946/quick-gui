package org.guigen.uigen;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
package org.guigen.uigen;

/**
 *
 * @author girish
 */
import java.awt.*;
//import java.io.*;
public class Guigen extends java.awt.Panel implements java.awt.event.ActionListener
{
	
	
	///////////////////////////////////////////////////////////////////Constructor////////////////////////////////////////////////////////////



	public Guigen()
	{
		super();
	java.awt.BorderLayout bl=new java.awt.BorderLayout();
	setLayout(bl);
		//mainmenu=new java.awt.MenuBar();
	//	File_menu=new java.awt.Menu("File");
	//	Load_info=new java.awt.MenuItem("Load Info");
	//	Save_info=new java.awt.MenuItem("Save Info");
	//	mainmenu.add(File_menu);
	//	File_menu.add(Load_info);
	//	File_menu.add(Save_info);
	//	Save_info.addActionListener(this);
	//	Load_info.addActionListener(this);
	//	setMenuBar(mainmenu);
		one=new java.awt.Panel();
		two=new java.awt.Panel();
		three=new java.awt.Panel();
		three_one=new java.awt.Panel();
		three_two=new java.awt.Panel();
		three.setLayout(new java.awt.GridLayout(2,1));
		java.awt.GridLayout onegl= new java.awt.GridLayout(3,4);
		java.awt.GridLayout twogl=new java.awt.GridLayout(5,2);
		one.setLayout(onegl);
		two.setLayout(twogl);
		three.add(three_one);
		three.add(three_two);
		add(one,bl.NORTH);
		add(two,bl.CENTER);
		add(three,bl.SOUTH);
		Frame_Dialog=new java.awt.CheckboxGroup();
		Frame_Class=new java.awt.Checkbox("Frame",Frame_Dialog,true);
		Dialog_Class=new java.awt.Checkbox("DalogBox",Frame_Dialog,false);
		for (int i=0;i<4 ;i++ )
		{
			label_ary[i]=new java.awt.Label(label_name[i]);
			tf[i]=new java.awt.TextField(10);
			one.add(label_ary[i]);
			one.add(tf[i]);
		}
		tf[2].setText("500");
		tf[3].setText("500");
		Resize=new java.awt.CheckboxGroup();
		Visible=new java.awt.CheckboxGroup();
		Enabled=new java.awt.CheckboxGroup();
		Adaptor_Listener=new java.awt.CheckboxGroup();
		Resize_true=new java.awt.Checkbox("True",Resize,true);
		Resize_false=new java.awt.Checkbox("False",Resize,true);
		Visible_true=new java.awt.Checkbox("true",Visible,true);
		Visible_false=new java.awt.Checkbox("false",Visible,true);
		Enabled_true=new java.awt.Checkbox("true",Enabled,true);
		Enabled_false=new java.awt.Checkbox("false",Enabled,true);
		Adaptor=new java.awt.Checkbox("WindowAdaptor",Adaptor_Listener,true);
		Listener=new java.awt.Checkbox("WindowListener",Adaptor_Listener,false);
		Resize_cbg_label=new java.awt.Label("Resizeable");
		Visible_cbg_label=new java.awt.Label("Visible");
		Enabled_cbg_label=new java.awt.Label("Enabled");
		one.add(new java.awt.Label("    "));
		one.add(Frame_Class);
		one.add(new java.awt.Label("    "));
		one.add(Dialog_Class);
		two.add(Resize_cbg_label);
		two.add(Resize_true);
		two.add(Resize_false);
		two.add(Visible_cbg_label);
		two.add(Visible_true);
		two.add(Visible_false);
		two.add(Enabled_cbg_label);
		two.add(Enabled_true);
		two.add(Enabled_false);
		two.add(new java.awt.Label(" ADD   "));
		two.add(Adaptor);
		two.add(Listener);
		genrate_button=new java.awt.Button("Genrate Gui");
		setCur_button=new java.awt.Button("Set Cursor");
		addListeners=new java.awt.Button("Window_Listener");
		Color_button=new java.awt.Button("SetBackground Color");
		compile=new java.awt.Button("Compile&Run");
	//	iconi=new javax.swing.ImageIcon("java_icon.gif");
		icoImage=new java.awt.Button("compile");
		icoImage.addActionListener(this);
		Color_button.addActionListener(this);
		genrate_button.addActionListener(this);
		setCur_button.addActionListener(this);
		addListeners.addActionListener(this);
		compile.addActionListener(this);
		compile.setEnabled(false);
		three_one.add(setCur_button);
		three_one.add(icoImage);
		three_one.add(addListeners);
		three_one.add(Color_button);
		three_one.add(genrate_button);
		three_one.add(compile);
		Note=new java.awt.Label(" GuiGen");
		three_two.setLayout(new java.awt.BorderLayout());
		three_two.add(Note,java.awt.BorderLayout.NORTH);
		tf[0].addKeyListener(new java.awt.event.KeyAdapter()
		{
			public void keyTyped(java.awt.event.KeyEvent keve){
				java.io.File tempf=new java.io.File("Test_Trash\\"+tf[0].getText()+".java");
				if (tempf.exists())
				{
					Note.setText("the file already exists");
					compile.setEnabled(true);
				}
				else
				{
					Note.setText("GuiGen");
					compile.setEnabled(false);
				}
			}
		});
		tk = Toolkit.getDefaultToolkit();
//		imageicon=tk.getImage("java_icon.gif");
	Image pointer = tk.getImage("curcer.gif");
    Cursor myPointer= tk.createCustomCursor(pointer, new Point(10,10), "Blah");
	//this.setCursor(myPointer);
	Image text_pointer = tk.getImage("textcur.gif");
    Cursor txtpointer= tk.createCustomCursor(text_pointer, new Point(10,10), "Blah");
	for (int tfc=0;tfc<4 ;tfc++ )
	{
		tf[tfc].setCursor(txtpointer);
	}
//	ii=new URLGen("curcer.gif");
//	iu=new URLGen("java_icon.gif");
        wlp =new Window_Listener_Panel(this);
	setBackground(Color.BLACK);
		validate();
		invalidate();
		show();
		resize(485,501);
//		this.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		//setResizable(false);
		repaint();
	}


	/////////////////////////////////paint///////////////////////////////////////////////////////////////////////////////


	public void paint(Graphics g)
	{
	}


	//////////////////////////////////ActionPerformed/////////////////////////////////////////////////////////


	public void actionPerformed(java.awt.event.ActionEvent e)
	{
/*		if (e.getSource()==Save_info)
		{
			new InfoGen(this);
		}
            */
		if (e.getSource()==compile)
		{
			//new ComRun("Test_Trash",tf[0].getText()+".java",this);
		}
		if (e.getSource()==genrate_button)
		{
			
				try{
					write_file();
					compile.setEnabled(true);
				}
			catch(java.io.FileNotFoundException fnf)
			{
				compile.setEnabled(false);
					javax.swing.JOptionPane.showMessageDialog(null,"File not Found");
			}
			catch(java.lang.NullPointerException nuf)
				{
				compile.setEnabled(false);
				javax.swing.JOptionPane.showMessageDialog(null,"please enter all the parameters");
				}
		}
		if (e.getSource()==setCur_button)
		{
//			java.awt.FileDialog curFile=new java.awt.FileDialog(this,"Select cursor File");
//			curFile.setVisible(true);
//			if (curFile.getFile()!=null)
//			{
//				ImageUrl=new String(curFile.getDirectory()+curFile.getFile());
//		    iu=new URLGen(ImageUrl);
//			}
		}
		if (e.getSource()==addListeners)
		{
                        org.guigen.uigen.AppUIMainTopComponent.showPanel(wlp);
                        org.guigen.uigen.AppUIMainTopComponent.currentPanel=wlp;
			windowlistener_flag=true;
		}
		if (e.getSource()==Color_button)
		{
//			ColorDlg cdl=new ColorDlg(this);
//			cdl.setVisible(true);
//			//System.out.println(cdl.getbgColor().toString());
//			boolean b1=cdl.getOk();
//			System.out.println(b1);
//			if (b1==false)
//			{
//				bgcol=cdl.getbgColor();
//			System.out.println(bgcol.toString());
//			System.out.println(bgcol.getRed());
//			System.out.println(bgcol.getGreen());
//			System.out.println(bgcol.getBlue());
//			}
		}
		if (e.getSource()==icoImage)
		{
//			java.awt.FileDialog imgfile=new java.awt.FileDialog(this,"select image icon");
//			imgfile.setVisible(true);
//			IconUrl=new String(imgfile.getDirectory()+imgfile.getFile());
//			icon=new javax.swing.ImageIcon(IconUrl);
//			icoImage.setIcon(icon);
//			ii=new URLGen(IconUrl);
//			repaint();
		}
	}



	/////////////////////////////////////////////////////////Write_File////////////////////////////////////////////////////////////


	public void write_file() throws java.io.FileNotFoundException,java.lang.NullPointerException
	{
		if (tf[0].getText()!=null)
		{
			java.io. File outputfile=new java.io.File(tf[0].getText()+".java");
		try{java.io.FileWriter os=new java.io.FileWriter(outputfile);
		pw=new java.io.PrintWriter(os,true);
		}catch(java.io.IOException ioe){}
		pw.print("/*This UI is generated by GuiGen.\n*plz do not remove this comment*/");
		//pw.print("\n package Test_Trash;");
		pw.print("\nimport java.awt.*;\nimport java.awt.event.*;");
		pw.print("\npublic class "+tf[0].getText());
		if (Frame_Class.getState()==true)
		{
			pw.print(" extends java.awt.Frame ");
		}
		else
			{
			pw.print(" extends java.awt.Dialog ");
			}
		if (windowlistener_flag==true)
		{
			pw.print("implements WindowListener \n \t \t \t{");
		}
		pw.print("public "+tf[0].getText()+"() \n \t \t \t {\n \t \t \t \t");
		pw.print("super(\""+tf[1].getText()+"\");\n \t \t \t \t");
	//	this.setbgcol();
//		pw.print("Toolkit tk = Toolkit.getDefaultToolkit();\n \t \t \t \t Image pointer = tk.getImage(\""+iu.getUrl()+"\");\n \t \t \t \t Cursor myPointer= tk.createCustomCursor(pointer, new Point(10,10), \"Blah\");");
	//	pw.print("this.setCursor(myPointer);");
		//pw.print("this.setIconImage(tk.getImage(\""+ii.getUrl()+"\"));\n \t \t \t \t");
		pw.print("validate();\n \t \t \t \t invalidate();\n \t \t \t \tresize("+Integer.parseInt(tf[2].getText())+","+Integer.parseInt(tf[3].getText())+");\n \t \t \t \t");
		if (Resize_false.getState()==true)
		{
			pw.print("setResizable(false);\n \t \t \t \t");
		}
		if (Visible_true.getState()==true)
		{
			pw.print("setVisible(true);\n \t \t \t \t");
		}
		else
		{
			pw.print("setVisible(false);\n \t \t \t \t");
		}
		if (Enabled_true.getState()==true)
		{
			pw.print("setEnabled(true);\n \t \t \t \t");
		}
		else
		{
			pw.print("setEnabled(false);\n \t \t \t");
		}
		if (windowlistener_flag==true)
		{
			pw.print("addWindowListener(this);\n \t \t \t");
		}
		pw.print("}\n \t \t");
		if (windowlistener_flag==true)
		{
			for (int i=0;i<7 ;i++ )
			{
				
			pw.print("public void "+wlp.label_String[i]+"(WindowEvent we)\n \t \t {\n \t \t \t");
			pw.print(wlp.editText[i].getText());
			pw.print("}\n\t \t");
			}
		}
		pw.print("public static void main(String args[])\n \t \t \t{\n\t \t \t \t new "+tf[0].getText()+"();\n \t\t\t}\n \t\t");
		pw.print("}");
		pw.print("/**This code is generated by GuiGenerator.\n*please don't remove this comment*/");
		pw.flush();
    pw.close();
	}
	}


	///////////////////////////////////////////////////////////////Setbg color///////////////////////////////////////////////////////////////////


	private void setbgcol()
	{
		try{
		java.io.File colorf=new java.io.File("bgcolor.info");
		java.io.BufferedReader bufread=new java.io.BufferedReader(new java.io.FileReader(new java.io.File("bgcolor.info")));
		pw.print("this.setBackground(new java.awt.Color(");
		for (int i=0;i<3 ;i++ )
		{
			try{
			pw.print(bufread.readLine());
			}
			catch(java.io.IOException ioexc){}
			if (i==2)
			{
				pw.print("))\n \t \t \t \t;");
			}
			else
			{
				pw.print(",");
			}
		}
		}
		catch(java.io.FileNotFoundException fne){}

	}

	/////////////////////////////////////////////////////////////////////////////Main////////////////////////////////////////////////////////////////////////////////
	//public static void main(String a[])
//	{
//		new GuiGen();
//	}



	/////////////////////////////////////////////////////////////////decl///////////////////////////////////////////////////////////////////////////////////////////////



	private java.io.PrintWriter pw;
	private java.awt.Panel one,two,three,three_one,three_two;
	private java.awt.Label label_ary[]=new Label[4];
	public java.awt.Label Note;
	private java.lang.String label_name[]={"Name","Title","Height","Width"};
	public java.awt.TextField tf[]=new java.awt.TextField[4];
	private java.awt.Label Resize_cbg_label,Visible_cbg_label,Enabled_cbg_label;
	public java.awt.CheckboxGroup Resize,Visible,Enabled,Adaptor_Listener,Frame_Dialog;
	public java.awt.Checkbox Resize_true,Resize_false,Visible_true,Visible_false,Enabled_true,Enabled_false,Adaptor,Listener,Frame_Class,Dialog_Class;
	private java.awt.Button genrate_button;
	private java.awt.Button setCur_button;
	private java.awt.Button addListeners;
	private java.awt.Button Color_button;
	private java.awt.Button icoImage;
	private java.awt.Image imageicon;
	private javax.swing.Icon iconi;
	private javax.swing.Icon icon;
	private java.awt.Button compile;
//	private java.awt.MenuBar mainmenu;
//	private java.awt.Menu File_menu;
//	private java.awt.MenuItem Load_info;
//	private java.awt.MenuItem Save_info;
	java.lang.String ImageUrl,IconUrl;
	//URLGen iu,ii;
	static Window_Listener_Panel wlp;
	Toolkit tk ;
	boolean windowlistener_flag=false;
	private	java.awt.Color bgcol,fgcol;
}
