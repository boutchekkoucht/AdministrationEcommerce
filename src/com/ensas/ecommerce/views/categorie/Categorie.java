package com.ensas.ecommerce.views.categorie;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.ensas.ecommerce.views.Panneau;
import com.mysql.fabric.xmlrpc.base.Array;

import entities.Produit;

public class Categorie extends JPanel{
	
	
	private JTextField id,intitule,description;
	
	
	
	public Categorie(entities.Categorie c) {
		// TODO Auto-generated constructor stub
		
		
		id=new JTextField(20);
		intitule=new JTextField(20);
		description=new JTextField(20);
		
		setLayout(new GridLayout(4, 1));
		
		if(c!=null)
		add(Panneau.addLabel(id, "id"));
		
		add(Panneau.addLabel(intitule, "desgination"));
		add(Panneau.addLabel(description, "desription"));
		if(c!=null){
			
			id.setText(""+c.getIdCategorie());
			id.setEditable(false);
			intitule.setText(c.getNomCategorie());
			description.setText(c.getDescription());
		}
		
		
		
		
//		for(Produit pp: c.getProduits()){
		//	vp.add(new Product(pp));
//		}
		
//		for (Product viewp:vp){
			
//			add(viewp);
//		}

		
		
		
	}



	public JTextField getId() {
		return id;
	}



	public void setId(JTextField id) {
		this.id = id;
	}



	public JTextField getIntitule() {
		return intitule;
	}



	public void setIntitule(JTextField intitule) {
		this.intitule = intitule;
	}



	public JTextField getDescription() {
		return description;
	}



	public void setDescription(JTextField description) {
		this.description = description;
	}
	
	

}
