package execution;

import java.util.ArrayList;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tp3.client.Client;
import com.tp3.commande.Commande;
import com.tp3.produit.Produit;
import com.tp3.produit.Stock;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Produit p1 = new Produit(100, "homme", "Chemise");
		Produit p2 = new Produit(150, "femme", "Chemise");
		Produit p3 = new Produit(50.5, "femme", "foulard");
		ArrayList<Produit> listeProduit = 
					new ArrayList();
		
		listeProduit.add(p1);
		listeProduit.add(p2);
		listeProduit.add(p3);
		
		Stock stk1 = new Stock(200, listeProduit);
		
		Client client1 = new Client("Ahmed", "Kenitra");
		
		Commande commande1 = new 
					Commande("01-01-2022", p1, client1);
		*/
		
		AnnotationConfigApplicationContext context =
		new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		System.out.println("------------- Le stock --------------------");
		Stock stck = context.getBean("stock", Stock.class);
		System.out.println(stck);
		
		System.out.println("-------------Le client -------------------");
		Client client = context.getBean(Client.class);
		System.out.println(client);
		
		System.out.println("------------------ Le produit -------------");
		Produit produit = context.getBean(Produit.class);
		System.out.println(produit);
		
		System.out.println("----------------- La commande ---------------------");
		Commande commande1 = context.getBean(Commande.class );
		System.out.println(commande1);
		
		
	}

	
	
	
	
}
