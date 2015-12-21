package com.ensas.ecommerce.views.produit;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.glassfish.web.admin.cli.ListNetworkListeners;

import com.ensas.ecommerce.listeners.ListenerDeleteProduit;
import com.ensas.ecommerce.views.Index;

import metier.Produit;



public class DeleteProduit extends JDialog{
	
	private JButton oui,non;
	private Index index;
	private Produit pro;
	
	
	 public DeleteProduit(Produit c,Index index) {
		// TODO Auto-generated constructor stub
		 this.index=index;
		 pro=c;
		 oui=new JButton("oui");
		 non=new JButton("non");
		 add(new JLabel("voulez vous vraiment suprimé la Produit : "+c.getDesignation()),BorderLayout.NORTH);
		 JPanel p=new JPanel();
		 p.add(oui);
		 p.add(non);
		 add(p);
		 ListenerDeleteProduit lis=new ListenerDeleteProduit(this);
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


	public Produit getpro() {
		return pro;
	}


	public void setpro(Produit pro) {
		this.pro = pro;
	}

	
	
	 
	 
}
