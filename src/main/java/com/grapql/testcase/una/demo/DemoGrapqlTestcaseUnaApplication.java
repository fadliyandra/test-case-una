package com.grapql.testcase.una.demo;

import com.grapql.testcase.una.demo.entities.Employee;
import com.grapql.testcase.una.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.client.HttpGraphQlClient;

@SpringBootApplication
//public class DemoGrapqlTestcaseUnaApplication implements CommandLineRunner {
public class DemoGrapqlTestcaseUnaApplication  {

	//private final EmployeeService employeeService;
	//public DemoGrapqlTestcaseUnaApplication(EmployeeService employeeService) {
	//	this.employeeService = employeeService;
	//}

	public static void main(String[] args) {
		SpringApplication.run(DemoGrapqlTestcaseUnaApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		Employee e1 = new Employee();
//		e1.setFirtsName("fadli");
//		e1.setLastName("yandra");
//		e1.setJobTitle("programmer");
//		e1.setGender("Male");
//		e1.setDivision("IT");
//		e1.setAddress("jakarta setiabud");
//
//		Employee e2 = new Employee();
//		e2.setFirtsName("james");
//		e2.setLastName("blunt");
//		e2.setJobTitle("Staf Hr");
//		e2.setGender("Male");
//		e2.setDivision("HR");
//		e2.setAddress("jakarta karet");
//
//		Employee e3 = new Employee();
//		e3.setFirtsName("fredy");
//		e3.setLastName("mercury");
//		e3.setJobTitle("PM");
//		e3.setGender("Male");
//		e3.setDivision("IT");
//		e3.setAddress("jakarta kuningan");
//
//		this.employeeService.create(e1);
//		this.employeeService.create(e2);
//		this.employeeService.create(e3);
//
//	}
}
