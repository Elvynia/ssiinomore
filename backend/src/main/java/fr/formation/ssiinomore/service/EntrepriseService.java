
package fr.formation.ssiinomore.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import fr.formation.ssiinomore.dao.EntrepriseDao;
import fr.formation.ssiinomore.entity.Entreprise;

@Service
public class EntrepriseService extends RestService<Entreprise>{
	
	@Autowired
	private EntrepriseDao dao;
	
	@Override
	protected JpaRepository<Entreprise, Integer> getDao() {
		return this.dao;
	}
	

}
