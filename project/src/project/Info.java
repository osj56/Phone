package project;

import javax.swing.JTextField;

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
	 
		System.out.println("이름: "+name.getText());
		System.out.println("번호: "+pnum.getText());
		System.out.println("소속: "+grp.getText());
		name.setText("");
		pnum.setText("");
		grp.setText("");
	}
	
}
