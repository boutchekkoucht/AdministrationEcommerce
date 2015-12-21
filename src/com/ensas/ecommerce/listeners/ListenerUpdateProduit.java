package com.ensas.ecommerce.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import metier.Produit;

import com.ensas.ecommerce.models.CategorieModel;
import com.ensas.ecommerce.models.ProduitModel;
import com.ensas.ecommerce.views.Index;
import com.ensas.ecommerce.views.categorie.DeleteCategorie;
import com.ensas.ecommerce.views.categorie.ListCatgories;
import com.ensas.ecommerce.views.produit.ListProduits;
import com.ensas.ecommerce.views.produit.UpdateProduit;

public class ListenerUpdateProduit implements ActionListener{


	private UpdateProduit window;
	public ListenerUpdateProduit(UpdateProduit d) {
	
		window=d;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==window.getEdit()){
			
		ProduitModel mo=new ProduitModel();
		
			Produit p=new Produit();
			p.setIdProduit(Long.parseLong(window.getProview().getId().getText()));
			p.setDesignation(window.getProview().getIntitule().getText());
			p.setDescription(window.getProview().getDescription().getText());
			p.setPrix(Double.parseDouble(window.getProview().getPrix().getText()));
			
			mo.getPro().updateProduit(p);
			window.getIndex().getBody().removeAll();
			window.getIndex().getBody().repaint();
			window.getIndex().getBody().add(new ListProduits(mo.getPro().getAllProduits(), window.getIndex()));
			
		}
		window.dispose();	
		
		
		
	}
}
