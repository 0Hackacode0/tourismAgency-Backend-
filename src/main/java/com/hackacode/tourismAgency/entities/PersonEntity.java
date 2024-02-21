package com.hackacode.tourismAgency.entities;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class PersonEntity {
    private String dni;
    private String nationality;
    private String cellPhone;
    private String name;
    private String lastName;
    private String dateOfBirth;
    private String address;
    private String email;
}
