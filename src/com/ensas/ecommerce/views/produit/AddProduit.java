package com.ensas.ecommerce.views.produit;

import java.awt.BorderLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JDialog;




import com.ensas.ecommerce.listeners.ListenerAddProduit;
import com.ensas.ecommerce.views.Index;
import com.ensas.ecommerce.views.Panneau;


public class AddProduit extends JDialog {
	
	private  JButton add,cancel;
	private Produit pro;
	private Index index;
	public AddProduit(Index i) {
		// TODO Auto-generated constructor stub
		index=i;
		
		add(new Label("nouveau produit"),BorderLayout.NORTH);
		pro=new Produit(null);
		
		add(pro,BorderLayout.CENTER);
		
		add=new JButton("ajouter");
		cancel=new JButton("annuler");
		
		add(Panneau.setComp(add, cancel),BorderLayout.SOUTH);
		ListenerAddProduit lis=new ListenerAddProduit(this,index);
		
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
	public Produit getpro() {
		return pro;
	}
	public void setpro(Produit pro) {
		this.pro = pro;
	}
	public Index getIndex() {
		return index;
	}
	public void setIndex(Index index) {
		this.index = index;
	}
	
	
	
	

}
