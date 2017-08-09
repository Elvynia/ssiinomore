
package fr.formation.ssiinomore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.ssiinomore.entity.Utilisateur;

public interface UtilisateurDao extends JpaRepository<Utilisateur, Integer> {

}
