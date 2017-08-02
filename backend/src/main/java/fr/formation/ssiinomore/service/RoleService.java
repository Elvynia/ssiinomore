
package fr.formation.ssiinomore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.ssiinomore.dao.RoleDao;

@Service
public class RoleService {
	
	@Autowired
	private RoleDao roleDao;
	

}

