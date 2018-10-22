package project;

import javax.swing.JTextField;
import java.util.*;
public class Info {
	public JTextField name;
	public JTextField pnum;
	public JTextField grp;

	public Info(JTextField name, JTextField pnum, JTextField grp){
		this.name = name;
		this.pnum = pnum;
		this.grp = grp;

	}
	public void setName(JTextField Name){
		Name = name;
	}
	
	public void setPnum(JTextField Pnum){
		Pnum = name;
	}

	public void setGrp(JTextField Grp){
		Grp = grp;
	}
	public JTextField getName(){
		return name;
	}
	public JTextField getPnum(){
		return pnum;
	}
	public JTextField getGrp(){
		return grp;
	}
	public void Print(){

		System.out.println("�̸�: "+name.getText());
		System.out.println("��ȣ: "+pnum.getText());
		System.out.println("�Ҽ�: "+grp.getText());
		name.setText("");
		pnum.setText("");
		grp.setText("");
	}

}
