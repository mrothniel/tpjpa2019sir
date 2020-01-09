package jpa;

import java.util.Collection;

import javax.persistence.Entity;

@Entity
public class Pad {
	
	private String titreReunion;
	private Collection<Participant> participantPresent;
	private Collection<Participant> participantAbsent;
	private Sondage sondage;
	public String getTitreReunion() {
		return titreReunion;
	}
	public void setTitreReunion(String titreReunion) {
		this.titreReunion = titreReunion;
	}
	public Collection<Participant> getParticipantPresent() {
		return participantPresent;
	}
	public void setParticipantPresent(Collection<Participant> participantPresent) {
		this.participantPresent = participantPresent;
	}
	public Collection<Participant> getParticipantAbsent() {
		return participantAbsent;
	}
	public void setParticipantAbsent(Collection<Participant> participantAbsent) {
		this.participantAbsent = participantAbsent;
	}
	public Sondage getSondage() {
		return sondage;
	}
	public void setSondage(Sondage sondage) {
		this.sondage = sondage;
	}
	

}
