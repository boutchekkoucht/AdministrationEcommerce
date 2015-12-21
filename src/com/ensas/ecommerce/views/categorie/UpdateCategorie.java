package com.ensas.ecommerce.views.categorie;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.glassfish.web.admin.cli.ListNetworkListeners;

import com.ensas.ecommerce.listeners.ListenerDeleteCategorie;
import com.ensas.ecommerce.listeners.ListenerUpdateCategorie;
import com.ensas.ecommerce.views.Index;

import metier.Categorie;



public class UpdateCategorie extends JDialog{
	
	private JButton edit,cancel;
	private Index index;
	private Categorie cat;
	private com.ensas.ecommerce.views.categorie.Categorie catview;
	
	
	 public UpdateCategorie(Categorie c,Index index) {
		// TODO Auto-generated constructor stub
		 this.index=index;
		 cat=c;
		 edit=new JButton("modifier");
		 cancel=new JButton("annuler");
		 add(new JLabel("Modification de la categorie"),BorderLayout.NORTH);
		 JPanel p=new JPanel();
		 p.add(edit);
		 p.add(cancel);
		 catview=new com.ensas.ecommerce.views.categorie.Categorie(c);
		 add(catview);
		 add(p,BorderLayout.SOUTH);
		 ListenerUpdateCategorie lis=new ListenerUpdateCategorie(this);
		 edit.addActionListener(lis);
		 cancel.addActionListener(lis);
		 
		 setLocale(null);
		 setSize(400,400);
		 setVisible(true);
	}


	public JButton getEdit() {
		return edit;
	}


	public void setEdit(JButton edit) {
		this.edit = edit;
	}


	public JButton getCancel() {
		return cancel;
	}


	public void setCancel(JButton cancel) {
		this.cancel = cancel;
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


	public com.ensas.ecommerce.views.categorie.Categorie getCatview() {
		return catview;
	}


	public void setCatview(com.ensas.ecommerce.views.categorie.Categorie catview) {
		this.catview = catview;
	}


	
	
	
	 
	 
}
