package com.hackacode.tourismAgency.services;

import com.hackacode.tourismAgency.entities.Employee;

import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);
    List<Employee> readAll();
    Employee readById(Long id);
    Employee update(Employee employee);
    void delete(Long id);
}
