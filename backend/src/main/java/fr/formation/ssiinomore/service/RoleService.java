
package fr.formation.ssiinomore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import fr.formation.ssiinomore.dao.RoleDao;
import fr.formation.ssiinomore.entity.Role;

@Service
public class RoleService extends RestService<Role>{
	
	@Autowired
	private RoleDao dao;

	@Override
	protected JpaRepository<Role, Integer> getDao() {
		return dao;
	}
	

}

