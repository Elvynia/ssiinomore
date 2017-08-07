
package fr.formation.ssiinomore.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 */
@Entity
@Table(name = "entreprise")
public class Entreprise {
	
	@Id	
    private Integer siren;
    
	@OneToMany(fetch=FetchType.LAZY, mappedBy="entreprise", cascade={CascadeType.REMOVE})
	@JsonIgnore
	private List<Evaluation> evaluations;
    
	@Column
    private String nom;
    
	@Column
    private String sigle;
    
	@Column
	private Integer codePostal;
    
	@Column
	private String ville;
    
	@Column
	private boolean radie;
    
	@Column
	private Integer nbRecherches;
    
    /**
     * Default constructor
     */
    public Entreprise() {
    }
    
	public Integer getSiren() {
		return siren;
	}

	public void setSiren(Integer siren) {
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

	public Integer getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(Integer codePostal) {
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

	public Integer getNbRecherches() {
		return nbRecherches;
	}

	public void setNbRecherches(Integer nbRecherches) {
		this.nbRecherches = nbRecherches;
	}
}
