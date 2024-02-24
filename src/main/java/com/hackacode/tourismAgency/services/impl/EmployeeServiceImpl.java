package com.hackacode.tourismAgency.services.impl;

import com.hackacode.tourismAgency.entities.Employee;
import com.hackacode.tourismAgency.repositories.EmployeeRepository;
import com.hackacode.tourismAgency.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepo;
    @Override
    public Employee save(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public List<Employee> readAll() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee readById(Long id) {
        return employeeRepo.findById(id).orElse(null);
    }

    @Override
    public Employee update(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public void delete(Long id) {
        employeeRepo.deleteById(id);
    }
}
