package com.BU.CIB30;

import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.*;

public class testGUI {

	Font mainFont = new Font("Arial", Font.PLAIN,25);
	Font headerFont = new Font("Arial", Font.PLAIN,15);

	Color backgroundColor = new Color(242, 242, 242);
	Color buttonColor = new Color(242, 242, 242);
	Color foregroundColor = new Color(0, 0, 0);

	private JFrame applicationFrame;
	private JPanel applicationPanel, employeePanel, adminPanel, approvalPanel, assignmentPanel, reportSearchPanel, reportViewPanel;
	private JButton applicationLogIn, applicationExit, employeeHelp, employeeClockIn, employeeClockOut, employeeExit, employeeLogOut, adminHelp, adminClockIn, adminClockOut, adminExit, adminLogOut, adminApproval, adminReport, approvalExit, approvalLogOut, approvalConfirm, approvalDeny, assignmentExitButton, assignmentLogOutButton, assignmentBackButton, assignmentAssign, assignmentBack, adminAssignment, reportSearchButton, reportSearchLogOut, reportSearchExit, reportSearchBack, approvalBack, reportViewBack, reportViewLogOut, reportViewExit, reportViewDownload;
	private JTextField applicationUser, employeeWorkCode, employeeDescription, adminWorkCode, adminDescription, reportSearchTextField;
	private JLabel applicationUserLabel, applicationPassLabel, applicationLogo, employeeWorkCodeLabel, employeeDescriptionLabel, employeeLogo, adminWorkCodeLabel, adminDescriptionLabel, adminLogo, approvalLogo, headerOne, headerTwo, headerThree, headerFour, headerFive, headerSix, headerSeven, assignmentLogo, unassignedEmployeeLabel, assignmentProjLabel, reportSearchLabel, reportSearchLogo, reportViewLogo, outputLabel;
	private JPasswordField applicationPass;
	private JComboBox<String> employeeComboBox, projectCodeComboBox, reportSearchComboBox, reportViewComboBox;
	private boolean clockOut = false;
	private String clockinTime, empCode, workCode, projCode, clockinDate, clockinHour, clockStore, clockoutHour, totalHour, clockoutTime;
	ArrayList<String> toApprove = new ArrayList<String>();

	private void createApplicationFrame() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		applicationPanel = new JPanel();
		applicationPanel.setBackground(backgroundColor);
		applicationPanel.setLayout(null);
		applicationPanel.setVisible(true);

		employeePanel = new JPanel();
		employeePanel.setLayout(null);
		employeePanel.setBackground(backgroundColor);

		adminPanel = new JPanel();
		adminPanel.setLayout(null);
		adminPanel.setBackground(backgroundColor);

		approvalPanel = new JPanel();
		approvalPanel.setLayout(null);
		approvalPanel.setBackground(backgroundColor);

		assignmentPanel = new JPanel();
		assignmentPanel.setLayout(null);
		assignmentPanel.setBackground(backgroundColor);

		reportSearchPanel = new JPanel();
		reportSearchPanel.setLayout(null);
		reportSearchPanel.setBackground(backgroundColor);

		reportViewPanel = new JPanel();
		reportViewPanel.setLayout(null);
		reportViewPanel.setBackground(backgroundColor);

		applicationFrame = new JFrame("Design & Solutions Co");
		applicationFrame.setSize(800, 600);
		applicationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		applicationFrame.setLocation(screenSize.width / 2 - applicationFrame.getSize().width / 2, screenSize.height / 2 - applicationFrame.getSize().height / 2);
		applicationFrame.setVisible(true);
		applicationFrame.setResizable(false);
	}

	public void createJButton() {
		applicationLogIn = new JButton("Log In");
		applicationLogIn.setBounds(350, 310, 100, 20);
		applicationLogIn.setBackground(backgroundColor);
		applicationLogIn.setForeground(foregroundColor);
		applicationLogIn.addActionListener(new loginHandler());
		applicationPanel.add(applicationLogIn);

		applicationExit = new JButton("Exit");
		applicationExit.setBounds(680, 17, 90, 35);
		applicationExit.setBackground(backgroundColor);
		applicationExit.setForeground(foregroundColor);
		applicationExit.addActionListener(new exitHandler());
		applicationPanel.add(applicationExit);

		employeeHelp = new JButton("Help");
		employeeHelp.setBackground(backgroundColor);
		employeeHelp.setBounds(450, 225, 70, 35);
		employeeHelp.addActionListener(new helpHandler());
		employeePanel.add(employeeHelp);

		employeeClockIn = new JButton("Clock In");
		employeeClockIn.setBackground(backgroundColor);
		employeeClockIn.setBounds(270, 340, 90, 35);
		employeeClockIn.addActionListener(new clockinHandler2());
		employeePanel.add(employeeClockIn);

		employeeClockOut = new JButton("Clock Out");
		employeeClockOut.setBackground(backgroundColor);
		employeeClockOut.setBounds(380, 340, 90, 35);
		employeeClockOut.addActionListener(new clockoutHandler2());
		employeePanel.add(employeeClockOut);

		employeeExit = new JButton("Exit");
		employeeExit.setBackground(backgroundColor);
		employeeExit.setBounds(680, 17, 90, 35);
		employeeExit.addActionListener(new exitHandler());
		employeePanel.add(employeeExit);

		employeeLogOut = new JButton("Log Out");
		employeeLogOut.setBackground(backgroundColor);
		employeeLogOut.setBounds(580, 17, 90, 35);
		employeeLogOut.addActionListener(new backHandler());
		employeePanel.add(employeeLogOut);

		adminHelp = new JButton("Help");
		adminHelp.setBackground(backgroundColor);
		adminHelp.setBounds(450, 225, 70, 35);
		adminHelp.addActionListener(new helpHandler());
		adminPanel.add(adminHelp);

		adminClockIn = new JButton("Clock In");
		adminClockIn.setBackground(backgroundColor);
		adminClockIn.setBounds(270, 340, 90, 35);
		adminClockIn.addActionListener(new clockinHandler());
		adminPanel.add(adminClockIn);

		adminClockOut = new JButton("Clock Out");
		adminClockOut.setBackground(backgroundColor);
		adminClockOut.setBounds(380, 340, 90, 35);
		adminClockOut.addActionListener(new clockoutHandler());
		adminPanel.add(adminClockOut);

		adminExit = new JButton("Exit");
		adminExit.setBackground(backgroundColor);
		adminExit.setBounds(680, 17, 90, 35);
		adminExit.addActionListener(new exitHandler());
		adminPanel.add(adminExit);

		adminLogOut = new JButton("Log Out");
		adminLogOut.setBackground(backgroundColor);
		adminLogOut.setBounds(580, 17, 90, 35);
		adminLogOut.addActionListener(new backHandler());
		adminPanel.add(adminLogOut);

		adminApproval = new JButton("Timesheet Review");
		adminApproval.setBackground(backgroundColor);
		adminApproval.setBounds(300, 400, 150, 35);
		adminApproval.addActionListener(new reviewHandler());
		adminPanel.add(adminApproval);

		adminReport = new JButton("Report Review");
		adminReport.setBackground(backgroundColor);
		adminReport.setBounds(300, 450, 150, 35);
		adminReport.addActionListener(new reportSearchHandler());
		adminPanel.add(adminReport);

		approvalBack = new JButton("Back");
		approvalBack.setBackground(backgroundColor);
		approvalBack.setBounds(480, 17, 90, 35);
		approvalBack.addActionListener(new adminPanelHandler());
		approvalPanel.add(approvalBack);

		approvalExit = new JButton("Exit");
		approvalExit.setBackground(backgroundColor);
		approvalExit.setBounds(680, 17, 90, 35);
		approvalExit.addActionListener(new exitHandler());
		approvalPanel.add(approvalExit);

		approvalLogOut = new JButton("Log Out");
		approvalLogOut.setBackground(backgroundColor);
		approvalLogOut.setBounds(580, 17, 90, 35);
		approvalLogOut.addActionListener(new backHandler());
		approvalPanel.add(approvalLogOut);

		approvalConfirm = new JButton("Approve");
		approvalConfirm.setBackground(backgroundColor);
		approvalConfirm.setBounds(285, 90, 90, 35);
		approvalPanel.add(approvalConfirm);

		approvalDeny = new JButton("Deny");
		approvalDeny.setBackground(backgroundColor);
		approvalDeny.setBounds(385, 90, 90, 35);
		approvalPanel.add(approvalDeny);

		assignmentExitButton = new JButton("Exit");
		assignmentExitButton.setBackground(backgroundColor);
		assignmentExitButton.setBounds(680, 17, 90, 35);
		assignmentExitButton.addActionListener(new exitHandler());
		assignmentPanel.add(assignmentExitButton);

		assignmentLogOutButton = new JButton("Log Out");
		assignmentLogOutButton.setBackground(backgroundColor);
		assignmentLogOutButton.setBounds(580, 17, 90, 35);
		assignmentPanel.add(assignmentLogOutButton);

		assignmentBackButton = new JButton("Back");
		assignmentBackButton.setBackground(backgroundColor);
		assignmentBackButton.setBounds(480, 17, 90, 35);
		assignmentBackButton.addActionListener(new adminPanelHandler());
		assignmentPanel.add(assignmentBackButton);

		assignmentAssign = new JButton("Assign");
		assignmentAssign.setBackground(backgroundColor);
		assignmentAssign.setBounds(317, 350, 90, 35);
		assignmentPanel.add(assignmentAssign);

		assignmentBack = new JButton("Back");
		assignmentBack.setBackground(backgroundColor);
		assignmentBack.setBounds(480, 17, 90, 35);
		assignmentBack.addActionListener(new adminPanelHandler());
		assignmentPanel.add(assignmentBack);

		adminAssignment = new JButton("Assignment");
		adminAssignment.setBackground(backgroundColor);
		adminAssignment.setBounds(300, 500, 150, 35);
		adminAssignment.addActionListener(new assignmentHandler());
		adminPanel.add(adminAssignment);

		reportSearchButton = new JButton("Show");
		reportSearchButton.setBackground(backgroundColor);
		reportSearchButton.setBounds(450, 280, 70, 30);
		reportSearchPanel.add(reportSearchButton);
		reportSearchButton.addActionListener(new reportViewHandler());

		reportSearchLogOut = new JButton("Log Out");
		reportSearchLogOut.setBackground(backgroundColor);
		reportSearchLogOut.setBounds(580, 17, 90, 35);
		reportSearchLogOut.addActionListener(new backHandler());
		reportSearchPanel.add(reportSearchLogOut);

		reportSearchExit = new JButton("Exit");
		reportSearchExit.setBackground(backgroundColor);
		reportSearchExit.setBounds(680, 17, 90, 35);
		reportSearchExit.addActionListener(new exitHandler());
		reportSearchPanel.add(reportSearchExit);

		reportSearchBack = new JButton("Back");
		reportSearchBack.setBackground(backgroundColor);
		reportSearchBack.setBounds(480, 17, 90, 35);
		reportSearchBack.addActionListener(new adminPanelHandler());
		reportSearchPanel.add(reportSearchBack);

		reportViewBack = new JButton("Back");
		reportViewBack.setBackground(backgroundColor);
		reportViewBack.setBounds(480, 17, 90, 35);
		reportViewBack.addActionListener(new reportSearchBackHandler());
		reportViewPanel.add(reportViewBack);

		reportViewLogOut = new JButton("Log Out");
		reportViewLogOut.setBackground(backgroundColor);
		reportViewLogOut.setBounds(580, 17, 90, 35);
		reportViewLogOut.addActionListener(new backHandler());
		reportViewPanel.add(reportViewLogOut);

		reportViewExit = new JButton("Exit");
		reportViewExit.setBackground(backgroundColor);
		reportViewExit.setBounds(680, 17, 90, 35);
		reportViewExit.addActionListener(new exitHandler());
		reportViewPanel.add(reportViewExit);

		reportViewDownload = new JButton("Download");
		reportViewDownload.setBackground(backgroundColor);
		reportViewDownload.setBounds(480, 260, 90, 35);
		reportViewPanel.add(reportViewDownload);

	}

	public void createJTextField() {
		applicationUser = new JTextField();
		applicationUser.setBounds(350, 175, 100, 30);
		applicationUser.setBackground(backgroundColor);
		applicationUser.setForeground(foregroundColor);
		applicationUser.setFont(new Font("Serif", Font.PLAIN, 13));
		applicationPanel.add(applicationUser);

		employeeWorkCode = new JTextField();
		employeeWorkCode.setBounds(315, 185, 120, 34);
		employeeWorkCode.setBackground(backgroundColor);
		employeeWorkCode.setForeground(foregroundColor);
		employeeWorkCode.setFont(mainFont);
		employeeWorkCode.addFocusListener(new descriptionHandler());
		employeePanel.add(employeeWorkCode);

		employeeDescription = new JTextField();
		employeeDescription.setBounds(265, 290, 220, 34);
		employeeDescription.setBackground(backgroundColor);
		employeeDescription.setForeground(foregroundColor);
		employeeDescription.setFont(new Font("Arial", Font.PLAIN,15));
		employeePanel.add(employeeDescription);

		adminWorkCode = new JTextField();
		adminWorkCode.setBounds(315, 185, 120, 34);
		adminWorkCode.setBackground(backgroundColor);
		adminWorkCode.setForeground(foregroundColor);
		adminWorkCode.setFont(mainFont);
		adminWorkCode.addFocusListener(new descriptionHandler());
		adminPanel.add(adminWorkCode);

		adminDescription = new JTextField();
		adminDescription.setBounds(265, 290, 220, 34);
		adminDescription.setBackground(backgroundColor);
		adminDescription.setForeground(foregroundColor);
		adminDescription.setFont(new Font("Arial", Font.PLAIN,15));
		adminPanel.add(adminDescription);

		reportSearchTextField = new JTextField("");
		reportSearchTextField.setBackground(backgroundColor);
		reportSearchTextField.setBounds(290, 280, 150, 30);
		reportSearchPanel.add(reportSearchTextField);
	}

	public void createJPasswordField() {
		applicationPass = new JPasswordField(10);
		applicationPass.setBounds(350, 250, 100, 30);
		applicationPass.setBackground(backgroundColor);
		applicationPass.setForeground(foregroundColor);
		applicationPass.setFont(new Font("Serif", Font.PLAIN, 13));
		applicationPanel.add(applicationPass);
	}

	public void createJLabel() {
		applicationUserLabel = new JLabel("Username");
		applicationUserLabel.setBounds(370, 150, 100, 30);
		applicationUserLabel.setForeground(foregroundColor);
		applicationUserLabel.setFont(new Font("Serif", Font.PLAIN, 15));
		applicationPanel.add(applicationUserLabel);

		applicationPassLabel = new JLabel("Password");
		applicationPassLabel.setBounds(370, 225, 100, 30);
		applicationPassLabel.setForeground(foregroundColor);
		applicationPassLabel.setFont(new Font("Serif", Font.PLAIN, 15));
		applicationPanel.add(applicationPassLabel);

		applicationLogo = new JLabel(new ImageIcon("kingfisherLogo.png"));
		applicationLogo.setBounds(40, 20, 200, 70);
		applicationPanel.add(applicationLogo);

		employeeWorkCodeLabel = new JLabel("Work Code");
		employeeWorkCodeLabel.setFont(mainFont);
		employeeWorkCodeLabel.setBounds(310, 60, 200, 200);
		employeeWorkCodeLabel.setForeground(foregroundColor);
		employeePanel.add(employeeWorkCodeLabel);

		employeeDescriptionLabel = new JLabel("Description");
		employeeDescriptionLabel.setBounds(310, 170, 200, 200);
		employeeDescriptionLabel.setFont(mainFont);
		employeeDescriptionLabel.setForeground(foregroundColor);
		employeePanel.add(employeeDescriptionLabel);

		employeeLogo = new JLabel(new ImageIcon("kingfisherLogo.png"));
		employeeLogo.setBounds(20, 20, 200, 70);
		employeePanel.add(employeeLogo);

		adminWorkCodeLabel = new JLabel("Work Code");
		adminWorkCodeLabel.setFont(mainFont);
		adminWorkCodeLabel.setBounds(310, 60, 200, 200);
		adminWorkCodeLabel.setForeground(foregroundColor);
		adminPanel.add(adminWorkCodeLabel);

		adminDescriptionLabel = new JLabel("Description");
		adminDescriptionLabel.setBounds(310, 170, 200, 200);
		adminDescriptionLabel.setFont(mainFont);
		adminDescriptionLabel.setForeground(foregroundColor);
		adminPanel.add(adminDescriptionLabel);

		adminLogo = new JLabel(new ImageIcon("kingfisherLogo.png"));
		adminLogo.setBounds(20, 20, 200, 70);
		adminPanel.add(adminLogo);

		approvalLogo = new JLabel(new ImageIcon("kingfisherLogo.png"));
		approvalLogo.setBounds(20, 20, 200, 70);
		approvalPanel.add(approvalLogo);

		headerOne = new JLabel("EmpCode");
		headerOne.setBounds(35, 130, 100, 100);
		headerOne.setFont(headerFont);
		approvalPanel.add(headerOne);

		headerTwo = new JLabel("ProjCode");
		headerTwo.setBounds(145, 130, 100, 100);
		headerTwo.setFont(headerFont);
		approvalPanel.add(headerTwo);

		headerThree = new JLabel("Data");
		headerThree.setBounds(255, 130, 100, 100);
		headerThree.setFont(headerFont);
		approvalPanel.add(headerThree);

		headerFour = new JLabel("ClockIn");
		headerFour.setBounds(365, 130, 100, 100);
		headerFour.setFont(headerFont);
		approvalPanel.add(headerFour);

		headerFive = new JLabel("ClockOut");
		headerFive.setBounds(475, 130, 100, 100);
		headerFive.setFont(headerFont);
		approvalPanel.add(headerFive);

		headerSix = new JLabel("Time");
		headerSix.setBounds(585, 130, 100, 100);
		headerSix.setFont(headerFont);
		approvalPanel.add(headerSix);

		headerSeven = new JLabel("TaskDesc");
		headerSeven.setBounds(695, 130, 100, 100);
		headerSeven.setFont(headerFont);
		approvalPanel.add(headerSeven);

		assignmentLogo = new JLabel(new ImageIcon("kingfisherLogo.png"));
		assignmentLogo.setBounds(20, 20, 200, 70);
		assignmentPanel.add(assignmentLogo);

		unassignedEmployeeLabel = new JLabel("Currently unassigned employees");
		unassignedEmployeeLabel.setBounds(230, -30, 400, 400);
		unassignedEmployeeLabel.setFont(mainFont);
		assignmentPanel.add(unassignedEmployeeLabel);

		assignmentProjLabel = new JLabel("Project Codes");
		assignmentProjLabel.setBounds(300, 170, 200, 200);
		assignmentProjLabel.setFont(mainFont);
		assignmentPanel.add(assignmentProjLabel);

		reportSearchLogo = new JLabel(new ImageIcon("kingfisherLogo.png"));
		reportSearchLogo.setBounds(20, 20, 200, 70);
		reportSearchPanel.add(reportSearchLogo);

		reportSearchLabel = new JLabel("Search Parameter");
		reportSearchLabel.setBounds(285, 230, 300, 30);
		reportSearchLabel.setFont(mainFont);
		reportSearchPanel.add(reportSearchLabel);

		reportViewLogo = new JLabel(new ImageIcon("kingfisherLogo.png"));
		reportViewLogo.setBounds(20, 20, 200, 70);
		reportViewPanel.add(reportViewLogo);
		
		outputLabel = new JLabel("", SwingConstants.RIGHT);
		outputLabel.setBounds(30, 60, 280, 280);
		outputLabel.setFont(mainFont);
		adminPanel.add(outputLabel);
		employeePanel.add(outputLabel);
	}

	public void createComboBox() {
		employeeComboBox = new JComboBox<String>();
		employeeComboBox.addItem("Employee 1");
		employeeComboBox.addItem("Employee 2");
		employeeComboBox.addItem("Employee 3");
		employeeComboBox.addItem("Employee 4");
		employeeComboBox.addItem("Employee 5");
		employeeComboBox.setBounds(270, 200, 200, 34);
		assignmentPanel.add(employeeComboBox);

		projectCodeComboBox = new JComboBox<String>();
		projectCodeComboBox.addItem("CODE 1");
		projectCodeComboBox.addItem("CODE 2");
		projectCodeComboBox.addItem("CODE 3");
		projectCodeComboBox.addItem("CODE 4");
		projectCodeComboBox.addItem("CODE 5");
		projectCodeComboBox.setBounds(270, 300, 200, 34);
		assignmentPanel.add(projectCodeComboBox);

		reportSearchComboBox = new JComboBox<String>();
		reportSearchComboBox.addItem("Report 1");
		reportSearchComboBox.addItem("Report 2");
		reportSearchComboBox.addItem("Report 3");
		reportSearchComboBox.addItem("Report 4");
		reportSearchComboBox.addItem("Report 5");
		reportSearchComboBox.setBounds(290, 180, 220, 30);
		reportSearchPanel.add(reportSearchComboBox);

		reportViewComboBox = new JComboBox<String>();
		reportViewComboBox.addItem("FileExtension1");
		reportViewComboBox.addItem("FileExtension2");
		reportViewComboBox.addItem("FileExtension3");
		reportViewComboBox.addItem("FileExtension4");
		reportViewComboBox.addItem("FileExtension5");
		reportViewComboBox.setBounds(420,210,220,30);
		reportViewPanel.add(reportViewComboBox);
	}

	public testGUI() {
		createApplicationFrame();
		createJButton();
		createJTextField();
		createJLabel();
		createJPasswordField();
		createComboBox();

		applicationFrame.add(applicationPanel);
		applicationFrame.add(employeePanel);
		applicationFrame.add(adminPanel);
		applicationFrame.add(approvalPanel);
		applicationFrame.add(assignmentPanel);
		applicationFrame.add(reportSearchPanel);
		applicationFrame.add(reportViewPanel);
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
				applicationFrame.setContentPane(employeePanel);
				applicationFrame.invalidate();
				applicationFrame.validate();
				applicationUser.setText("");
				applicationPass.setText("");
			} else if (applicationUser.getText().equals("Admin") && applicationPass.getText().equals("pass")) {
				applicationFrame.setContentPane(adminPanel);
				applicationFrame.invalidate();
				applicationFrame.validate();
				applicationUser.setText("");
				applicationPass.setText("");
			} else {
				JOptionPane.showMessageDialog(null, "Username and password don't match", "Login Error", JOptionPane.WARNING_MESSAGE);
				applicationUser.setText("");
				applicationPass.setText("");

			}
		}
	}

	class helpHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(applicationFrame, "<html><h1><font color=#426ca9>Clock in/Clock out System</font></h1>"
					+ "<h2>Employee Codes</h2>"
					+ "<h3>Lunch - 999999 <br>"
					+ "Annual Leave - 999998<br>"
					+ "Sickness - 999997<br>"
					+ "Compassionate Leave - 999996"
					+ "<br>Other - 999995</h3>"
					+ "<hr>"
					+ "<h2>Task Codes</h2>"
					+ "<h3>Task 1 - 100810"
					+ "<br>Task 2 - 100374"
					+ "<br>Task 3 - 990873"
					+ "<br>Task 4 - 200713"
					+ "<br>Task 5 - 201937</h3>"
					+ "<hr>"
					+ "<h2>Activity Codes"
					+ "<h3>A0N001"
					+ "<br>A0N002"
					+ "<br>A0N003"
					+ "<br>A0N004"
					+ "<br>A0N005</h3></html>");

		}
	}

	class backHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (clockOut) {
				JOptionPane.showMessageDialog(null, "You are still clocked in!", "Input Error", JOptionPane.WARNING_MESSAGE);
			} else {
				employeeWorkCode.setText("");
				adminWorkCode.setText("");
				applicationFrame.setContentPane(applicationPanel);
				applicationFrame.invalidate();
				applicationFrame.validate();
			}
		}
	}

	class adminPanelHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (clockOut) {
				JOptionPane.showMessageDialog(null, "You are still clocked in!", "Input Error", JOptionPane.WARNING_MESSAGE);
			} else {
				applicationFrame.setContentPane(adminPanel);
				applicationFrame.invalidate();
				applicationFrame.validate();
			}
		}
	}

	class assignmentHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (clockOut) {
				JOptionPane.showMessageDialog(null, "You are still clocked in!", "Input Error", JOptionPane.WARNING_MESSAGE);
			} else {
				applicationFrame.setContentPane(assignmentPanel);
				applicationFrame.invalidate();
				applicationFrame.validate();
			}
		}
	}

	class reviewHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			applicationFrame.setContentPane(approvalPanel);
			applicationFrame.invalidate();
			applicationFrame.validate();
		}
	}

	class reportSearchHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			applicationFrame.setContentPane(reportSearchPanel);
			applicationFrame.invalidate();
			applicationFrame.validate();
		}
	}

	class reportViewHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			applicationFrame.setContentPane(reportViewPanel);
			applicationFrame.invalidate();
			applicationFrame.revalidate();
		}
	}

	class reportSearchBackHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			applicationFrame.setContentPane(reportSearchPanel);
			applicationFrame.invalidate();
			applicationFrame.revalidate();
		}
	}

	class clockinHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (clockOut) {
				JOptionPane.showMessageDialog(null, "You are already clocked in!", "Input Error", JOptionPane.WARNING_MESSAGE);
			} else {
				clockinHour = new SimpleDateFormat("mm").format(Calendar.getInstance().getTime());
				if (Integer.parseInt(clockinHour) >= 30) {
					clockinHour = new SimpleDateFormat("HH").format(Calendar.getInstance().getTime());
					clockinHour = String.valueOf(Integer.parseInt(clockinHour) + 1);
				} else {
					clockinHour = new SimpleDateFormat("HH").format(Calendar.getInstance().getTime());
				}

				clockinTime = new SimpleDateFormat ("HH:MM").format(Calendar.getInstance().getTime());
				empCode = applicationUser.getText();

				if(adminWorkCode.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "No Workcode Entered", "Input Error", JOptionPane.WARNING_MESSAGE);
				} else {
					workCode = adminWorkCode.getText();
					projCode = "The project";
					clockinDate = new SimpleDateFormat("dd-MM-yyyy").format(Calendar.getInstance().getTime());
					clockStore = (empCode + "_" + workCode + "_" + projCode + "_" + clockinDate + "_" + clockinTime + "_" + clockinHour);
					clockOut = true;
				}
			}
		}
	}

	class clockoutHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (clockOut) {
				clockoutHour = new SimpleDateFormat("mm").format(Calendar.getInstance().getTime());

				if (Integer.parseInt(clockoutHour) >= 30) {

					clockoutHour = new SimpleDateFormat("HH").format(Calendar.getInstance().getTime());
					clockoutHour = String.valueOf(Integer.parseInt(clockoutHour) + 1);

				} else {

					clockoutHour = new SimpleDateFormat("HH").format(Calendar.getInstance().getTime());

				}

				clockoutTime = new SimpleDateFormat ("HH:MM").format(Calendar.getInstance().getTime());
				totalHour = String.valueOf(Integer.parseInt(clockoutHour) - Integer.parseInt(clockinHour));
				clockStore = (empCode + "_" + workCode + "_" + projCode + "_" + clockinDate + "_" + clockinTime + "_" + clockoutTime + "_" + totalHour);
				toApprove.add(clockStore);
				clockOut = false;
				System.out.println(toApprove);
			} else {
				JOptionPane.showMessageDialog(null, "You are already clocked out!", "Input Error", JOptionPane.WARNING_MESSAGE);
			}
		}
	}

	class clockinHandler2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (clockOut) {
				JOptionPane.showMessageDialog(null, "You are already clocked in!", "Input Error", JOptionPane.WARNING_MESSAGE);
			} else {
				clockinHour = new SimpleDateFormat("mm").format(Calendar.getInstance().getTime());
				if (Integer.parseInt(clockinHour) >= 30) {
					clockinHour = new SimpleDateFormat("HH").format(Calendar.getInstance().getTime());
					clockinHour = String.valueOf(Integer.parseInt(clockinHour) + 1);
				} else {
					clockinHour = new SimpleDateFormat("HH").format(Calendar.getInstance().getTime());
				}

				clockinTime = new SimpleDateFormat ("HH:MM").format(Calendar.getInstance().getTime());
				empCode = applicationUser.getText();

				if(employeeWorkCode.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "No Workcode Entered", "Input Error", JOptionPane.WARNING_MESSAGE);
				} else {
					workCode = employeeWorkCode.getText();
					projCode = "The project";
					clockinDate = new SimpleDateFormat("dd-MM-yyyy").format(Calendar.getInstance().getTime());
					clockStore = (empCode + "_" + workCode + "_" + projCode + "_" + clockinDate + "_" + clockinTime + "_" + clockinHour);
					clockOut = true;
				}
			}
		}
	}

	class clockoutHandler2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (clockOut) {
				clockoutHour = new SimpleDateFormat("mm").format(Calendar.getInstance().getTime());

				if (Integer.parseInt(clockoutHour) >= 30) {

					clockoutHour = new SimpleDateFormat("HH").format(Calendar.getInstance().getTime());
					clockoutHour = String.valueOf(Integer.parseInt(clockoutHour) + 1);

				} else {

					clockoutHour = new SimpleDateFormat("HH").format(Calendar.getInstance().getTime());

				}

				clockoutTime = new SimpleDateFormat ("HH:MM").format(Calendar.getInstance().getTime());
				totalHour = String.valueOf(Integer.parseInt(clockoutHour) - Integer.parseInt(clockinHour));
				clockStore = (empCode + "_" + workCode + "_" + projCode + "_" + clockinDate + "_" + clockinTime + "_" + clockoutTime + "_" + totalHour);
				toApprove.add(clockStore);
				clockOut = false;
				System.out.println(toApprove);
			} else {
				JOptionPane.showMessageDialog(null, "You are already clocked out!", "Input Error", JOptionPane.WARNING_MESSAGE);
			}
		}
	}

	class descriptionHandler implements FocusListener {
		public void focusLost(FocusEvent arg0) {
			if (adminWorkCode.getText().equals("999995") | employeeWorkCode.getText().equals("999995")) {
				adminDescription.setEditable(true);
				employeeDescription.setEditable(true);
			} else {
				adminDescription.setEditable(false);
				adminDescription.setText("-");
				employeeDescription.setEditable(false);
				employeeDescription.setText("-");
			}

		}
		public void focusGained(FocusEvent e) {
			if (adminWorkCode.getText().equals("99995") | employeeWorkCode.getText().equals("99995")) {
				adminDescription.setEditable(true);
				employeeDescription.setEditable(true);
			} else {
				adminDescription.setEditable(false);
				adminDescription.setText("-");
				employeeDescription.setEditable(false);
				employeeDescription.setText("-");
			}
		}
		

		}
	public void focusGained(FocusEvent e) {
		//public void focusLost(FocusEvent arg0) {
			if (adminWorkCode.getText().equals("999995") | employeeWorkCode.getText().equals("999995")) {
				outputLabel.setText("Other");
			} else if (adminWorkCode.getText().equals("999996") | employeeWorkCode.getText().equals("999996")) {
				outputLabel.setText("Compassionate Leave");
			} else if ()
		}
	}
		
	
//}
