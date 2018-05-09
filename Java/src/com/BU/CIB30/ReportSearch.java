package com.BU.CIB30;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ReportSearch {
	
	private JFrame applicationFrame;
	private JPanel reportSearchPanel;
	private JLabel employeeLogo;
	private JComboBox<String> reportSearchComboBox;
	
	private ReportSearch() {
		createApplicationFrame();
		createReportSearchPanel();
		createReportSearchComboBox();
		createReportSearchLabel();
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
	
	private void addApplicationItems() {
		applicationFrame.add(reportSearchPanel);
		reportSearchPanel.add(reportSearchComboBox);
		reportSearchPanel.add(employeeLogo);
	}
	
	private void createReportSearchComboBox() {
		reportSearchComboBox = new JComboBox<String>();
		reportSearchComboBox.addItem("Report 1");
		reportSearchComboBox.addItem("Report 2");
		reportSearchComboBox.addItem("Report 3");
		reportSearchComboBox.setBounds(100, 100, 50, 50);
	}
	
	private void createReportSearchLabel() {
		employeeLogo = new JLabel(new ImageIcon("kingfisherLogo.png"));
		employeeLogo.setBounds(20, 20, 200, 70);
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ReportSearch();
			}
		});
	}

}
