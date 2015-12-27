package com.ensas.ecommerce.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import entities.Categorie;
import entities.Produit;

import com.ensas.ecommerce.models.CategorieModel;
import com.ensas.ecommerce.models.ProduitModel;
import com.ensas.ecommerce.views.Index;
import com.ensas.ecommerce.views.categorie.AddCategorie;
import com.ensas.ecommerce.views.categorie.ListCatgories;
import com.ensas.ecommerce.views.produit.AddProduit;
import com.ensas.ecommerce.views.produit.ListProduits;

public class ListenerAddProduit  implements ActionListener{

	AddProduit window;
	private Index index;
	public ListenerAddProduit(AddProduit f,Index i) {
		// TODO Auto-generated constructor stub
		window=f;
		index=i;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		if(window.getAdd()==e.getSource()){
			
			Produit p=new Produit();
			ProduitModel mo=new ProduitModel();
			p.setDescription(window.getpro().getDescription().getText());
			p.setDesignation(window.getpro().getIntitule().getText());
			p.setPrix(Double.parseDouble(window.getpro().getPrix().getText()));
			mo.getPro().AddProduct(p,new Long(1));
			 
			 index.getBody().removeAll();
			 index.getBody().repaint();
			 index.getBody().add(new ListProduits(mo.getPro().getAllProduits(), index));
			window.dispose();
		}
		else if(window.getCancel()==e.getSource())
		{
			
			window.dispose();
		}
		
	}
}
