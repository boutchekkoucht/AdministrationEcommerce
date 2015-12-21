package metier;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;


@Remote
public interface ProduitServices {
	public Long AddProduct(Produit produit,Long id_cat);
	public List<Produit> getAllProduits();
	public List<Produit> getProduitsParMC( String mc);
	public List<Produit> getProduitsParCategorie(Long id_cat);
	public Produit getProduit(Long id_pr);
	public void removeProduit(Long id_pr);
	public void updateProduit(Produit produit);


}
