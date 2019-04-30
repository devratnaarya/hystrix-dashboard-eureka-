package com.apigateway.service;

import org.springframework.stereotype.Service;

@Service
public abstract class EmployeeService {
	
	public abstract String getEmployee(int employeeId);
	
	public String fallbackMethod(int employeeid) {
		return "Fallback response:: No employee details available temporarily";
	}
}
