
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
@Table(name = "role")
public class Role {

	@Id
	private Integer id;

	@Column
	private String intitule;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="role", cascade={CascadeType.REMOVE})	
	@JsonIgnore
	private List<Utilisateur> utilisateurs;
	
	 /**
     * Default constructor
     */
    public Role() {
    }
	 
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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