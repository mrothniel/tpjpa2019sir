package jpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Reunion {
	private String intitule;
	private String resume;
	private Dated dated ;
	
	@Id
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	
	@OneToOne
	public Dated getDate() {
		return dated;
	}
	public void setDate(Dated dated) {
		this.dated = dated;
	}
	
	
	
	
	
	

}
