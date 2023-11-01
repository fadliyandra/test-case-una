package com.grapql.testcase.una.demo.repositories;

import com.grapql.testcase.una.demo.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepositroy extends JpaRepository <Employee, Integer> {
}
