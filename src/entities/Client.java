package entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Client implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private  Long idClient;
	private String nomClient ;
	private String pasword;
	private String adresse ;
	private String email ;
	private String tel ;
	@OneToMany(mappedBy="client",fetch=FetchType.LAZY)
	private Collection<Commande>  commandes;
	public Client(String nomClient, String pasword, String adresse,
			String email, String tel) {
		super();
		this.nomClient = nomClient;
		this.pasword = pasword;
		this.adresse = adresse;
		this.email = email;
		this.tel = tel;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	public Collection<Commande> getCommandes() {
		return commandes;
	}
	public void setCommandes(Collection<Commande> commandes) {
		this.commandes = commandes;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	

}
