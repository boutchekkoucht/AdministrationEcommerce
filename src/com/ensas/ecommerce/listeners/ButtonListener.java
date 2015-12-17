package com.ensas.ecommerce.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.ensas.ecommerce.views.Index;
import com.ensas.ecommerce.views.Login;
import com.ensas.ecommerce.views.ProductList;



public class ButtonListener implements ActionListener{

	Index index;
	public ButtonListener(Index i) {
		// TODO Auto-generated constructor stub
		index=i;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()== index.getLogin())
		{
		  index.getBody().removeAll();
		  index.getBody().add(new Login());	
		  index.getBody().validate();
		  index.validate();
		}
		else if(e.getSource()== index.getListpro())
		{
			 index.getBody().removeAll();
			
			 index.getBody().add(new ProductList());
			 index.validate();
			 index.getBody().repaint();
			 index.validate();
		}
		
	}

}
