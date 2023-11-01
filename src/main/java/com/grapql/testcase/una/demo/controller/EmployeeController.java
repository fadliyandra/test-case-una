package com.grapql.testcase.una.demo.controller;

import com.grapql.testcase.una.demo.entities.Employee;
import com.grapql.testcase.una.demo.service.EmployeeService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@Controller
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(  EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //add
    @MutationMapping("createEmployee")
    public Employee create(@Argument EmployeeInput employee){
        Employee e = new Employee();
        e.setFirtsName(employee.getFirtsName());
        e.setLastName(employee.getLastName());
        e.setJobTitle(employee.getJobTitle());
         e.setGender(employee.getGender());
        e.setDivision(employee.getDivision());
        e.setAddress(employee.getAddress());

        return this.employeeService.create(e);
    }

    @QueryMapping("allEmployee")
    public List<Employee> getAll(){
        return this.employeeService.getAll();
    }

    //get single employee
    @QueryMapping("getEmployee")
    public Employee get(@Argument int employeeId){
        return this.employeeService.get(employeeId);

    }


}
@Getter
@Setter
class EmployeeInput{
    private String firtsName;
    private String lastName;
    private String jobTitle;
    private String gender;
    private String division;
    private String address;
}
