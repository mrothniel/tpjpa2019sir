package jpa;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Reunion {
	private String intitule;
	private String resume;
	private Collection<Person> persons ;	
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
	@OneToMany(mappedBy = "reunion")
	public Collection<Person> getPersons() {
		return persons;
	}
	public void setPersons(Collection<Person> persons) {
		this.persons = persons;
	}
	
	
	

}
