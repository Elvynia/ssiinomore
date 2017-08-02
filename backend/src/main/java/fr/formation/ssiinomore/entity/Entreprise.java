
package fr.formation.ssiinomore.entity;

import java.util.List;

/**
 * 
 */
public class Entreprise {	
	 
    private int siren;
    
    private List<Evaluation> evaluations;
    
    private String nom;
    
    private String sigle;
    
    private int codePostal;
    
    private String ville;
    
    private boolean radie;
    
    private int nbRecherches;
    
    /**
     * Default constructor
     */
    public Entreprise() {
    }
    
	public int getSiren() {
		return siren;
	}

	public void setSiren(int siren) {
		this.siren = siren;
	}

	public List<Evaluation> getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(List<Evaluation> evaluations) {
		this.evaluations = evaluations;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSigle() {
		return sigle;
	}

	public void setSigle(String sigle) {
		this.sigle = sigle;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public boolean isRadie() {
		return radie;
	}

	public void setRadie(boolean radie) {
		this.radie = radie;
	}

	public int getNbRecherches() {
		return nbRecherches;
	}

	public void setNbRecherches(int nbRecherches) {
		this.nbRecherches = nbRecherches;
	}
}
