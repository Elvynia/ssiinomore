
package fr.formation.ssiinomore.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.ssiinomore.entity.Evaluation;

public interface EvaluationDao extends JpaRepository<Evaluation,Integer> {
	
}

	