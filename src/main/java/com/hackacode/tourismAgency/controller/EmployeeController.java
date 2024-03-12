package com.hackacode.tourismAgency.controller;

import com.hackacode.tourismAgency.dto.EmployeeDto;
import com.hackacode.tourismAgency.entities.Employee;
import com.hackacode.tourismAgency.services.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeDto> save(@Valid @RequestBody EmployeeDto dto) {
        Employee employee = employeeDtoToEntity(dto);
        employeeService.save(employee);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

    private Employee employeeDtoToEntity(EmployeeDto dto) {
        Employee employee = new Employee();
        employee.setIdEmployee(dto.getIdEmployee());
        employee.setName(dto.getNameEmployee());
        employee.setLastName(dto.getLastNameEmployee());
        employee.setAddress(dto.getAddressEmployee());
        employee.setDni(dto.getDniEmployee());
        employee.setNationality(dto.getNationalityEmployee());
        employee.setCellPhone(dto.getCellPhoneEmployee());
        employee.setDateOfBirth(dto.getDateOfBirthEmployee());
        employee.setEmail(dto.getEmailEmployee());
        employee.setRole(dto.getRoleEmployee());
        employee.setUserEmployee(dto.getUserEmployee());
        employee.setPasswordEmployee(dto.getPasswordEmployee());
        employee.setSalary(dto.getSalary());
        return employee;
    }
}
