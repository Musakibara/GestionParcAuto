package Tp2Java;

import java.util.*;

public class ParcAuto {
	
	private Voiture [] v;
	
	public void ajouterV (int nbV) {
		
		v = new Voiture[nbV];
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<v.length; i++) {
			
			System.out.println("\nEntrez l'Identifiant de la voiture : " +i);
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Entrez la Marque de la voiture : " +i);
			String marque = sc.nextLine();
			
			System.out.println("Entrez le Modele de la voituret : " +i);
			String modele = sc.nextLine();
			
			System.out.println("Entrez l'annee de la voituret : " +i);
			int annee = sc.nextInt();
			sc.nextLine();
			
			v[i] = new Voiture(id, marque, modele, annee);
			System.out.println("\nVous avez fini avec la voiture " +i);
			
		}
	}
	
	public void rechercherParMarque(String marque) {
		
		for(int i=0; i<v.length; i++ ) {
			
			if(v[i].getMarque().contains(marque)) {
				
				System.out.println(v[i].toString());
			}
		}
	}
	
	public void afficherParc() {
		
		for(int i=0; i<v.length; i++) {
			
			System.out.println(v[i].toString());
		}
	}

}
