package jpa;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity 
public class Participant extends Person {
	
	
	private Collection<Preference> preferences;
	private Collection<Participer> participer;
	

	
	
	@OneToMany(mappedBy = "participant")
	public Collection<Preference> getPreferences() {
		return preferences;
	}
	public void setPreferences(Collection<Preference> preferences) {
		this.preferences = preferences;
	}

	@OneToMany(mappedBy = "participant")
	public Collection<Participer> getParticiper() {
		return participer;
	}

	public void setParticiper(Collection<Participer> participer) {
		this.participer = participer;
	}
}
