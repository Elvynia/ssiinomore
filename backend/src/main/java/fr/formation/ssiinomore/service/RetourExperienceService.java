
package fr.formation.ssiinomore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.ssiinomore.dao.RetourExperienceDao;


@Service
public class RetourExperienceService {
	
	@Autowired
	private RetourExperienceDao retourExperienceDao;
	

}
