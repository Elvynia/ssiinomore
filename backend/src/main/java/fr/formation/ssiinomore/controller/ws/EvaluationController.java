package fr.formation.ssiinomore.controller.ws;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.ssiinomore.entity.Evaluation;
import fr.formation.ssiinomore.service.EvaluationService;

@RestController
@RequestMapping("/evaluation")
public class EvaluationController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EvaluationController.class);
	
	@Autowired
	private EvaluationService service;
	
	
	@RequestMapping(path = {"", "/"}, method = RequestMethod.GET)
	public List<Evaluation> list(@RequestParam(required=false) final Integer siren) {
		 return (siren != null && siren >= 0) ? this.service.readAll(siren) : this.service.readAll();
	}
	
	@GetMapping(path={"/{id}"}, produces={"application/json"})
	public Evaluation get(@PathVariable final Integer id) {
		 return this.service.read(id);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable final Integer id) {
		 this.service.delete(id);
	}
	
	@PutMapping(path={"", "/"}, consumes={"application/json"})
	public Evaluation create(@RequestBody final Evaluation evaluation) {
		 return this.service.create(evaluation);
	}
	
	@PostMapping(path={"", "/"}, consumes={"application/json"})
	public Evaluation update(@RequestBody final Evaluation evaluation)
	{
		LOGGER.debug(evaluation.getDateEval().toString());
		return this.service.update(evaluation);
	}

}
