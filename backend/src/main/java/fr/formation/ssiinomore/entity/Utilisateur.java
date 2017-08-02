
package fr.formation.ssiinomore.entity;

import java.util.List;

/**
 * 
 */
public class Utilisateur {
   
    private int id;
	private List<String> adresseIP;

    private List<Evaluation> evaluations;

    private Role role;

    private String nom;

    private String prenom;

    private String dateInscription;

    private String login;

    private String password;

    private boolean actif;
    
    /**
     * Default constructor
     */
    public Utilisateur() {
    }

    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<String> getAdresseIP() {
		return adresseIP;
	}

	public void setAdresseIP(List<String> adresseIP) {
		this.adresseIP = adresseIP;
	}

	public List<Evaluation> getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(List<Evaluation> evaluations) {
		this.evaluations = evaluations;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(String dateInscription) {
		this.dateInscription = dateInscription;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActif() {
		return actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

}