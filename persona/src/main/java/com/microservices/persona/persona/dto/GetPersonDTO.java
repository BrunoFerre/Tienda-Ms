package com.microservices.persona.persona.dto;

import com.microservices.persona.persona.model.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GetPersonDTO {
    private Long id;
    private String name;
    private String lastName;
    private String email;

    public GetPersonDTO(Person person) {
        this.id = person.getId();
        this.name = person.getName();
        this.lastName = person.getLastName();
        this.email = person.getEmail();
    }
}
