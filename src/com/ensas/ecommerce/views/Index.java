package com.ensas.ecommerce.views;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.ensas.ecommerce.listeners.ButtonListener;

public class  Index  extends JFrame{

	
	JPanel header,body,footer;
	
	JButton  login,listpro,listcommande,listeusers,adminCount,listcat;
	
	

	public Index() {
		
		
		header=new JPanel();
		body=new JPanel();
		footer=new JPanel();
		 
		login=new JButton("login");
		listpro=new JButton("products");	
		listcat=new JButton("categories");	
		listcommande=new JButton("commandes");
		
		listeusers=new JButton("users");
		adminCount=new JButton("compte");
		
		header.add(login);
		header.add(listpro);
		header.add(listcat);
		header.add(listcommande);
		header.add(listeusers);
		header.add(adminCount);
		//instantiation du listener
		ButtonListener lis=new ButtonListener(this);
		
		//
		login.addActionListener(lis);
		listpro.addActionListener(lis);
		listcat.addActionListener(lis);
		listcommande.addActionListener(lis);
		listeusers.addActionListener(lis);
		adminCount.addActionListener(lis);
		
	
		
		
		
		JScrollPane bodyy = new JScrollPane(body);
		
		
		this.add(header,BorderLayout.NORTH);
		this.add(bodyy,BorderLayout.CENTER);
		this.add(footer,BorderLayout.SOUTH);
		
		
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	
	
	
	public JButton getListcat() {
		return listcat;
	}




	public void setListcat(JButton listcat) {
		this.listcat = listcat;
	}




	public JButton getListcommande() {
		return listcommande;
	}

	public void setListcommande(JButton listcommande) {
		this.listcommande = listcommande;
	}

	public JPanel getHeader() {
		return header;
	}

	public void setHeader(JPanel header) {
		this.header = header;
	}

	public JPanel getBody() {
		return body;
	}

	public void setBody(JPanel body) {
		this.body = body;
	}

	public JPanel getFooter() {
		return footer;
	}

	public void setFooter(JPanel footer) {
		this.footer = footer;
	}

	public JButton getLogin() {
		return login;
	}

	public void setLogin(JButton login) {
		this.login = login;
	}

	public JButton getListpro() {
		return listpro;
	}

	public void setListpro(JButton listpro) {
		this.listpro = listpro;
	}

	public JButton getAdminCount() {
		return adminCount;
	}

	public void setAdminCount(JButton admincount) {
		adminCount = admincount;
	}

	public JButton getListeusers() {
		return listeusers;
	}

	public void setListeusers(JButton listeusers) {
		this.listeusers = listeusers;
	}

}	
