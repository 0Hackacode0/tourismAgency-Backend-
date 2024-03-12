package com.hackacode.tourismAgency.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClientDto {

    private Long idClient;
    private String nameClient;
    private String lastNameClient;
    private String addressClient;
    private String dniClient;
    private String nationalityClient;
    private String cellPhoneClient;
    private String dateOfBirthClient;
    private String emailClient;
    private EmployeeDto employee;
}
