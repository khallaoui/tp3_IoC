package execution;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tp3.client.Client;
import com.tp3.commande.Commande;
import com.tp3.produit.Produit;
import com.tp3.produit.Stock;

@Configuration
//@ComponentScan("com.tp3")

public class AppConfig {
	
	@Bean
	public Client client() {
		return new Client();
	}
	
	@Bean
	public Produit produit(@Value("100") int prix, @Value("Chemise")String libelle, @Value("Femme")String type) {
		return new Produit(prix, libelle, type);
	}
	
	@Bean
	public Commande commande() {
		return new Commande();
	}
	
	@Bean
	public ArrayList<Produit> produits(){
		
		ArrayList<Produit> produitsList =  new ArrayList<Produit>() ;
		
		produitsList.add(new Produit(100, "Chemise", "Femme"));
		produitsList.add(new Produit(100, "Pantalon", "Homme"));
		produitsList.add(new Produit(100, "Foulard", "Femme"));
		
		return produitsList;
	}
	
	@Bean
	public Stock stock(@Value("100") int quantite, ArrayList<Produit> produits) {
		return new Stock(quantite, produits());
	}
	

}
