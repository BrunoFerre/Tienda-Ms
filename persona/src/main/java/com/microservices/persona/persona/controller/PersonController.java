package com.microservices.persona.persona.controller;

import com.microservices.persona.persona.dto.PersonDTO;
import com.microservices.persona.persona.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/{id}")
    public ResponseEntity<Object> getPerson(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(personService.findById(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
    }
    }
    @PostMapping
    public ResponseEntity<Object> createPerson(@RequestBody PersonDTO personDTO) {
        try {
            personService.save(personDTO);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @GetMapping("/exist")
    public boolean existPerson(@RequestParam Long id) {
        return personService.existPerson(id);
    }
}
