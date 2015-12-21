package com.ensas.ecommerce.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.ensas.ecommerce.models.CategorieModel;
import com.ensas.ecommerce.views.Index;
import com.ensas.ecommerce.views.categorie.DeleteCategorie;
import com.ensas.ecommerce.views.categorie.ListCatgories;

public class ListenerDeleteCategorie implements ActionListener{


	private DeleteCategorie delev;
	public ListenerDeleteCategorie(DeleteCategorie d) {
	
		delev=d;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==delev.getOui()){
			
		CategorieModel mo=new CategorieModel();
		mo.deleteCategorie(delev.getCat().getIdCategorie());
		delev.getIndex().getBody().removeAll();
		delev.getIndex().getBody().repaint();
		delev.getIndex().getBody().add(new ListCatgories(mo.getAllCatgories(),delev.getIndex()));
		
		}
		delev.dispose();	
		
		
		
	}
}
