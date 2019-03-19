package ensup.bibliotheque.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ensup.bibliotheque.domaine.Eleve;
import ensup.bibliotheque.domaine.Livre;

/**
 * @author David
 *
 */
public class LivreDao {

	public static void afficherLivre() { //Afficher l'ensemble des livres present dans la base de données
		//ajouter un clause where afin de retrouver un livre dans la base de données
		ConnectionDao cd = new ConnectionDao();
		cd.connection();
		try {

			String sql = "SELECT * FROM `LIVRE` where `disponibilite` = true;";
			ResultSet rs = cd.stat.executeQuery(sql);
			System.out.println("ID\t\tTitre\t\tAuteur");
			System.out.println("-----\t\t------");
			while (rs.next()) {
				String books = rs.getInt("idlivre") + rs.getString("titre") + "\t\t" + rs.getString("auteur");
				System.out.println(books);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		cd.deconnection();

	}

	public static void ajouterLivre(Livre livre) {

		ConnectionDao cd = new ConnectionDao();
		cd.connection();
		try {
			String sql = "INSERT INTO `livre` (`titre`,`auteur`,`dateparution`,`disponibilite`) VALUES ('" + livre.titre + "','"
					+ livre.auteur + "','" + livre.dateparution + "', false);";
			cd.stat.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		cd.deconnection();

	}

}
