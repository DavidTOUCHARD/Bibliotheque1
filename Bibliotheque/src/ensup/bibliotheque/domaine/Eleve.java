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
public class Eleve {

	public String nom;
	public String prenom;
	public String classe;
	public String datenaissance;
	public String mail;

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public void setDatenaissance(String date_naissance) {
		this.datenaissance = date_naissance;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getClasse() {
		return classe;
	}

	public String getDatenaissance() {
		return datenaissance;
	}

	public String getMail() {
		return mail;
	}

	public Eleve(String nom, String prenom, String classe, String datenaissance, String mail) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.classe = classe;
		this.datenaissance = datenaissance;
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Eleve [nom=" + nom + ", prenom=" + prenom + ", classe=" + classe + ", datenaissance=" + datenaissance
				+ ", mail=" + mail + "]";
	}
	
	
}
