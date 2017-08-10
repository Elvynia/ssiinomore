package fr.formation.ssiinomore.service;

import java.util.List;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 *
 * @param <ENTITY> l'entité utilisée par le DAO
 */
public abstract class RestService<ENTITY> {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RestService.class);

	/**
	 * @return JpaRepository<ENTITY, Integer> le DAO a utiliser pour effectuer l'accès à la BDD
	 */
	protected abstract JpaRepository<ENTITY, Integer> getDao();
	
	public ENTITY create(final ENTITY entity) {
		ENTITY result = null;
		try {
			result = this.getDao().save(entity);
		} catch (final PersistenceException e) {
			RestService.LOGGER.error("Impossible d'ajouter une nouvelle entité : ", e);
		}
		return result;
	}
	
	public ENTITY read(final Integer id) {
		
		return this.getDao().findOne(id);
	}
	
	public List<ENTITY> readAll() {
		
		return this.getDao().findAll();
	}
	
	public ENTITY update(final ENTITY entity) {
		
		return this.getDao().save(entity);
	}
	
	public void delete(final Integer id) {
		
		this.getDao().delete(id);
	}
}
