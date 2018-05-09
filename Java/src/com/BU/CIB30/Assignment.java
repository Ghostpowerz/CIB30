package com.BU.CIB30;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Assignment {
	
	Font mainFont = new Font("Arial", Font.PLAIN,20);
	
	private JFrame applicationFrame;
	private JPanel assignmentPanel;
	private JLabel employeeLogo, unassignedEmployeeLabel, projectCodeLabel;
	private JButton assignmentExitButton, assignmentLogOutButton, assignmentBackButton, assignButton;
	private JComboBox<String> employeeComboBox, projectCodeComboBox;
	
	private Assignment() {
		createApplicationFrame();
		createAssignmentPanel();
		createAssignmentLabel();
		createAssignmentComboBox();
		createAssignmentButton();
		addApplicationItems();
		}
	
	private void createApplicationFrame() {
		applicationFrame = new JFrame("Design & Solutions Co");
		applicationFrame.setSize(800, 600);
		applicationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		applicationFrame.setVisible(true);
	}
	
	private void createAssignmentPanel() {
		assignmentPanel = new JPanel();
		assignmentPanel.setLayout(null);
		assignmentPanel.setBackground(Color.LIGHT_GRAY);
		
	}
	
	private void createAssignmentLabel() {
		employeeLogo = new JLabel(new ImageIcon("kingfisherLogo.png"));
		employeeLogo.setBounds(20, 20, 200, 70);
		
		unassignedEmployeeLabel = new JLabel("Currently unassigned employees");
		unassignedEmployeeLabel.setBounds(230, -30, 400, 400);
		unassignedEmployeeLabel.setFont(mainFont);
		
		projectCodeLabel = new JLabel("Project Codes");
		projectCodeLabel.setBounds(300, 170, 200, 200);
		projectCodeLabel.setFont(mainFont);
		
	}
	
	private void createAssignmentComboBox() {
		employeeComboBox = new JComboBox<String>();
		employeeComboBox.addItem("Employee 1");
		employeeComboBox.addItem("Employee 2");
		employeeComboBox.addItem("Employee 3");
		employeeComboBox.addItem("Employee 4");
		employeeComboBox.addItem("Employee 5");
		employeeComboBox.setBounds(270, 200, 200, 34);
		
		projectCodeComboBox = new JComboBox<String>();
		projectCodeComboBox.addItem("CODE 1");
		projectCodeComboBox.addItem("CODE 2");
		projectCodeComboBox.addItem("CODE 3");
		projectCodeComboBox.addItem("CODE 4");
		projectCodeComboBox.addItem("CODE 5");
		projectCodeComboBox.setBounds(270, 300, 200, 34);
	}
	
	private void createAssignmentButton() {
		assignmentExitButton = new JButton("Exit");
		assignmentExitButton.setBounds(680, 17, 90, 35);
		assignmentExitButton.addActionListener(new exitHandler());
		
		assignmentLogOutButton = new JButton("Log Out");
		assignmentLogOutButton.setBounds(580, 17, 90, 35);
		
		assignmentBackButton = new JButton("Back");
		assignmentBackButton.setBounds(480, 17, 90, 35);
		
		assignButton = new JButton("Assign");
		assignButton.setBounds(317, 350, 90, 35);
	}
	
	private void addApplicationItems() {
		applicationFrame.add(assignmentPanel);
		assignmentPanel.add(employeeLogo);
		assignmentPanel.add(employeeComboBox);
		assignmentPanel.add(assignmentExitButton);
		assignmentPanel.add(assignmentLogOutButton);
		assignmentPanel.add(assignmentBackButton);
		assignmentPanel.add(unassignedEmployeeLabel);
		assignmentPanel.add(projectCodeLabel);
		assignmentPanel.add(projectCodeComboBox);
		assignmentPanel.add(assignButton);
	}
	
	class exitHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Assignment();
			}
		});
	}

}
