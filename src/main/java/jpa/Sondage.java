package jpa;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Sondage {

	private String titre;
	private String lieu;
	private Collection<Dated> dateds;
	private Admin admin ;

	@OneToMany(mappedBy = "sondage")
	public Collection<Dated> getDates() {
		return dateds;
	}

	public void setDates(Collection<Dated> dateds) {
		this.dateds = dateds;
	}
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	@OneToOne
	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

}
