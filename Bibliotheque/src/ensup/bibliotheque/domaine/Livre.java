/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ensup.bibliotheque.domaine;

/**
 *
 * @author David
 */
public class Livre {

	public String titre;
	public String auteur;
	public String dateparution;

	public Livre(String titre, String auteur, String dateparution) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.dateparution = dateparution;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public void setDate_parution(String dateparution) {
		this.dateparution = dateparution;
	}

	public String getTitre() {
		return titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public String getdateparution() {
		return dateparution;
	}

	@Override
	public String toString() {
		return "Livre [titre=" + titre + ", auteur=" + auteur + ", dateparution=" + dateparution + "]";
	}

}
