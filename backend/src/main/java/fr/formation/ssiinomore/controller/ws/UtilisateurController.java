package fr.formation.ssiinomore.controller.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.ssiinomore.entity.Utilisateur;
import fr.formation.ssiinomore.service.UtilisateurService;

@RestController
@RequestMapping("/utilisateur")
public class UtilisateurController {

	@Autowired
	private UtilisateurService service;
	
	@RequestMapping({"", "/"})
	public List<Utilisateur> list() {
		 return this.service.readAll();
	}
	
	@GetMapping(path={"/{id}"}, produces={"application/json"})
	public Utilisateur get(@PathVariable final Integer id) {
		 return this.service.read(id);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable final Integer id) {
		 this.service.delete(id);
	}
	
	@PutMapping(path={"", "/"}, consumes={"application/json"})
	public Utilisateur create(@RequestBody final Utilisateur utilisateur) {
		 return this.service.create(utilisateur);
	}
	
	@PostMapping(path={"", "/"}, consumes={"application/json"})
	public Utilisateur update(@RequestBody final Utilisateur utilisateur)
	{
		return this.service.update(utilisateur);
	}
}
