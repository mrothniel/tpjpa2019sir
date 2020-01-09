package jpa;

import javax.persistence.Entity;

@Entity
public class Mail {
	private Long Code;
	private String lien;
	public Long getCode() {
		return Code;
	}
	public void setCode(Long code) {
		Code = code;
	}
	public String getLien() {
		return lien;
	}
	public void setLien(String lien) {
		this.lien = lien;
	}

}
