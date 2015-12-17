package com.ensas.ecommerce.views;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


// class pour  la vue de l'authentification de l'admin
public class login extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6562824462959924649L;
	private JTextField login;
	private JPasswordField password;
	private JButton connection;
	
	
	public login() {
		
		login=new JTextField(20);
		password=new JPasswordField(20);
		connection=new JButton("login");

		setLayout(new FlowLayout());
		setSize(500, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(addLabel(login, "login"));
		add(addLabel(password, "password"));
		add(addLabel(connection, ""));
	}


	public JTextField getLogin() {
		return login;
	}


	public void setLogin(JTextField login) {
		this.login = login;
	}


	public JPasswordField getPassword() {
		return password;
	}


	public void setPassword(JPasswordField password) {
		this.password = password;
	}


	public JButton getConnection() {
		return connection;
	}


	public void setConnection(JButton connection) {
		this.connection = connection;
	}
	
	
	public JPanel addLabel(JComponent a,String label){
		
		JPanel p=new JPanel();
		p.add(new JLabel(label));
		p.add(a);
		return p;
		
	}
	
	
	
	

}
