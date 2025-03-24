package Tp2Java;

import java.util.Scanner;

public class TestParcAuto {

	public static void main(String[] args) {

		ParcAuto parc = new ParcAuto();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEntrez le nombre de voiture a entres : ");
		int nb = sc.nextInt();
		sc.nextLine();
		
		parc.ajouterV(nb);

		parc.afficherParc();
		
		System.out.println("\nEntrez la marque de la voiture a rechercher: ");
		String marque = sc.nextLine();

		parc.rechercherParMarque(marque);
	}

}
