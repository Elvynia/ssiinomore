
package fr.formation.ssiinomore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import fr.formation.ssiinomore.dao.UtilisateurDao;
import fr.formation.ssiinomore.entity.Utilisateur;

@Service
public class UtilisateurService extends RestService<Utilisateur>{
	
	@Autowired
	private UtilisateurDao dao;

	@Override
	protected JpaRepository<Utilisateur, Integer> getDao() {
		return dao;
	}

}

