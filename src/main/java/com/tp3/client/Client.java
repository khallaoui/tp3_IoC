package com.tp3.client;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

// import com.tp3.commande.Commande;

public class Client {
	private static int cmpt = 0;
	private int id;
	@Value("Ahmed")
	private String nom;
	@Value("Rabat")
	private String adresse;
	
//	private Commande comande;
	
	public Client() {
		id = ++cmpt;
	}
			


	/*
	 * public Client(String nom, String adresse) { this.nom = nom; this.adresse =
	 * adresse; id = ++cmpt; }
	 */
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", adresse=" + adresse + "]";
	}
	
	

}
