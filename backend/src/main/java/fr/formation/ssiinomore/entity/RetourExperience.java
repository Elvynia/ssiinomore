
package fr.formation.ssiinomore.entity;

/**
 * 
 */
public class RetourExperience {

    private int id;
   
    private int duree;
    
    private String statutContractuel;
    
    private String posteOccupe;
    
    private int avis;
    
    /**
     * Default constructor
     */
    public RetourExperience() {
    }    
    
    public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}
	

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getAvis() {
		return avis;
	}

	public void setAvis(int avis) {
		this.avis = avis;
	}
}
