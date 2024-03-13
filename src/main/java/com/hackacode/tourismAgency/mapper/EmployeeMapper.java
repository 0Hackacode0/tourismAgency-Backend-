package com.hackacode.tourismAgency.mapper;

import com.hackacode.tourismAgency.dto.EmployeeDto;
import com.hackacode.tourismAgency.entities.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {

    public static Employee employeeDtoToEntity(EmployeeDto dto) {
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
