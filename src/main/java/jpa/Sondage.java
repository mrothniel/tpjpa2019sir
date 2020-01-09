package jpa;

import java.util.Collection;

import javax.persistence.Entity;
@Entity
public class Sondage {
	
private Collection<Date> dates;

public Collection<Date> getDates() {
	return dates;
}

public void setDates(Collection<Date> dates) {
	this.dates = dates;
}
}
