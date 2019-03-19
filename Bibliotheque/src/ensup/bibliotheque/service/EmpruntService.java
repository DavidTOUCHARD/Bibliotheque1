package ensup.bibliotheque.service;

import java.util.Scanner;

import ensup.bibliotheque.domaine.Eleve;
import ensup.bibliotheque.domaine.Emprunt;
import ensup.bibliotheque.dao.LivreDao;

/**
 * @author David
 *
 */
public class EmpruntService {

	public void choisirLivre() {
		// permet d'afficher la liste des livres afin de choisir le livre à
		// emprunter
		System.out.println("Voici la liste des livres que vous pouvez emprunter : \n");
		LivreDao ld = new LivreDao();
		ld.afficherLivre();
	}

	/**
	 * @param Emprunt emprunt objet emprunt
	 */
	public void emprunterLivre() {

		Emprunt emprunt;

		System.out.println("Quel est l'ID du livre que vous souhaitez emprunter ? \n");
		Scanner sidlivre = new Scanner(System.in);
		int idlivre = sidlivre.nextInt();
		System.out.println("A quelle date souahaitez vous l'emprunter ? \n");
		Scanner sdate = new Scanner(System.in);
		String date = sdate.next();		

		emprunt = new Emprunt(date,idlivre);
	}
}
