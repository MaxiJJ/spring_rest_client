package com.maxim.spring.rest;

import com.maxim.spring.rest.configuration.MyConfig;
import com.maxim.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
//        List<Employee> employees = communication.getAllEmployees();
//        System.out.println(employees);

//        Employee empById = communication.getEmployee(1);
//        System.out.println(empById);

//        Employee employee = new Employee("Sveta", "Ivanova", "IT", 900);
//        employee.setId(8);
//        communication.saveEmployee(employee);

        communication.deleteEmployee(8);
    }
}
