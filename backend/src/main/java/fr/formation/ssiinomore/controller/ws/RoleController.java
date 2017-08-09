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

import fr.formation.ssiinomore.entity.Role;
import fr.formation.ssiinomore.service.RoleService;

@RestController
@RequestMapping("/role")
public class RoleController {

	@Autowired
	private RoleService service;
	
	@RequestMapping({"", "/"})
	public List<Role> list() {
		 return this.service.readAll();
	}
	
	@GetMapping(path={"/{id}"}, produces={"application/json"})
	public Role get(@PathVariable final Integer id) {
		 return this.service.read(id);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable final Integer id) {
		 this.service.delete(id);
	}
	
	@PutMapping(path={"", "/"}, consumes={"application/json"})
	public Role create(@RequestBody final Role role) {
		 return this.service.create(role);
	}
	
	@PostMapping(path={"", "/"}, consumes={"application/json"})
	public Role update(@RequestBody final Role role)
	{
		return this.service.update(role);
	}
}
