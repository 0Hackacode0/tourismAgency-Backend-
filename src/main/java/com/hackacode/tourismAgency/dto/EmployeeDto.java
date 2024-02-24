package com.hackacode.tourismAgency.dto;

import com.hackacode.tourismAgency.entities.RoleEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDto {

    private Long idEmployee;
    private String name;
    private String lastName;
    private String address;
    private String dni;
    private String nationality;
    private String cellPhone;
    private String dateOfBirth;
    private String email;
    private RoleEnum role;
    private String userEmployee;
    private double salary;
}
