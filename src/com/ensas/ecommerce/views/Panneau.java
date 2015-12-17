package com.ensas.ecommerce.views;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;


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

}
