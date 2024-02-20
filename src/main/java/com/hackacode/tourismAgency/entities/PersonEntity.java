package com.hackacode.tourismAgency.entities;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class PersonEntity {
    private String dni;
    private String nationality;
    private String cell_phone;
    private String name;
    private String last_name;
    private String date_of_birth;
    private String address;
    private String email;
}
