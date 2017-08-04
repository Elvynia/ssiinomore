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

import fr.formation.ssiinomore.entity.Entreprise;
import fr.formation.ssiinomore.service.EntrepriseService;

@RestController
@RequestMapping("/api/entreprise")
public class EntrepriseController {
	
	@Autowired
	private EntrepriseService service;
	
	@RequestMapping({"", "/"})
	public List<Entreprise> list() {
		 return this.service.readAll();
	}
	
	@GetMapping(path={"/{siren}"}, produces={"application/json"})
	public Entreprise get(@PathVariable final Integer siren) {
		 return this.service.read(siren);
	}
	
	@DeleteMapping("/{siren}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable final Integer siren) {
		 this.service.delete(siren);
	}
	
	@PutMapping(path={"", "/"}, consumes={"application/json"})
	public Entreprise create(@RequestBody final Entreprise entreprise) {
		 return this.service.create(entreprise);
	}
	
	@PostMapping(path={"", "/"}, consumes={"application/json"})
	public Entreprise update(@RequestBody final Entreprise entreprise)
	{
		return this.service.update(entreprise);
	}

}
