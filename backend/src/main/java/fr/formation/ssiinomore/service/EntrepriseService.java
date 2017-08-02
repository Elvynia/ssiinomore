
package fr.formation.ssiinomore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.ssiinomore.dao.EntrepriseDao;

@Service
public class EntrepriseService {
	
	@Autowired
	private EntrepriseDao entrepriseDao;
	

}
