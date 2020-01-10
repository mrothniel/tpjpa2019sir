package jpa;

import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Inheritance
public class Person {

	protected long email;
	protected String nom;
	protected String prenom;
	protected String web;
	@Id
	public long getEmail() {
		return email;
	}

	public void setEmail(long email) {
		this.email = email;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}


}
