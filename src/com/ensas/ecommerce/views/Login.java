package com.ensas.ecommerce.views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


// class pour  la vue de l'authentification de l'admin
public class Login extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6562824462959924649L;
	private JTextField login;
	private JPasswordField password;
	private JButton connection;
	
	
	public Login() {
		
		login=new JTextField(20);
		password=new JPasswordField(20);
		connection=new JButton("login");

		setLayout(new GridLayout(3, 1));


		add(Panneau.addLabel(login, "login"));
		add(Panneau.addLabel(password, "password"));
		add(Panneau.addLabel(connection, ""));
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
	
	
	
	
	
	
	

}
