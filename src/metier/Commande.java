package metier;

import java.util.Collection;
import java.util.Date;


public class Commande {
	private String dateCommande;
	
	private Client client;
	
	private Collection<Produit>produits;
	
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Commande(String dateCommande, Client client) {
		super();
		this.dateCommande = dateCommande;
		this.client = client;
	}
	
	private Long idCommande;
	public Long getIdCommande() {
		return idCommande;
	}
	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}
	public String getDateCommande() {
		return dateCommande;
	}
	public void setDateCommande(String dateCommande) {
		this.dateCommande = dateCommande;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Collection<Produit> getProduits() {
		return produits;
	}
	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}
	

}
