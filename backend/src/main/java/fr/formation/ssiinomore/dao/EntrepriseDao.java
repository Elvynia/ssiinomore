
package fr.formation.ssiinomore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.ssiinomore.entity.Entreprise;

@Repository
public interface EntrepriseDao extends JpaRepository<Entreprise, Integer> {

}
