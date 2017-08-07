
package fr.formation.ssiinomore.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import fr.formation.ssiinomore.controller.ws.EvaluationController;
import fr.formation.ssiinomore.dao.EvaluationDao;
import fr.formation.ssiinomore.entity.Entreprise;
import fr.formation.ssiinomore.entity.Evaluation;

@Service
public class EvaluationService  extends RestService<Evaluation>{
	
	@Autowired
	private EvaluationDao dao;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EvaluationController.class);
	
	
	@Override
	protected JpaRepository<Evaluation, Integer> getDao() {
		return this.dao;
	}
	
	public List<Evaluation> readAll(Integer siren) {
		final Entreprise entreprise = new Entreprise();
		entreprise.setSiren(siren);
		
		final Evaluation evaluation = new Evaluation();
		evaluation.setEntreprise(entreprise);
		
		LOGGER.debug(">>>>>>> siren:"+siren);
		
		return this.dao.findAll(Example.of(evaluation));
	}
	

}