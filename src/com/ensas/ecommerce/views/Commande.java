package com.ensas.ecommerce.views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Commande extends JPanel{
	
	
	private JTextField id,produit,quantite;
	
	
	
	public Commande() {
		// TODO Auto-generated constructor stub
		
		
		id=new JTextField(20);
		produit=new JTextField(20);
		
		quantite=new JTextField(20);
		setLayout(new GridLayout(4, 1));
		add(Panneau.addLabel(id, "id"));
		add(Panneau.addLabel(produit, "produit"));
		
		add(Panneau.addLabel(quantite, "quantite"));
		
		
		
	}

}
