package com.tp3.commande;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

import com.tp3.client.Client;
import com.tp3.produit.Produit;

public class Commande {
	
	private static int cmpt = 0;
	private int id;
	
	@Value("01-01-2022")
	private String date;
	
	@Autowired
	private Produit produit;
	@Autowired
	private Client client;
	
	public Commande() {id = ++cmpt;}
	/*
	public Commande(String date, Produit produit, Client client) {
		id = ++cmpt;
		this.date = date;
		this.produit = produit;
		this.client = client;
	}
	*/

	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Commande [id=" + id + ", date=" + date + ", produit=" + produit + ", client=" + client + "]";
	}
	
	
	

}
