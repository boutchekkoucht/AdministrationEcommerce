package com.ensas.ecommerce.models;

import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import metier.Categorie;
import metier.ICategorieServices;

public class CategorieModel {

	
	private ICategorieServices cat;
	
	public CategorieModel() {
		// TODO Auto-generated constructor stub
		try {
			InitialContext cont=new InitialContext();
			cat=(ICategorieServices)cont.lookup("java:global/E_Commerce_grpe/ICategorieServicesImpl!metier.ICategorieServices");
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public List<Categorie>  getAllCatgories(){
		
		return cat.AllCategorie();
	}
	
	
	public Categorie  getCategorie(Long id){
		return cat.getCategorie(id);
	}
	
	public void addCategorie(Categorie c){
		cat.addCategorie(c);
			
	}
	
	public void editCategorie(Categorie c){
		cat.updateCategorie(c);
	}
	public void deleteCategorie(Long id){
		cat.removeCategorie(id);
	}
	
}
