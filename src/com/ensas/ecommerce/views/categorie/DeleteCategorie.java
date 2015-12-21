package com.ensas.ecommerce.views.categorie;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.glassfish.web.admin.cli.ListNetworkListeners;

import com.ensas.ecommerce.listeners.ListenerDeleteCategorie;
import com.ensas.ecommerce.views.Index;

import metier.Categorie;



public class DeleteCategorie extends JDialog{
	
	private JButton oui,non;
	private Index index;
	private Categorie cat;
	
	
	 public DeleteCategorie(Categorie c,Index index) {
		// TODO Auto-generated constructor stub
		 this.index=index;
		 cat=c;
		 oui=new JButton("oui");
		 non=new JButton("non");
		 add(new JLabel("voulez vous vraiment suprimé la Categorie : "+c.getNomCategorie()),BorderLayout.NORTH);
		 JPanel p=new JPanel();
		 p.add(oui);
		 p.add(non);
		 add(p);
		 ListenerDeleteCategorie lis=new ListenerDeleteCategorie(this);
		 oui.addActionListener(lis);
		 non.addActionListener(lis);
		 
		 setLocale(null);
		 setSize(400,100);
		 setVisible(true);
	}


	public JButton getOui() {
		return oui;
	}


	public void setOui(JButton oui) {
		this.oui = oui;
	}


	public JButton getNon() {
		return non;
	}


	public void setNon(JButton non) {
		this.non = non;
	}


	public Index getIndex() {
		return index;
	}


	public void setIndex(Index index) {
		this.index = index;
	}


	public Categorie getCat() {
		return cat;
	}


	public void setCat(Categorie cat) {
		this.cat = cat;
	}

	
	
	 
	 
}
