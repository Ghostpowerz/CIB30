package com.BU.CIB30;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @author s5009373
 * CREATE BASIC GUI
 * FOREGROUND/BACKGROUND FORMATTING
 * SCREENSIZE 1200x1080
 */

public class testGUI {

	private JFrame applicationFrame;
	private JPanel employeePanel;
	private JButton helpButton, clockInButton, clockOutButton, exitButton, logOutButton;
	private JLabel workCodeLabel, descriptionLabel, employeeLogo;
	private JTextField workCodeTextField, descriptionTextField;

	Font mainFont = new Font("Arial", Font.PLAIN,25);

	Color testColor = new Color(255, 255, 255);

	private testGUI() {
		createApplicationFrame();
		createEmployeePanel();
		createEmployeeButton();
		createEmployeeLabel();
		createEmployeeTextField();
		addApplicationItems();
	}

	private void createApplicationFrame() {
		applicationFrame = new JFrame("Design & Solutions Co");
		applicationFrame.setSize(800, 600);
		applicationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		applicationFrame.setVisible(true);
	}

	private void createEmployeePanel() {
		employeePanel = new JPanel();
		employeePanel.setLayout(null);
		employeePanel.setBackground(Color.GRAY);
	}

	private void createEmployeeButton() {
		helpButton = new JButton("Help");
		helpButton.setBounds(450, 225, 70, 35);
		helpButton.addActionListener(new helpHandler());
		
		clockInButton = new JButton("Clock In");
		clockInButton.setBounds(270, 340, 90, 35);
		
		clockOutButton = new JButton("Clock Out");
		clockOutButton.setBounds(380, 340, 90, 35);
		
		exitButton = new JButton("Exit");
		exitButton.setBounds(680, 17, 90, 35);
		exitButton.addActionListener(new exitHandler());
		
		logOutButton = new JButton("Log Out");
		logOutButton.setBounds(580, 17, 90, 35);
		//INSERT ACTION HANDLER FOR LOGOUT
		
	}

	private void createEmployeeLabel() {
		workCodeLabel = new JLabel("Work Code");
		workCodeLabel.setFont(mainFont);
		workCodeLabel.setBounds(310, 60, 200, 200);
		workCodeLabel.setForeground(Color.WHITE);

		descriptionLabel = new JLabel("Description");
		descriptionLabel.setBounds(310, 170, 200, 200);
		descriptionLabel.setFont(mainFont);
		descriptionLabel.setForeground(Color.WHITE);
		
		employeeLogo = new JLabel(new ImageIcon("kingfisherLogo.png"));
		employeeLogo.setBounds(20, 20, 200, 70);
		
	}

	private void createEmployeeTextField() {
		workCodeTextField = new JTextField();
		workCodeTextField.setBounds(315, 185, 120, 34);
		workCodeTextField.setBackground(Color.GRAY);
		workCodeTextField.setForeground(Color.WHITE);
		workCodeTextField.setFont(mainFont);

		descriptionTextField = new JTextField();
		descriptionTextField.setBounds(265, 290, 220, 34);
		descriptionTextField.setBackground(Color.GRAY);
		descriptionTextField.setForeground(Color.WHITE);
		descriptionTextField.setFont(new Font("Arial", Font.PLAIN,15));
	}

	private void addApplicationItems() {
		applicationFrame.add(employeePanel);
		employeePanel.add(helpButton);
		employeePanel.add(workCodeLabel);
		employeePanel.add(workCodeTextField);
		employeePanel.add(descriptionLabel);
		employeePanel.add(descriptionTextField);
		employeePanel.add(employeeLogo);
		employeePanel.add(clockInButton);
		employeePanel.add(clockOutButton);
		employeePanel.add(exitButton);
		employeePanel.add(logOutButton);
	}
	
	class exitHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	
	class helpHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(applicationFrame, "<html><h1><font color=#23e8ef>Clock in/Clock out System</font></h1>"
					+ "<h2>Employee Codes</h2>"
					+ "<h3>Test</h3> </html>");
		}
	}


	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new testGUI();
			}
		});
	}

}
