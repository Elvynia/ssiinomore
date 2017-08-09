
package fr.formation.ssiinomore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import fr.formation.ssiinomore.dao.UtilisateurDao;
import fr.formation.ssiinomore.entity.Utilisateur;

@Service
public class UtilisateurService extends RestService<Utilisateur>
		implements UserDetailsService {

	@Autowired
	private UtilisateurDao dao;

	@Override
	protected JpaRepository<Utilisateur, Integer> getDao() {
		return dao;
	}

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		final UserDetails user = this.dao
				.findOne(Example.of(new Utilisateur(username)));
		if (user == null) {
			throw new UsernameNotFoundException(
					"DAO returned null with login='" + username + "'");
		}
		return user;
	}

}
