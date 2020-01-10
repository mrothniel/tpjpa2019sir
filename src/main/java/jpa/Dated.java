package jpa;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Dated {
	
	
	private long id;
	private Date date;
	private Date heure_debut;
	private Date heure_fin;
	private boolean pause ;
	private Sondage sondage;
	private Reunion reunion;
	private Collection<Participer> participer ;
	
	@Id
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getHeure_debut() {
		return heure_debut;
	}
	public void setHeure_debut(Date heure_debut) {
		this.heure_debut = heure_debut;
	}
	public Date getHeure_fin() {
		return heure_fin;
	}
	public void setHeure_fin(Date heure_fin) {
		this.heure_fin = heure_fin;
	}
	public boolean isPause() {
		return pause;
	}
	public void setPause(boolean pause) {
		this.pause = pause;
	}
	
	@ManyToOne
	public Sondage getSondage() {
		return sondage;
	}
	public void setSondage(Sondage sondage) {
		this.sondage = sondage;
	}
	@OneToOne
	public Reunion getReunion() {
		return reunion;
	}
	public void setReunion(Reunion reunion) {
		this.reunion = reunion;
	}
	@OneToMany (mappedBy = "date")
	public Collection<Participer> getParticiper() {
		return participer;
	}
	public void setParticiper(Collection<Participer> participer) {
		this.participer = participer;
	}
	
	
	
	
}
