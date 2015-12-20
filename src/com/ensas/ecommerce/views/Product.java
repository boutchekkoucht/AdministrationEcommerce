package com.ensas.ecommerce.views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import metier.Produit;

public class Product extends JPanel{
	
	
	private JTextField id,intitule,prix,desc;
	
	
	
	public Product(Produit p) {
		// TODO Auto-generated constructor stub
		
		
		id=new JTextField(20);
		intitule=new JTextField(20);
		prix=new JTextField(20);
		desc=new JTextField(20);
		setLayout(new GridLayout(4, 1));
		add(Panneau.addLabel(id, "id"));
		add(Panneau.addLabel(intitule, "nom"));
		add(Panneau.addLabel(prix, "prix"));
		add(Panneau.addLabel(desc, "description"));
		
		id.setText(""+p.getIdProduit());
		intitule.setText(p.getDescription());
		prix.setText(""+p.getPrix());
		desc.setText(p.getDescription());
		
		
	}

}
