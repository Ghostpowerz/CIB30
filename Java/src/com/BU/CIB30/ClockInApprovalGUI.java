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
	private JLabel employeeLogo, headerOne, headerTwo, headerThree, headerFour, headerFive;
	private JButton exitButton, logOutButton, approveButton, denyButton;
	
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
		headerOne.setBounds(70, 130, 100, 100);
		headerOne.setFont(mainFont);
		
		headerTwo = new JLabel("Header2");
		headerTwo.setBounds(200, 130, 100, 100);
		headerTwo.setFont(mainFont);
		
		headerThree = new JLabel("Header3");
		headerThree.setBounds(330, 130, 100, 100);
		headerThree.setFont(mainFont);
		
		headerFour = new JLabel("Header4");
		headerFour.setBounds(460, 130, 100, 100);
		headerFour.setFont(mainFont);
		
		headerFive = new JLabel("Header5");
		headerFive.setBounds(590, 130, 100, 100);
		headerFive.setFont(mainFont);
		
		
	}

	private void createApprovalButton() {
		exitButton = new JButton("Exit");
		exitButton.setBounds(680, 17, 90, 35);
		exitButton.addActionListener(new exitHandler());

		logOutButton = new JButton("Log Out");
		logOutButton.setBounds(580, 17, 90, 35);
		logOutButton.addActionListener(new logOutHandler());
		//INSERT LOG OUT ACTION LISTENER
		
		approveButton = new JButton("Approve");
		approveButton.setBounds(285, 90, 90, 35);
		approveButton.addActionListener(new approveHandler());
		
		denyButton = new JButton("Deny");
		denyButton.setBounds(390, 90, 90, 35);
		denyButton.addActionListener(new denyHandler());
	}

	private void addApplicationItems() {
		applicationFrame.add(approvalPanel);
		approvalPanel.add(employeeLogo);
		approvalPanel.add(exitButton);
		approvalPanel.add(logOutButton);
		approvalPanel.add(headerOne);
		approvalPanel.add(headerTwo);
		approvalPanel.add(headerThree);
		approvalPanel.add(headerFour);
		approvalPanel.add(headerFive);
		approvalPanel.add(approveButton);
		approvalPanel.add(denyButton);
	}

	class exitHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);

		}

	}
	
	class logOutHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("LOG OUT");
		}
	}
	
	class approveHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("APPROVED");
		}
	}
	
	class denyHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("DENIED");
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