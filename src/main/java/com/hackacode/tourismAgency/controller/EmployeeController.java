package com.hackacode.tourismAgency.controller;

import com.hackacode.tourismAgency.dto.EmployeeDto;
import com.hackacode.tourismAgency.entities.Employee;
import com.hackacode.tourismAgency.services.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.hackacode.tourismAgency.mapper.EmployeeMapper.employeeDtoToEntity;

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


}
