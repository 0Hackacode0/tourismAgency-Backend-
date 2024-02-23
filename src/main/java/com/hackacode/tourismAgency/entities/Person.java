package com.hackacode.tourismAgency.entities;

import jakarta.persistence.MappedSuperclass;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@MappedSuperclass
public abstract class Person {

    private String name;
    private String lastName;
    private String address;
    private String dni;
    private String nationality;
    private String cellPhone;
    private String dateOfBirth;
    private String email;
}
