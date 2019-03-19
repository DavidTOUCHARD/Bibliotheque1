package ensup.bibliotheque.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import ensup.bibliotheque.domaine.Eleve;

/**
 * @author David
 *
 */
public class EleveDao {

	/**
	 * @param eleve
	 */
	public static void insertEleve(Eleve eleve) { // Inserer un nouvel eleve dans la base de données

		ConnectionDao cd = new ConnectionDao();
		cd.connection();
		try {
			String sql = "INSERT INTO `eleve` (`nom`,`prenom`,`datenaissance`,`classe`,`mail`) VALUES ('" + eleve.nom
					+ "','" + eleve.prenom + "','" + eleve.datenaissance + "','" + eleve.classe + "','" + eleve.mail
					+ "');";
			cd.stat.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		cd.deconnection();

	}

}
