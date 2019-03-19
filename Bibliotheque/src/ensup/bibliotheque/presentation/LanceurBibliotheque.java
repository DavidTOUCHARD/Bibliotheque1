package ensup.bibliotheque.presentation;

import java.util.Scanner;

import ensup.bibliotheque.dao.ConnectionDao;
import ensup.bibliotheque.service.EleveService;
import ensup.bibliotheque.service.LivreService;

/**
 * @author David
 * @versione 1.2
 *
 */
public class LanceurBibliotheque {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConnectionDao cd = new ConnectionDao();
		EleveService eleve = new EleveService();
		LivreService livre = new LivreService();

		System.out.println("Que voulez vous faire ?\n "
				+ "1 pour inscrir un eleve\n "
				+ "2 pour consulter la liste des livres\n "
				+ "3 pour ajouter un livre à la bibliothèque\n "
				+ "4 pour quitter");
		
		Scanner schoix = new Scanner(System.in);
		int choix = schoix.nextInt();
		switch (choix) {
		case 1:
			eleve.inscription();
			break;
		case 2:
			livre.consulterLivre();
			break;
		case 3:
			livre.nouveauLivre();
			break;
		case 4:
			System.exit(0);

		}
	}

}
