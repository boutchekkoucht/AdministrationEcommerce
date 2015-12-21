package com.ensas.ecommerce.views.produit;

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


public class Produit extends JPanel{
	
	
	private JTextField id,intitule,description,prix;
	
	
	
	public Produit(metier.Produit p) {
		// TODO Auto-generated constructor stub
		
		
		id=new JTextField(20);
		intitule=new JTextField(20);
		description=new JTextField(20);
		prix=new JTextField(20);
		
		setLayout(new GridLayout(4, 1));
		
		if(p!=null)
		add(Panneau.addLabel(id, "id"));
		
		add(Panneau.addLabel(intitule, "desgination"));
		add(Panneau.addLabel(description, "desription"));
		add(Panneau.addLabel(prix, "prix"));
		
		
		if(p!=null){
			
			id.setText(""+p.getIdProduit());
			id.setEditable(false);
			intitule.setText(p.getDesignation());
			description.setText(p.getDescription());
			prix.setText(""+p.getPrix());
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



	public JTextField getPrix() {
		return prix;
	}



	public void setPrix(JTextField prix) {
		this.prix = prix;
	}



	

}
