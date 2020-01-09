package jpa;

import javax.persistence.Entity;

@Entity
public class Participant {
	
	private Mail mail;

	public Mail getMail() {
		return mail;
	}

	public void setMail(Mail mail) {
		this.mail = mail;
	}
}
