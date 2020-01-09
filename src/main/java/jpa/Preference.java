package jpa;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Preference {
 private Collection<String> aliments;
 @ManyToMany
 private Person person;

public Collection<String> getAliments() {
	return aliments;
}

public void setAliments(Collection<String> aliments) {
	this.aliments = aliments;
}
 
}
