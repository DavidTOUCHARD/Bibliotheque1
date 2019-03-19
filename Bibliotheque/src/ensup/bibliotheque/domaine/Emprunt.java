package ensup.bibliotheque.domaine;

/**
 * @author David
 *
 */
public class Emprunt {

	public String dateemprunt;
	public int idlivre;

	public String getDateemprunt() {
		return dateemprunt;
	}

	public void setDateemprunt(String dateemprunt) {
		this.dateemprunt = dateemprunt;
	}

	public int getIdlivre() {
		return idlivre;
	}

	public void setIdlivre(int idlivre) {
		this.idlivre = idlivre;
	}


	public Emprunt(String dateemprunt, int idlivre) {
		super();
		this.dateemprunt = dateemprunt;
		this.idlivre = idlivre;
	}

}
