/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ensup.bibliotheque.dao;

import java.sql.*;
import ensup.bibliotheque.domaine.Emprunt;
import ensup.bibliotheque.domaine.Livre;
/**
 *
 * @author David
 */
public class EmpruntLivreDao {

	public void empruntLivre(Emprunt emprunt, Livre livre) { // Inserer un "emprunt" dans la base de données
		String url = "jdbc:mysql://localhost/bibliotheque";
		String login = "root";
		String password = "";
		Connection cn = null;
		Statement st = null;
		try {
			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.jdbc.Driver");
			// Etape 2 : récupération de la connexion
			cn = DriverManager.getConnection(url, login, password);
			// Etape 3 : Creation d'un statement
			st = cn.createStatement();
			String sql = "INSERT INTO `emprunt` (`dateemprunt`,`idlivre`) VALUES ('" + emprunt.dateemprunt + "','"
					+ emprunt.idlivre + "');";
			// Etape 4 : execution de la requete
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		try {
			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.jdbc.Driver");
			// Etape 2 : récupération de la connexion
			cn = DriverManager.getConnection(url, login, password);
			// Etape 3 : Creation d'un statement
			st = cn.createStatement();
			String sql = "UPDATE `livre` set `disponibilite`= false where `titre` = (SELECT `titre` FROM `livre` where idlivre = '" + emprunt.idlivre + "';";
			// Etape 4 : execution de la requete
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		finally {
			try {
				// Etape 5 : liberer les ressources de la memoire
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
