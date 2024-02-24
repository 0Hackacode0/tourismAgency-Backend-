package com.hackacode.tourismAgency.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClientDto {

    private Long idClient;
    private String name;
    private String lastName;
    private String address;
    private String dni;
    private String nationality;
    private String cellPhone;
    private String dateOfBirth;
    private String email;
    private EmployeeDto employee;
}
