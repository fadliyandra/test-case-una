package com.grapql.testcase.una.demo.service;

import com.grapql.testcase.una.demo.entities.Employee;

import java.util.List;

public interface EmployeeService {

    //create
    Employee create(Employee employee);
    //get all
    List<Employee> getAll();

    //get single employe
    Employee get(int employeeId);

}
