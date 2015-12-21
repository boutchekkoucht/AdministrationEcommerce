package com.ensas.ecommerce.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.ensas.ecommerce.models.CategorieModel;
import com.ensas.ecommerce.models.ProduitModel;
import com.ensas.ecommerce.views.AdminCount;
import com.ensas.ecommerce.views.ListCommandes;
import com.ensas.ecommerce.views.ListUsers;
import com.ensas.ecommerce.views.User;
import com.ensas.ecommerce.views.Index;
import com.ensas.ecommerce.views.Login;
import com.ensas.ecommerce.views.Commande;
import com.ensas.ecommerce.views.categorie.AddCategorie;
import com.ensas.ecommerce.views.categorie.ListCatgories;
import com.ensas.ecommerce.views.produit.AddProduit;
import com.ensas.ecommerce.views.produit.ListProduits;



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
		  index.getFooter().removeAll();
		  index.getBody().add(new Login());	
		  index.getBody().validate();
		  index.validate();
		}
		else if(e.getSource()== index.getListpro())
		{
			index.getFooter().removeAll();
			 
			 JButton addpro=new JButton("add produit");
			
			
			 setBodyProduit();
			 index.getFooter().add(addpro);
			 index.validate();
			 
			 index.getFooter().repaint();
			 index.validate();
			 addpro.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					new AddProduit(index);
				}
			});
			 
		}
		else if(e.getSource()== index.getListcat())
		{
			 
			
			 index.getFooter().removeAll();
			 
			 JButton addcat=new JButton("add categorie");
			
			
			 setBody();
			 index.getFooter().add(addcat);
			 index.validate();
			 
			 index.getFooter().repaint();
			 index.validate();
			 addcat.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					new AddCategorie(index);
				}
			});
			 
		}
		else if(e.getSource()== index.getListcommande())
		{
			 index.getBody().removeAll();
			 index.getFooter().removeAll();
			 index.getBody().add(new ListCommandes());
			 index.validate();
			 index.getBody().repaint();
			 index.validate();
		}
		
		else if(e.getSource()== index.getListeusers())
		{
			 index.getBody().removeAll();
			 index.getFooter().removeAll();
			 index.getBody().add(new ListUsers());
			 index.validate();
			 index.getBody().repaint();
			 
			 index.validate();
		}
		
		
		else if(e.getSource()== index.getAdminCount())
		{
			 index.getBody().removeAll();
			 index.getFooter().removeAll();
			
			 index.getBody().add(new AdminCount());
			 index.validate();
			 index.getBody().repaint();
			 index.validate();
		}
		
	}
	
	
	public void setBody(){
		 index.getBody().removeAll();
		 CategorieModel m=new CategorieModel(); 
		 index.getBody().repaint();
		 index.getBody().add(new ListCatgories(m.getAllCatgories(),index));
	}
	
	public void setBodyProduit(){
		 index.getBody().removeAll();
		ProduitModel mo=new ProduitModel();
		 index.getBody().repaint();
		 index.getBody().add(new ListProduits(mo.getPro().getAllProduits(),index));
	}

}
