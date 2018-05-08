package com.BU.CIB30;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ClockInApprovalGUI {

	private JFrame applicationFrame;
	private JPanel approvalPanel;
	private JLabel employeeLogo, headerOne, headerTwo;
	private JButton exitButton, logOutButton;
	
	Font mainFont = new Font("Arial", Font.PLAIN,20);

	private ClockInApprovalGUI() {
		createApplicationFrame();
		createApprovalPanel();
		createApprovalLabel();
		createApprovalButton();
		addApplicationItems();
	}

	private void createApplicationFrame() {
		applicationFrame = new JFrame("Design & Solutions Co");
		applicationFrame.setSize(800, 600);
		applicationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		applicationFrame.setVisible(true);
	}

	private void createApprovalPanel() {
		approvalPanel = new JPanel();
		approvalPanel.setLayout(null);
		approvalPanel.setBackground(Color.GRAY);
	}

	private void createApprovalLabel() {
		employeeLogo = new JLabel(new ImageIcon("kingfisherLogo.png"));
		employeeLogo.setBounds(20, 20, 200, 70);
		
		headerOne = new JLabel("Header1");
		headerOne.setBounds(70, 85, 100, 100);
		headerOne.setFont(mainFont);
		
		headerTwo = new JLabel("Header2");
		headerTwo.setBounds();
		
		
	}

	private void createApprovalButton() {
		exitButton = new JButton("Exit");
		exitButton.setBounds(680, 17, 90, 35);
		exitButton.addActionListener(new exitHandler());

		logOutButton = new JButton("Log Out");
		logOutButton.setBounds(580, 17, 90, 35);
		//INSERT LOG OUT ACTION LISTENER

	}

	private void addApplicationItems() {
		applicationFrame.add(approvalPanel);
		approvalPanel.add(employeeLogo);
		approvalPanel.add(exitButton);
		approvalPanel.add(logOutButton);
		approvalPanel.add(headerOne);
	}

	class exitHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);

		}

	}



	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ClockInApprovalGUI();
			}
		});
	}






}