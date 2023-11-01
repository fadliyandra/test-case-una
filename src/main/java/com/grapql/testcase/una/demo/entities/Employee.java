package com.grapql.testcase.una.demo.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employee_data")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firtsName;
    private String lastName;
    private String jobTitle;
    private String gender;
    private String division;
    private String address;

}
