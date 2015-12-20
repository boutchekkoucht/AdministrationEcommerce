package com.ensas.ecommerce.views;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sun.xml.rpc.processor.schema.Component;


public class Panneau  {

	
	
	
	public Panneau() {
		// TODO Auto-generated constructor stub
		
	
	}
	
public static JPanel addLabel(JComponent a,String label){
		
		JPanel p=new JPanel();
		p.add(new JLabel(label));
		p.add(a);
		return p;
		
	}


public static JPanel addPanel(String message){
	
	JPanel p=new JPanel();
		p.setLayout(new BorderLayout());
	//p.setSize(50, 100);
	p.add(new JLabel(message));

	p.setBackground(new Color(255, 0,255));
	return p;
	
}

public static JPanel setComp(JComponent comp){
	
	JPanel p=new JPanel();
	
	p.add(comp);
	
	p.setBackground(new Color(255, 0,255));
	return p;
	
}

public static JPanel setComp(JComponent comp1,JComponent comp2){
	
	JPanel p=new JPanel();
	
	p.add(comp1);
	p.add(comp2);
	
	
	return p;
	
}



}
