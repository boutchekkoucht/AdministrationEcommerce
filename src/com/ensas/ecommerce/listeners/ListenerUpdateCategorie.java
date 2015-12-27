package com.ensas.ecommerce.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.ensas.ecommerce.models.CategorieModel;
import com.ensas.ecommerce.views.Index;
import com.ensas.ecommerce.views.categorie.DeleteCategorie;
import com.ensas.ecommerce.views.categorie.ListCatgories;
import com.ensas.ecommerce.views.categorie.UpdateCategorie;

import entities.Categorie;

public class ListenerUpdateCategorie implements ActionListener{


	private UpdateCategorie window;
	public ListenerUpdateCategorie(UpdateCategorie d) {
	
		window=d;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==window.getEdit()){
			
		CategorieModel mo=new CategorieModel();
		Categorie c= new Categorie();
		c.setIdCategorie(Long.parseLong(window.getCatview().getId().getText()));
		c.setDescription(window.getCatview().getDescription().getText());
		c.setNomCategorie(window.getCatview().getIntitule().getText());
			mo.editCategorie(c);
			window.getIndex().getBody().removeAll();
			window.getIndex().getBody().repaint();
			window.getIndex().getBody().add(new ListCatgories(mo.getAllCatgories(),window.getIndex()));
			
		}
		window.dispose();	
		
		
		
	}
}
