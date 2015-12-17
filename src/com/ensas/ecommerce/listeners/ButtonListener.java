package com.ensas.ecommerce.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.ensas.ecommerce.views.AdminCount;
import com.ensas.ecommerce.views.ListCommandes;
import com.ensas.ecommerce.views.ListProducts;
import com.ensas.ecommerce.views.ListUsers;
import com.ensas.ecommerce.views.User;
import com.ensas.ecommerce.views.Index;
import com.ensas.ecommerce.views.Login;
import com.ensas.ecommerce.views.Product;
import com.ensas.ecommerce.views.Commande;



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
			
			 index.getBody().add(new ListProducts());
			 index.validate();
			 index.getBody().repaint();
			 index.validate();
		}
		
		else if(e.getSource()== index.getListcommande())
		{
			 index.getBody().removeAll();
			
			 index.getBody().add(new ListCommandes());
			 index.validate();
			 index.getBody().repaint();
			 index.validate();
		}
		
		else if(e.getSource()== index.getListeusers())
		{
			 index.getBody().removeAll();
			
			 index.getBody().add(new ListUsers());
			 index.validate();
			 index.getBody().repaint();
			 index.validate();
		}
		
		
		else if(e.getSource()== index.getAdminCount())
		{
			 index.getBody().removeAll();
			
			 index.getBody().add(new AdminCount());
			 index.validate();
			 index.getBody().repaint();
			 index.validate();
		}
		
	}

}
