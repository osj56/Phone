package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class List{
	JTextField name, pnum, grp;
	Info info = new Info( name, pnum,  grp);
	
	public List(){
		name = info.getName();
		pnum = info.getPnum();
		grp = info.getGrp();
		
	}
	

	public void Print() {
		System.out.println("이름: "+name);
		System.out.println("번호: "+pnum);
		System.out.println("소속: "+grp);
		name.setText("");
		pnum.setText("");
		grp.setText("");
	}
	
}
