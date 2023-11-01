package com.grapql.testcase.una.demo.service.impl;

import com.grapql.testcase.una.demo.entities.Employee;
import com.grapql.testcase.una.demo.repositories.EmployeeRepositroy;
import com.grapql.testcase.una.demo.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {

private final EmployeeRepositroy employeeRepositroy;

    public EmployeeServiceImpl(EmployeeRepositroy employeeRepositroy) {
        this.employeeRepositroy = employeeRepositroy;
    }

    @Override
    public Employee create(Employee employee) {
        return this.employeeRepositroy.save(employee);
    }

    @Override
    public List<Employee> getAll() {
        return this.employeeRepositroy.findAll();
    }

    @Override
    public Employee get( int employeeId) {
        return this.employeeRepositroy.findById(employeeId).orElseThrow(()-> new RuntimeException("employee id not found yaa"));
    }
}
