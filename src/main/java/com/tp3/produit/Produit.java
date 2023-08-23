package com.tp3.produit;

public class Produit {
	private static int cmpt = 0;
	private int id;
	
	private double prix;
	private String type;
	private String libelle;
	
	public Produit(double prix, String type, String libelle) {
		id = ++cmpt;
		this.prix = prix;
		this.type = type;
		this.libelle = libelle;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	@Override
	public String toString() {
		return "Produit [id=" + id + ", prix=" + prix + ", type=" + type + ", libelle=" + libelle + "]";
	}
	
		
}
