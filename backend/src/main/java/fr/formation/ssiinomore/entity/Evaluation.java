
package fr.formation.ssiinomore.entity;

/**
 * 
 */
public class Evaluation {

   
    private int id;
    
    private String date;
    
    private Entreprise entreprise;
    
    private RetourExperience retourExperience;
    
    private Utilisateur utilisateur; 
    
    private int nbSignalements;
    
    /**
     * Default constructor
     */
    public Evaluation() {
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	public RetourExperience getRetourExperience() {
		return retourExperience;
	}

	public void setRetourExperience(RetourExperience retourExperience) {
		this.retourExperience = retourExperience;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public int getNbSignalements() {
		return nbSignalements;
	}

	public void setNbSignalements(int nbSignalements) {
		this.nbSignalements = nbSignalements;
	}
}
