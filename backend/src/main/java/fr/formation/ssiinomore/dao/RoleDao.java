
package fr.formation.ssiinomore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.ssiinomore.entity.Role;

@Repository
public interface RoleDao extends JpaRepository<Role, Integer> {

}
