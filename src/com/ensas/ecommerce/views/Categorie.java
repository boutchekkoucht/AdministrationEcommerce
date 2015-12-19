package com.ensas.ecommerce.views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Categorie extends JPanel{
	
	
	private JTextField id,intitule,description;
	
	
	
	public Categorie() {
		// TODO Auto-generated constructor stub
		
		
		id=new JTextField(20);
		intitule=new JTextField(20);
		description=new JTextField(20);
		
		setLayout(new GridLayout(4, 1));
		add(Panneau.addLabel(id, "id"));
		add(Panneau.addLabel(intitule, "desgination"));
		add(Panneau.addLabel(description, "desription"));
		
		
		
		
	}

}
