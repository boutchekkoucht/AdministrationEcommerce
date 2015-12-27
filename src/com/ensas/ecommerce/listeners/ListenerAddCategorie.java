package com.ensas.ecommerce.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import entities.Categorie;

import com.ensas.ecommerce.models.CategorieModel;
import com.ensas.ecommerce.models.ProduitModel;
import com.ensas.ecommerce.views.Index;
import com.ensas.ecommerce.views.categorie.AddCategorie;
import com.ensas.ecommerce.views.categorie.ListCatgories;

public class ListenerAddCategorie  implements ActionListener{

	AddCategorie window;
	private Index index;
	public ListenerAddCategorie(AddCategorie f,Index i) {
		// TODO Auto-generated constructor stub
		window=f;
		index=i;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		if(window.getAdd()==e.getSource()){
			
			Categorie c=new Categorie();
			c.setNomCategorie(window.getCat().getIntitule().getText());
			c.setDescription(window.getCat().getDescription().getText());
			CategorieModel mo=new CategorieModel();
			 mo.addCategorie(c);
			 CategorieModel m=new CategorieModel(); 
			 index.getBody().removeAll();
			 index.getBody().repaint();
			 index.getBody().add(new ListCatgories(m.getAllCatgories(),index));
			window.dispose();
		}
		else if(window.getCancel()==e.getSource())
		{
			
			window.dispose();
		}
		
	}
}
