package com.form;

import java.awt.*;
import javax.swing.*;

class MyWindow extends JFrame {
	
	private JLabel heading;
	Font font = new Font("Aerial",Font.BOLD,20);
	
	private JPanel mainPanel;
	private JLabel nameLabel,passwordLabel;
	private JTextField nameField;
	private JPasswordField passwordField;
	private JButton button1,button2;
	
	MyWindow(){
		super.setTitle("My First Form");
		super.setSize(500,500);
		super.setLocation(100,100);
		createGUI();
		
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void createGUI() {
		this.setLayout(new BorderLayout());
		
		heading = new JLabel("My First Form");
		heading.setFont(font);
		heading.setHorizontalAlignment(JLabel.CENTER);
		
		this.add(heading,BorderLayout.NORTH);
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(3,2));
		
		nameLabel = new JLabel("Name: ");
		nameLabel.setFont(font);
		
		passwordLabel = new JLabel("Password: ");
		passwordLabel.setFont(font);
		
		nameField = new JTextField();
		nameField.setFont(font);
		
		passwordField = new JPasswordField();
		passwordField.setFont(font);
		
		button1 = new JButton("Reset");
		button1.setFont(font);
		
		button2 = new JButton("Submit");
		button2.setFont(font);
		
		mainPanel.add(nameLabel);
		mainPanel.add(nameField);
		mainPanel.add(passwordLabel);
		mainPanel.add(passwordField);
		mainPanel.add(button1);
		mainPanel.add(button2);
		this.add(mainPanel,BorderLayout.CENTER);
		
	}
}









