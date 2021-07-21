package one.digitalinnovation.personapi.service;

import java.util.List;

import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.personapi.exception.PersonNotFoundException;

public interface PersonService {

	MessageResponseDTO create (PersonDTO personDTO);
	
	PersonDTO findById (Long id) throws PersonNotFoundException;
	
	List<PersonDTO> listAll();
	
	MessageResponseDTO update(Long id, PersonDTO personDTO) throws PersonNotFoundException;
	
	void delete (Long id) throws PersonNotFoundException;
	
}
