package com.ensas.ecommerce.views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class User extends JPanel{
	
	
	private JTextField id,first_name,last_name,email;
	
	
	
	public User() {
		// TODO Auto-generated constructor stub
		
		
		id=new JTextField(20);
		first_name=new JTextField(20);
		
		last_name=new JTextField(20);
		email=new JTextField(20);
		
		
		setLayout(new GridLayout(4, 1));
		add(Panneau.addLabel(id, "id"));
		add(Panneau.addLabel(first_name, "prenom "));
		add(Panneau.addLabel(last_name, "nom "));
		add(Panneau.addLabel(email, "email "));
		
		
		
	}

}
