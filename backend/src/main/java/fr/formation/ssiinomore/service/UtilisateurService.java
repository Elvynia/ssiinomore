
package fr.formation.ssiinomore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.formation.ssiinomore.dao.UtilisateurDao;

@Service
public class UtilisateurService {
	
	@Autowired
	private UtilisateurDao utilisateurDao;	

}

