package com.BU.CIB30;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * @author s5009373
 * CREATE BASIC GUI
 * FOREGROUND/BACKGROUND FORMATTING
 * SCREENSIZE 1200x1080
 */

public class testGUI {
	
	private JFrame applicationFrame;
	
	private testGUI() {
		createApplicationFrame();
	}
	
	private void createApplicationFrame() {
		applicationFrame = new JFrame("Design & Solutions Co");
		applicationFrame.setSize(1200, 1080);
		applicationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		applicationFrame.setVisible(true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new testGUI();
			}
		});
	}

}
