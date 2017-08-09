
package fr.formation.ssiinomore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import fr.formation.ssiinomore.dao.UtilisateurDao;
import fr.formation.ssiinomore.entity.Utilisateur;

//@Service("utilisateurService")
@Service
public class UtilisateurService extends RestService<Utilisateur> implements UserDetailsService {
	
	@Autowired
	private UtilisateurDao dao;

	@Override
	protected JpaRepository<Utilisateur, Integer> getDao() {
		return dao;
	}

	@Override
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}

