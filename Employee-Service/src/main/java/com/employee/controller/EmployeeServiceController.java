package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@RestController
public class EmployeeServiceController {
	
    @RequestMapping(value = "/employee/{employeeId}", method = RequestMethod.GET)
    public Employee getEmployeeDetails(@PathVariable int employeeId) throws Exception {
    	if (employeeId == 0) {
    		throw new Exception("Invalid employee id provided!");
    	}
        System.out.println("Getting Employee details for " + employeeId);
        Employee employee = employeeService.getEmployee(employeeId);
        if (employee == null) {
        	employee = new Employee("N/A", -1);
        }
        return employee;
    }
    
    @Autowired
    private EmployeeService employeeService;

}
