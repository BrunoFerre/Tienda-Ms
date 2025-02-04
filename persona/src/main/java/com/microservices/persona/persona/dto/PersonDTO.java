package com.microservices.persona.persona.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@NotBlank(message = "Empty field")
public class PersonDTO {
    private String name;
    private String lastName;
    private String email;

}
