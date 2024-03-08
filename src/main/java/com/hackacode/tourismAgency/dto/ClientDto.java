package com.hackacode.tourismAgency.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClientDto {

    private Long idClient;
    @NonNull
    private String name;
    @NonNull
    private String lastName;
    @NonNull
    private String address;
    @NonNull
    private String dni;
    @NonNull
    private String nationality;
    @NonNull
    private String cellPhone;
    @NonNull
    private String dateOfBirth;
    @NonNull
    private String email;
    private EmployeeDto employee;
}
