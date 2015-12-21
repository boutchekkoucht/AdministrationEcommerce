package com.ensas.ecommerce.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.ensas.ecommerce.models.CategorieModel;
import com.ensas.ecommerce.views.Index;
import com.ensas.ecommerce.views.categorie.DeleteCategorie;
import com.ensas.ecommerce.views.categorie.ListCatgories;
import com.ensas.ecommerce.views.categorie.UpdateCategorie;

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
			mo.editCategorie(window.getCat());
			window.getIndex().getBody().removeAll();
			window.getIndex().getBody().repaint();
			window.getIndex().getBody().add(new ListCatgories(mo.getAllCatgories(),window.getIndex()));
			
		}
		window.dispose();	
		
		
		
	}
}
