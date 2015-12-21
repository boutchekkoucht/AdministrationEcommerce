package com.ensas.ecommerce.views.categorie;

import java.awt.BorderLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JWindow;

import com.ensas.ecommerce.listeners.ListenerAddCategorie;
import com.ensas.ecommerce.views.Index;
import com.ensas.ecommerce.views.Panneau;


public class AddCategorie extends JDialog {
	
	private  JButton add,cancel;
	private Categorie cat;
	private Index index;
	public AddCategorie(Index i) {
		// TODO Auto-generated constructor stub
		index=i;
		
		add(new Label("nouvelle categorie"),BorderLayout.NORTH);
		cat=new Categorie(null);
		
		add(cat,BorderLayout.CENTER);
		
		add=new JButton("jouter");
		cancel=new JButton("annuler");
		
		add(Panneau.setComp(add, cancel),BorderLayout.SOUTH);
		ListenerAddCategorie lis=new ListenerAddCategorie(this,index);
		
		add.addActionListener(lis);
		cancel.addActionListener(lis);
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);
		setVisible(true);
	}
	public JButton getAdd() {
		return add;
	}
	public void setAdd(JButton add) {
		this.add = add;
	}
	public JButton getCancel() {
		return cancel;
	}
	public void setCancel(JButton cancel) {
		this.cancel = cancel;
	}
	public Categorie getCat() {
		return cat;
	}
	public void setCat(Categorie cat) {
		this.cat = cat;
	}
	public Index getIndex() {
		return index;
	}
	public void setIndex(Index index) {
		this.index = index;
	}
	
	
	
	

}
