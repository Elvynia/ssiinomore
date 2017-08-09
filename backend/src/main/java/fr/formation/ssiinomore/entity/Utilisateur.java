
package fr.formation.ssiinomore.entity;


import java.sql.Date;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table(name = "utilisateur")
public class Utilisateur implements UserDetails {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)   
    private Integer id;
	
	@Column
	private String adresseIP;
   
	@OneToMany(fetch=FetchType.LAZY, mappedBy="utilisateur", cascade={CascadeType.REMOVE})
	@JsonIgnore
	private List<Evaluation> evaluations;    
    
	@ManyToOne
	@JoinColumn(name="id_role", referencedColumnName="id")
	private Role role;

    @Column
    private String nom;

    @Column
    private String prenom;

    @Column
    private Date dateInscription;
    
    @Column
    private String login;

    @Column
    @JsonProperty(access = Access.WRITE_ONLY)
    private String password;

    @Column
    private boolean actif;
    
    /**
     * Default constructor
     */
    public Utilisateur() {
    }
    
    public Utilisateur(final String nom) {
    	this.nom = nom;
    }
    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}    

    public Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
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
	
	 public String getAdresseIP() {
			return adresseIP;
		}


		public void setAdresseIP(String adresseIP) {
			this.adresseIP = adresseIP;
		}

		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			return Arrays.asList(this.getRole());
		}

		@Override
		public String getUsername() {
			return this.getNom();
		}

		@Override
		public boolean isAccountNonExpired() {
			return true;
		}

		@Override
		public boolean isAccountNonLocked() {
			return true;
		}

		@Override
		public boolean isCredentialsNonExpired() {
			return true;
		}

		@Override
		public boolean isEnabled() {
			return this.actif;
		}


}