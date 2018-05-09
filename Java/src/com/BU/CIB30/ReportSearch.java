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
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ReportSearch {
	Font mainFont = new Font("Arial", Font.PLAIN,20);

	private JFrame applicationFrame;
	private JPanel reportSearchPanel;
	private JLabel employeeLogo, reportSearchLabel;
	private JButton reportSearchButton, logOutButton, exitButton;
	private JTextField reportSearchTextField;
	private JComboBox<String> reportSearchComboBox;

	private ReportSearch() {
		createApplicationFrame();
		createReportSearchPanel();
		createReportSearchComboBox();
		createReportSearchLabel();
		createReportSearchTextField();
		createReportSearchButton();
		addApplicationItems();
	}

	private void createApplicationFrame() {
		applicationFrame = new JFrame("Design & Solutions Co");
		applicationFrame.setSize(800, 600);
		applicationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		applicationFrame.setVisible(true);
	}

	private void createReportSearchPanel() {
		reportSearchPanel = new JPanel();
		reportSearchPanel.setLayout(null);
		reportSearchPanel.setBackground(Color.GRAY);
	}

	private void createReportSearchComboBox() {
		reportSearchComboBox = new JComboBox<String>();
		reportSearchComboBox.addItem("Report 1");
		reportSearchComboBox.addItem("Report 2");
		reportSearchComboBox.addItem("Report 3");
		reportSearchComboBox.addItem("Report 4");
		reportSearchComboBox.addItem("Report 5");
		reportSearchComboBox.setBounds(260, 180, 220, 30);
	}

	private void createReportSearchLabel() {
		employeeLogo = new JLabel(new ImageIcon("kingfisherLogo.png"));
		employeeLogo.setBounds(20, 20, 200, 70);
		
		reportSearchLabel = new JLabel("Search Parameter");
		reportSearchLabel.setBounds(285, 230, 180, 30);
		reportSearchLabel.setFont(mainFont);
	}

	private void createReportSearchTextField() {
		reportSearchTextField = new JTextField("");
		reportSearchTextField.setBackground(Color.GRAY);
		reportSearchTextField.setBounds(290, 280, 150, 30);
	}

	private void createReportSearchButton(){
		reportSearchButton = new JButton("Show");
		reportSearchButton.setBounds(450, 280, 70, 30);

		logOutButton = new JButton("Log Out");
		logOutButton.setBounds(580, 17, 90, 35);

		exitButton = new JButton("Exit");
		exitButton.setBounds(680, 17, 90, 35);
		exitButton.addActionListener(new exitHandler());

	}

	private void addApplicationItems() {
		applicationFrame.add(reportSearchPanel);
		reportSearchPanel.add(reportSearchComboBox);
		reportSearchPanel.add(employeeLogo);
		reportSearchPanel.add(reportSearchTextField);
		reportSearchPanel.add(reportSearchButton);
		reportSearchPanel.add(logOutButton);
		reportSearchPanel.add(exitButton);
		reportSearchPanel.add(reportSearchLabel);
	}
	
	class exitHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
		
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ReportSearch();
			}
		});
	}

}
