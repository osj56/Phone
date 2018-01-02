package project;

import javax.swing.*;
import java.awt.event.*;

public class MouseMotionHandler implements MouseMotionListener{
	public void mouseDragged(MouseEvent e){
		System.out.printf("Drag [%d %d] \n", e.getX(), e.getY());
	}
	public void mouseMoved(MouseEvent e){
		System.out.printf("Move [%d %d] \n", e.getX(), e.getY());
	}

}
