package one.digitalinnovation.personapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinnovation.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.personapi.entity.Person;
import one.digitalinnovation.personapi.service.PersonService;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {

	@Autowired
	private  PersonService personService;
	
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public MessageResponseDTO createPerson(@RequestBody Person person) {
		
		return personService.createPerson(person);
	}
}
