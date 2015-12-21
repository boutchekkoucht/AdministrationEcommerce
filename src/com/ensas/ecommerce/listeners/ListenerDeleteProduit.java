package com.ensas.ecommerce.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.ensas.ecommerce.models.CategorieModel;
import com.ensas.ecommerce.models.ProduitModel;
import com.ensas.ecommerce.views.Index;
import com.ensas.ecommerce.views.categorie.DeleteCategorie;
import com.ensas.ecommerce.views.categorie.ListCatgories;
import com.ensas.ecommerce.views.produit.DeleteProduit;
import com.ensas.ecommerce.views.produit.ListProduits;

public class ListenerDeleteProduit implements ActionListener{


	private DeleteProduit delev;
	public ListenerDeleteProduit(DeleteProduit d) {
	
		delev=d;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==delev.getOui()){
			
		ProduitModel mo=new ProduitModel();
		mo.getPro().removeProduit(delev.getpro().getIdProduit());
		delev.getIndex().getBody().removeAll();
		delev.getIndex().getBody().repaint();
		delev.getIndex().getBody().add(new ListProduits(mo.getPro().getAllProduits(), delev.getIndex()));
		
		}
		delev.dispose();	
		
		
		
	}
}
