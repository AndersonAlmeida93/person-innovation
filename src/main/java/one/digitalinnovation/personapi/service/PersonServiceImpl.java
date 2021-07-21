package one.digitalinnovation.personapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinnovation.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.personapi.entity.Person;
import one.digitalinnovation.personapi.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;

	@Override
	public MessageResponseDTO createPerson(Person person) {

		Person save = personRepository.save(person);
		return MessageResponseDTO.builder().message("Created person with id " + save.getId()).build();
	}

}
