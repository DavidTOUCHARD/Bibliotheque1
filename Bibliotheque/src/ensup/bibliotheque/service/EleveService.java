package ensup.bibliotheque.service;

import java.util.Scanner;

import ensup.bibliotheque.dao.EleveDao;
import ensup.bibliotheque.domaine.Eleve;

/**
 * @author David
 * @category Inscription
 *
 */
public class EleveService {

	/**
	 * @param Eleve : eleve objet
	 */
	public void inscription() { // permet d'inscrir un eleve en indiquant son nom, prenom etc...
		Eleve eleve;
		
		System.out.println("Inscription d'un eleve\n");

		System.out.println("Entrer le nom de l'eleve\n");
		Scanner snom = new Scanner(System.in);
		String nom = snom.next();

		System.out.println("Entrer le prenom de l'eleve\n");
		Scanner sprenom = new Scanner(System.in);
		String prenom = sprenom.next();

		System.out.println("Entrer la date de naissance de l'eleve (jj/mm/aaaa\n");
		Scanner sclasse = new Scanner(System.in);
		String classe = sclasse.next();

		System.out.println("Entrer le mail de l'eleve\n");
		Scanner sdatenaissance = new Scanner(System.in);
		String datenaissance = sdatenaissance.next();

		System.out.println("Entrer le mail de l'eleve\n");
		Scanner smail = new Scanner(System.in);
		String mail = smail.next();

		eleve = new Eleve(nom, prenom, classe, datenaissance, mail);

		EleveDao.insertEleve(eleve);

		System.out.println("L'eleve suivant a été créé  : \n" + eleve);
	}
}
