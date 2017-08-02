
package fr.formation.ssiinomore.entity;

import java.util.List;

/**
 * 
 */
public class Role {

	private int id;

	private String intitule;
	    
	private List<Utilisateur> utilisateurs;
	
	 /**
     * Default constructor
     */
    public Role() {
    }
	 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
}