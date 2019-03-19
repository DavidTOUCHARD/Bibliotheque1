package ensup.bibliotheque.service;

import java.util.Scanner;

import ensup.bibliotheque.dao.LivreDao;
import ensup.bibliotheque.domaine.Livre;

/**
 * @author David
 *
 */
public class LivreService {

	/**
	 * Livre livre : objet livre
	 */
	public void nouveauLivre() { //Ajouter un livre a la bibliotheque
		Livre livre;
		System.out.println("Ajout d'un nouveau livre : \n");

		System.out.println("Quel est le titre du livre ?\n");
		Scanner stitre = new Scanner(System.in);
		String titre = stitre.next();

		System.out.println("Qui est l'auteur de ce livre ?\n");
		Scanner sauteur = new Scanner(System.in);
		String auteur = sauteur.next();

		System.out.println("Quelle est la date de parution du livre ?\n");
		Scanner sdateparution = new Scanner(System.in);
		String dateparution = sdateparution.next();

		livre = new Livre(titre, auteur, dateparution);
		LivreDao.ajouterLivre(livre);
		System.out.println("Le livre a été ajouter à la bibliothèque :  " + livre);

	}

	public void consulterLivre() { //Consulter la liste des livres de la bibliotheque
		System.out.println("Voici la liste des livres de la bibliothèque");
		LivreDao.afficherLivre();
	}
}
