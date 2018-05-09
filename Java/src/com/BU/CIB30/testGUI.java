package com.BU.CIB30;

import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.*;

public class testGUI {
	Font mainFont = new Font("Arial", Font.PLAIN,25);
	Color testColor = new Color(255, 255, 255);
	
	private JFrame applicationFrame;
	private JPanel applicationPanel, employeePanel, adminPanel, approvalPanel;
	private JButton applicationLogIn, applicationExit, employeeHelp, employeeClockIn, employeeClockOut, employeeExit, employeeLogOut, adminHelp, adminClockIn, adminClockOut, adminExit, adminLogOut, adminApproval, adminReport, approvalExit, approvalLogOut, approvalConfirm, approvalDeny;
	private JTextField applicationUser, employeeWorkCode, employeeDescription, adminWorkCode, adminDescription;
	private JLabel applicationUserLabel, applicationPassLabel, applicationLogo, employeeWorkCodeLabel, employeeDescriptionLabel, employeeLogo, adminWorkCodeLabel, adminDescriptionLabel, adminLogo, approvalLogo, headerOne, headerTwo, headerThree, headerFour, headerFive;
	private JPasswordField applicationPass;
	public String clockinTime;
	private testNoGUI method = new testNoGUI();
	
	private void createApplicationFrame() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		applicationPanel = new JPanel();
		applicationPanel.setBackground(new Color(158, 158, 157));
		applicationPanel.setLayout(null);
		applicationPanel.setVisible(true);
		
		employeePanel = new JPanel();
		employeePanel.setLayout(null);
		employeePanel.setBackground(new Color(158, 158, 157));
		
		adminPanel = new JPanel();
		adminPanel.setLayout(null);
		adminPanel.setBackground(new Color(158, 158, 157));
		
		approvalPanel = new JPanel();
		approvalPanel.setLayout(null);
		approvalPanel.setBackground(Color.GRAY);
		
		applicationFrame = new JFrame("Design & Solutions Co");
		applicationFrame.setSize(800, 600);
		applicationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		applicationFrame.setLocation(screenSize.width / 2 - applicationFrame.getSize().width / 2, screenSize.height / 2 - applicationFrame.getSize().height / 2);
		applicationFrame.setVisible(true);
		applicationFrame.setResizable(false);
	}
	
	public void createJButton() {
		applicationLogIn = new JButton("Log In");
		applicationLogIn.setBounds(350, 300, 100, 20);
		applicationLogIn.setBackground(Color.GRAY);
		applicationLogIn.setForeground(Color.LIGHT_GRAY);
		applicationLogIn.setFont(new Font("Serif", Font.PLAIN, 13));
		applicationLogIn.addActionListener(new loginHandler());
		applicationPanel.add(applicationLogIn);
		
		applicationExit = new JButton("Exit");
		applicationExit.setBounds(700, 50, 60, 30);
		applicationExit.setBackground(Color.GRAY);
		applicationExit.setForeground(Color.LIGHT_GRAY);
		applicationExit.setFont(new Font("Serif", Font.PLAIN, 10));
		applicationExit.addActionListener(new exitHandler());
		applicationPanel.add(applicationExit);
		
		employeeHelp = new JButton("Help");
		employeeHelp.setBounds(450, 225, 70, 35);
		employeeHelp.addActionListener(new helpHandler());
		employeePanel.add(employeeHelp);
		
		employeeClockIn = new JButton("Clock In");
		employeeClockIn.setBounds(270, 340, 90, 35);
		employeePanel.add(employeeClockIn);
		
		employeeClockOut = new JButton("Clock Out");
		employeeClockOut.setBounds(380, 340, 90, 35);
		employeePanel.add(employeeClockOut);
		
		employeeExit = new JButton("Exit");
		employeeExit.setBounds(680, 17, 90, 35);
		employeeExit.addActionListener(new exitHandler());
		employeePanel.add(employeeExit);
		
		employeeLogOut = new JButton("Log Out");
		employeeLogOut.setBounds(580, 17, 90, 35);
		employeeLogOut.addActionListener(new backHandler());
		employeePanel.add(employeeLogOut);
		
		adminHelp = new JButton("Help");
		adminHelp.setBounds(450, 225, 70, 35);
		adminHelp.addActionListener(new helpHandler());
		adminPanel.add(adminHelp);
		
		adminClockIn = new JButton("Clock In");
		adminClockIn.setBounds(270, 340, 90, 35);
		adminClockIn.addActionListener(new clockinHandler());
		adminPanel.add(adminClockIn);
		
		adminClockOut = new JButton("Clock Out");
		adminClockOut.setBounds(380, 340, 90, 35);
		adminPanel.add(adminClockOut);
		
		adminExit = new JButton("Exit");
		adminExit.setBounds(680, 17, 90, 35);
		adminExit.addActionListener(new exitHandler());
		adminPanel.add(adminExit);
		
		adminLogOut = new JButton("Log Out");
		adminLogOut.setBounds(580, 17, 90, 35);
		adminLogOut.addActionListener(new backHandler());
		adminPanel.add(adminLogOut);
		
		adminApproval = new JButton("Timesheet Review");
		adminApproval.setBounds(300, 400, 150, 35);
		adminApproval.addActionListener(new reviewHandler());
		adminPanel.add(adminApproval);
		
		adminReport = new JButton("Report Review");
		adminReport.setBounds(300, 450, 150, 35);
		//adminReport.addActionListener(new reportHandler());
		adminPanel.add(adminReport);
		
		approvalExit = new JButton("Exit");
		approvalExit.setBounds(680, 17, 90, 35);
		approvalExit.addActionListener(new exitHandler());
		approvalPanel.add(approvalExit);

		approvalLogOut = new JButton("Log Out");
		approvalLogOut.setBounds(580, 17, 90, 35);
		approvalLogOut.addActionListener(new backHandler());
		approvalPanel.add(approvalLogOut);
		
		approvalConfirm = new JButton("Approve");
		approvalConfirm.setBounds(285, 90, 90, 35);
		approvalPanel.add(approvalConfirm);
		
		approvalDeny = new JButton("Deny");
		approvalDeny.setBounds(385, 90, 90, 35);
		approvalPanel.add(approvalDeny);
	}
	
	public void createJTextField() {
		applicationUser = new JTextField();
		applicationUser.setBounds(350, 175, 100, 30);
		applicationUser.setBackground(Color.LIGHT_GRAY);
		applicationUser.setForeground(Color.DARK_GRAY);
		applicationUser.setFont(new Font("Serif", Font.PLAIN, 13));
		applicationPanel.add(applicationUser);
		
		employeeWorkCode = new JTextField();
		employeeWorkCode.setBounds(315, 185, 120, 34);
		employeeWorkCode.setBackground(Color.GRAY);
		employeeWorkCode.setForeground(Color.WHITE);
		employeeWorkCode.setFont(mainFont);
		employeePanel.add(employeeWorkCode);

		employeeDescription = new JTextField();
		employeeDescription.setBounds(265, 290, 220, 34);
		employeeDescription.setBackground(Color.GRAY);
		employeeDescription.setForeground(Color.WHITE);
		employeeDescription.setFont(new Font("Arial", Font.PLAIN,15));
		employeePanel.add(employeeDescription);
		
		adminWorkCode = new JTextField();
		adminWorkCode.setBounds(315, 185, 120, 34);
		adminWorkCode.setBackground(Color.GRAY);
		adminWorkCode.setForeground(Color.WHITE);
		adminWorkCode.setFont(mainFont);
		adminPanel.add(adminWorkCode);

		adminDescription = new JTextField();
		adminDescription.setBounds(265, 290, 220, 34);
		adminDescription.setBackground(Color.GRAY);
		adminDescription.setForeground(Color.WHITE);
		adminDescription.setFont(new Font("Arial", Font.PLAIN,15));
		adminPanel.add(adminDescription);
	}

	public void createJPasswordField() {
		applicationPass = new JPasswordField(10);
		applicationPass.setBounds(350, 250, 100, 30);
		applicationPass.setBackground(Color.LIGHT_GRAY);
		applicationPass.setForeground(Color.DARK_GRAY);
		applicationPass.setFont(new Font("Serif", Font.PLAIN, 13));
		applicationPanel.add(applicationPass);
	}
	
	public void createJLabel() {
		applicationUserLabel = new JLabel("Username");
		applicationUserLabel.setBounds(370, 150, 100, 30);
		applicationUserLabel.setForeground(new Color(87, 86, 86));
		applicationUserLabel.setFont(new Font("Serif", Font.PLAIN, 15));
		applicationPanel.add(applicationUserLabel);
		
		applicationPassLabel = new JLabel("Password");
		applicationPassLabel.setBounds(370, 225, 100, 30);
		applicationPassLabel.setForeground(new Color(87, 86, 86));
		applicationPassLabel.setFont(new Font("Serif", Font.PLAIN, 15));
		applicationPanel.add(applicationPassLabel);
		
		applicationLogo = new JLabel(new ImageIcon("kingfisherLogo.png"));
		applicationLogo.setBounds(40, 20, 200, 70);
		applicationPanel.add(applicationLogo);
		
		employeeWorkCodeLabel = new JLabel("Work Code");
		employeeWorkCodeLabel.setFont(mainFont);
		employeeWorkCodeLabel.setBounds(310, 60, 200, 200);
		employeeWorkCodeLabel.setForeground(Color.WHITE);
		employeePanel.add(employeeWorkCodeLabel);

		employeeDescriptionLabel = new JLabel("Description");
		employeeDescriptionLabel.setBounds(310, 170, 200, 200);
		employeeDescriptionLabel.setFont(mainFont);
		employeeDescriptionLabel.setForeground(Color.WHITE);
		employeePanel.add(employeeDescriptionLabel);
		
		employeeLogo = new JLabel(new ImageIcon("kingfisherLogo.png"));
		employeeLogo.setBounds(20, 20, 200, 70);
		employeePanel.add(employeeLogo);
		
		adminWorkCodeLabel = new JLabel("Work Code");
		adminWorkCodeLabel.setFont(mainFont);
		adminWorkCodeLabel.setBounds(310, 60, 200, 200);
		adminWorkCodeLabel.setForeground(Color.WHITE);
		adminPanel.add(adminWorkCodeLabel);

		adminDescriptionLabel = new JLabel("Description");
		adminDescriptionLabel.setBounds(310, 170, 200, 200);
		adminDescriptionLabel.setFont(mainFont);
		adminDescriptionLabel.setForeground(Color.WHITE);
		adminPanel.add(adminDescriptionLabel);
		
		adminLogo = new JLabel(new ImageIcon("kingfisherLogo.png"));
		adminLogo.setBounds(20, 20, 200, 70);
		adminPanel.add(adminLogo);
		
		approvalLogo = new JLabel(new ImageIcon("kingfisherLogo.png"));
		approvalLogo.setBounds(20, 20, 200, 70);
		approvalPanel.add(approvalLogo);
		
		headerOne = new JLabel("Header1");
		headerOne.setBounds(70, 130, 100, 100);
		headerOne.setFont(mainFont);
		approvalPanel.add(headerOne);
		
		headerTwo = new JLabel("Header2");
		headerTwo.setBounds(200, 130, 100, 100);
		headerTwo.setFont(mainFont);
		approvalPanel.add(headerTwo);
		
		headerThree = new JLabel("Header3");
		headerThree.setBounds(330, 130, 100, 100);
		headerThree.setFont(mainFont);
		approvalPanel.add(headerThree);
		
		headerFour = new JLabel("Header4");
		headerFour.setBounds(460, 130, 100, 100);
		headerFour.setFont(mainFont);
		approvalPanel.add(headerFour);
		
		headerFive = new JLabel("Header5");
		headerFive.setBounds(590, 130, 100, 100);
		headerFive.setFont(mainFont);
		approvalPanel.add(headerFive);
	}

	public testGUI() {
		createApplicationFrame();
		createJButton();
		createJTextField();
		createJLabel();
		createJPasswordField();
		
		applicationFrame.add(applicationPanel);
		applicationFrame.add(employeePanel);
		applicationFrame.add(adminPanel);
		applicationFrame.add(approvalPanel);
		applicationFrame.setContentPane(applicationPanel);
		applicationFrame.invalidate();
		applicationFrame.validate();
	}
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new testGUI();
			}
		});
	}
	
	class exitHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	
	class loginHandler implements ActionListener {
		@SuppressWarnings("deprecation")
		public void actionPerformed(ActionEvent e) {
			if (applicationUser.getText().equals("Emp") && applicationPass.getText().equals("pass")) {
				System.out.println("Go to Emp panel!");
				applicationFrame.setContentPane(employeePanel);
				applicationFrame.invalidate();
				applicationFrame.validate();
			} else if (applicationUser.getText().equals("Admin") && applicationPass.getText().equals("pass")) {
				System.out.println("Go to Admin Panel!");
				applicationFrame.setContentPane(adminPanel);
				applicationFrame.invalidate();
				applicationFrame.validate();
			} else {
				System.out.println("Wrong login info");
				JOptionPane.showMessageDialog(null, "Username and password don't match", "Login Error", JOptionPane.WARNING_MESSAGE);
			}
		}
	}
	
	class helpHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(applicationFrame, "<html><h1><font color=#23e8ef>Clock in/Clock out System</font></h1>"
					+ "<h2>Employee Codes</h2>"
					+ "<h3>Test</h3> </html>");
		}
	}
	
	class backHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			applicationFrame.setContentPane(applicationPanel);
			applicationFrame.invalidate();
			applicationFrame.validate();
		}
	}
	
	class reviewHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			applicationFrame.setContentPane(approvalPanel);
			applicationFrame.invalidate();
			applicationFrame.validate();
		}
	}
	
	class clockinHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			getHour(clockinTime);
			System.out.println(clockinTime);
		}
	}
	
	public String getHour(String theValue) {
		theValue = new SimpleDateFormat("mm").format(Calendar.getInstance().getTime());
		
		if (Integer.parseInt(theValue) >= 30) {
			
			theValue = new SimpleDateFormat("HH").format(Calendar.getInstance().getTime());
			theValue = String.valueOf(Integer.parseInt(theValue) + 1);
			
		} else {
			
			theValue = new SimpleDateFormat("HH").format(Calendar.getInstance().getTime());
		
		}
		System.out.println(theValue);
		return theValue;
	}
}
