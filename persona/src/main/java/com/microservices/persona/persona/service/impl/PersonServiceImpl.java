package com.microservices.persona.persona.service.impl;

import com.microservices.persona.persona.dto.GetPersonDTO;
import com.microservices.persona.persona.dto.PersonDTO;
import com.microservices.persona.persona.model.Person;
import com.microservices.persona.persona.repository.PersonRepository;
import com.microservices.persona.persona.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Override
    public void save(PersonDTO personDTO) {
        try {
            Person person = new Person(personDTO.getName(), personDTO.getLastName(), personDTO.getEmail());
            personRepository.save(person);
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    @Override
    public GetPersonDTO findById(Long id) {
        try {
            return new GetPersonDTO(personRepository.findById(id).orElseThrow());
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
    @Override
    public boolean existPerson(Long id) {
        return personRepository.existsById(id);
    }
}
