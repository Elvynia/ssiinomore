
package fr.formation.ssiinomore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.ssiinomore.entity.Utilisateur;

@Repository
public interface UtilisateurDao extends JpaRepository<Utilisateur, Integer> {

}
