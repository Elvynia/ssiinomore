
package fr.formation.ssiinomore.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 */

@Entity
@Table(name = "evaluation")
public class Evaluation {

   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
    
	@Column
	private Date dateEval;

	@ManyToOne
	@JoinColumn(name="siren_entreprise", referencedColumnName="siren")	
	private Entreprise entreprise;    

	@ManyToOne
	@JoinColumn(name="id_utilisateur", referencedColumnName="id")	
	private Utilisateur utilisateur; 
    
	@Column
	private Integer nbSignalements;
	
	@Column
	private Integer duree;
    
	@Column
	private String statutContractuel;
    
	@Column
	private String posteOccupe;
    
	@Column
	private Integer avis;
    
    /**
     * Default constructor
     */
    public Evaluation() {
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Integer getNbSignalements() {
		return nbSignalements;
	}

	public void setNbSignalements(Integer nbSignalements) {
		this.nbSignalements = nbSignalements;
	}
	
	 public Integer getDuree() {
			return duree;
		}

	public void setDuree(Integer duree) {
		this.duree = duree;
	}
   
	public String getStatutContractuel() {
		return statutContractuel;
	}

	public void setStatutContractuel(String statutContractuel) {
		this.statutContractuel = statutContractuel;
	}

	public String getPosteOccupe() {
		return posteOccupe;
	}

	public void setPosteOccupe(String posteOccupe) {
		this.posteOccupe = posteOccupe;
	}

	public Integer getAvis() {
		return avis;
	}

	public void setAvis(Integer avis) {
		this.avis = avis;
	}
	
	public Date getDateEval() {
		return dateEval;
	}

	public void setDateEval(Date dateEval) {
		this.dateEval = dateEval;
	}
}
