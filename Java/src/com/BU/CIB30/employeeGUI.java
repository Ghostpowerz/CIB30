package com.BU.CIB30;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 * @author s5009373
 * CREATE BASIC GUI
 * FOREGROUND/BACKGROUND FORMATTING
 * SCREENSIZE 1200x1080
 */

public class testGUI {
	
	private JFrame applicationFrame;
	private JPanel employeePanel;
	private JButton empButton1;
	
	private testGUI() {
		createApplicationFrame();
		createEmployeePanel();
		createEmployeeButton();
	}
	
	private void createApplicationFrame() {
		applicationFrame = new JFrame("Design & Solutions Co");
		applicationFrame.setSize(1200, 800);
		applicationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		applicationFrame.setVisible(true);
	}
	
	private void createEmployeePanel() {
		employeePanel = new JPanel();
		employeePanel.setLayout(null);
		employeePanel.add(empButton1);
	}
	
	private void createEmployeeButton() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new testGUI();
			}
		});
	}

}
