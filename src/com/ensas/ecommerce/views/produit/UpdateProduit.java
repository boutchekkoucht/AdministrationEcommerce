package com.ensas.ecommerce.views.produit;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.glassfish.web.admin.cli.ListNetworkListeners;

import com.ensas.ecommerce.listeners.ListenerDeleteProduit;
import com.ensas.ecommerce.listeners.ListenerUpdateProduit;
import com.ensas.ecommerce.views.Index;

import entities.Produit;



public class UpdateProduit extends JDialog{
	
	private JButton edit,cancel;
	private Index index;
	private Produit cat;
	private com.ensas.ecommerce.views.produit.Produit proview;
	
	
	 public UpdateProduit(Produit c,Index index) {
		// TODO Auto-generated constructor stub
		 this.index=index;
		 cat=c;
		 edit=new JButton("modifier");
		 cancel=new JButton("annuler");
		 add(new JLabel("voulez vous vraiment suprimé la Produit : "+c.getDesignation()),BorderLayout.NORTH);
		 JPanel p=new JPanel();
		 p.add(edit);
		 p.add(cancel);
		 proview=new com.ensas.ecommerce.views.produit.Produit(c);
		 add(proview);
		 add(p,BorderLayout.SOUTH);
		 ListenerUpdateProduit lis=new ListenerUpdateProduit(this);
		 edit.addActionListener(lis);
		 cancel.addActionListener(lis);
		 
		 setLocale(null);
		 setSize(400,100);
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


	public Produit getCat() {
		return cat;
	}


	public void setCat(Produit cat) {
		this.cat = cat;
	}


	public com.ensas.ecommerce.views.produit.Produit getProview() {
		return proview;
	}


	public void setProview(com.ensas.ecommerce.views.produit.Produit proview) {
		this.proview = proview;
	}


	
	
	
	 
	 
}
