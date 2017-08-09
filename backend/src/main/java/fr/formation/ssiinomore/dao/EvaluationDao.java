
package fr.formation.ssiinomore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.ssiinomore.entity.Evaluation;

@Repository
public interface EvaluationDao extends JpaRepository<Evaluation,Integer> {
	
}

	