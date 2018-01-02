package project;

import javax.swing.*;
import java.awt.event.*;

public class MouseEventHandler extends MouseAdapter{
	public void mouseClicked(MouseEvent e){
		System.out.println("마우스 버튼 눌렷다 풀림");
	}
}
