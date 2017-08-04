
package fr.formation.ssiinomore.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "entreprise")
public class Entreprise {
	
	@Id	
    private int siren;
    
	@OneToMany(fetch=FetchType.LAZY, mappedBy="evaluation", cascade={CascadeType.REMOVE})
	private List<Evaluation> evaluations;
    
	@Column
    private String nom;
    
	@Column
    private String sigle;
    
	@Column
	private int codePostal;
    
	@Column
	private String ville;
    
	@Column
	private boolean radie;
    
	@Column
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
