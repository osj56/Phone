package project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Plus extends Info implements ActionListener{
	JTextField jf, pnum, grp;
	
	public Plus(JTextField jf, JTextField pnum, JTextField grp){
		
		super(jf, pnum, grp);
	}
	
	
	public void actionPerformed(ActionEvent e){
	
		super.Print();
		
	}
}
