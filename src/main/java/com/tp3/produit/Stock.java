package com.tp3.produit;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Stock {
	private static int cmpt = 0;
	private int id;
	
	private double quatite;
	
	private ArrayList<Produit> produits ;
	
	@Autowired
	public Stock(double quatite, ArrayList<Produit> produits) {
		this.quatite = quatite;
		this.produits = produits;
		id = ++cmpt;
	}
	
	public double getQuatite() {
		return quatite;
	}
	public void setQuatite(double quatite) {
		this.quatite = quatite;
	}
	public ArrayList<Produit> getProduits() {
		return produits;
	}
	public void setProduits(ArrayList<Produit> produits) {
		this.produits = produits;
	}
	
	
	@Override
	public String toString() {
		return "Stock [id=" + id + ", quatite=" + quatite + ", produits=" + produits + "]";
	}
	
	
}
