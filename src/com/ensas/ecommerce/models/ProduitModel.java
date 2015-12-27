package com.ensas.ecommerce.models;

import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import dao.ProduitServices;
import entities.Produit;
public class ProduitModel {

	
	private ProduitServices pro;
	
	public ProduitModel() {
		// TODO Auto-generated constructor stub
		try {
			InitialContext cont=new InitialContext();
			pro=(ProduitServices)cont.lookup("java:global/E_Commerce_grpe/ProduitImpl!dao.ProduitServices");
											  
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

	public ProduitServices getPro() {
		return pro;
	}

	public void setPro(ProduitServices pro) {
		this.pro = pro;
	}
	
	
	
}
