package com.example.demo.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Jeux {
	
	public Jeux(String nom, Double prix, Date date) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.date = date;
	}

	public Jeux() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	private String nom ; 
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	private Double prix ;
	
	private Date date ;

	@Override
	public String toString() {
		return "Jeux [id=" + id + ", nom=" + nom + ", prix=" + prix + ", date=" + date + "]";
	}
	
	

}
