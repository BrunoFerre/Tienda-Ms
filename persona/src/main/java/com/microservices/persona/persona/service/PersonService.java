package com.microservices.persona.persona.service;

import com.microservices.persona.persona.dto.GetPersonDTO;
import com.microservices.persona.persona.dto.PersonDTO;
import com.microservices.persona.persona.model.Person;

public interface PersonService {
    void save(PersonDTO person);

    GetPersonDTO findById(Long id);

    boolean existPerson(Long id);
}
