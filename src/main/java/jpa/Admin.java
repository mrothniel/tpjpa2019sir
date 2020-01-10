package jpa;


import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity 
public class Admin extends Person {
	
	private Sondage sondage;
	
	
	@OneToOne(mappedBy = "admin")
	public Sondage getSondage() {
		return sondage;
	}
	public void setSondage(Sondage sondage) {
		this.sondage = sondage;
	}

}
