package com.hackacode.tourismAgency.dto;

import com.hackacode.tourismAgency.entities.RoleEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDto {

    private Long idEmployee;
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
    private RoleEnum role;
    private String userEmployee;
    @NonNull
    private double salary;
}
