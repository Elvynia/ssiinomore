
package fr.formation.ssiinomore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.formation.ssiinomore.dao.EvaluationDao;

@Service
public class EvaluationService {
	
	@Autowired
	private EvaluationDao evaluationDao;
	

}