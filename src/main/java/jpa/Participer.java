package jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Participer {
	
	private long id ;
	private Participant participant;
	private Dated dated;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@ManyToOne
	public Participant getParticipant() {
		return participant;
	}
	public void setParticipant(Participant participant) {
		this.participant = participant;
	}
	@ManyToOne
	public Dated getDate() {
		return dated;
	}
	public void setDate(Dated dated) {
		this.dated = dated;
	}
	

}
