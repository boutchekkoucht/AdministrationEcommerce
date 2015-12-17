package com.ensas.ecommerce.datas;

public class Product {

	
	private int id;
	private String intitule,prix;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Product(int id, String intitule, String prix) {
		super();
		this.id = id;
		this.intitule = intitule;
		this.prix = prix;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+"  "+intitule+"  "+prix;
	}

}
