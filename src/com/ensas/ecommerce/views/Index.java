package com.ensas.ecommerce.views;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.ensas.ecommerce.listeners.ButtonListener;

public class Index  extends JFrame{

	
	JPanel header,body,footer;
	
	JButton  login,listpro;
	
	public Index() {
		
		
		header=new JPanel();
		body=new JPanel();
		footer=new JPanel();
		 
		login=new JButton("login");
		listpro=new JButton("products");	
		
		header.add(login);
		header.add(listpro);
		
		ButtonListener lis=new ButtonListener(this);
		
		login.addActionListener(lis);
		listpro.addActionListener(lis);
		
		this.add(header,BorderLayout.NORTH);
		this.add(body,BorderLayout.CENTER);
		this.add(footer,BorderLayout.SOUTH);
		
		
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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

}
