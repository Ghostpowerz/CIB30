package com.BU.CIB30;

import java.awt.*;
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
	private JButton helpButton;
	private JLabel workCodeLabel, descriptionLabel;
	private JTextField workCodeTextField, descriptionTextField;
	
	Font mainFont = new Font("Pleuf Pro", Font.PLAIN,25);
	
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
		applicationFrame.setSize(1200, 800);
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
		helpButton.setBounds(1000, 300, 80, 30);
	}
	
	private void createEmployeeLabel() {
		workCodeLabel = new JLabel("Work Code");
		workCodeLabel.setFont(mainFont);
		workCodeLabel.setBounds(520, 190, 200, 200);
		workCodeLabel.setForeground(Color.WHITE);
		
		descriptionLabel = new JLabel("Description");
		descriptionLabel.setBounds(517, 310, 200, 200);
		descriptionLabel.setFont(mainFont);
		descriptionLabel.setForeground(Color.WHITE);
	}
	
	private void createEmployeeTextField() {
		workCodeTextField = new JTextField();
		workCodeTextField.setBounds(516, 330, 120, 30);
		workCodeTextField.setBackground(Color.GRAY);
		workCodeTextField.setFont(mainFont);
		
		descriptionTextField = new JTextField();
		descriptionTextField.setBounds(516, 450, 120, 30);
		descriptionTextField.setBackground(Color.GRAY);
		descriptionTextField.setFont(mainFont);
	}
	
	private void addApplicationItems() {
		applicationFrame.add(employeePanel);
		employeePanel.add(helpButton);
		employeePanel.add(workCodeLabel);
		employeePanel.add(workCodeTextField);
		employeePanel.add(descriptionLabel);
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new testGUI();
			}
		});
	}

}
