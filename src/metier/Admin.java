package metier;

import java.io.Serializable;


public class Admin implements Serializable{
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(String nomAdmin, String passwordAdmin, String email) {
		super();
		this.nomAdmin = nomAdmin;
		this.passwordAdmin = passwordAdmin;
		this.email = email;
	}
	
	private Long idAdmin;
	private String nomAdmin;
	private String passwordAdmin;
	private String email;
	public Long getIdAdmin() {
		return idAdmin;
	}
	public void setIdAdmin(Long idAdmin) {
		this.idAdmin = idAdmin;
	}
	public String getNomAdmin() {
		return nomAdmin;
	}
	public void setNomAdmin(String nomAdmin) {
		this.nomAdmin = nomAdmin;
	}
	public String getPasswordAdmin() {
		return passwordAdmin;
	}
	public void setPasswordAdmin(String passwordAdmin) {
		this.passwordAdmin = passwordAdmin;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


}
