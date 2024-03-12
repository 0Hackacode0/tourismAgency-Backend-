package com.hackacode.tourismAgency.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hackacode.tourismAgency.entities.RoleEnum;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDto {

    private Long idEmployee;
    private String nameEmployee;
    private String lastNameEmployee;
    private String addressEmployee;
    private String dniEmployee;
    private String nationalityEmployee;
    private String cellPhoneEmployee;
    private String dateOfBirthEmployee;
    private String emailEmployee;
    private RoleEnum roleEmployee;
    private String userEmployee;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Size(min = 10, max = 70)
    private String passwordEmployee;
    private double salary;
}
