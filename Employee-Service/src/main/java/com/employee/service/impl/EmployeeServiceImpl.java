package com.employee.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private static final Map<Integer, Employee> employeeData = new HashMap<Integer, Employee>() {
		/**
		 * 
		 */
		private static final long serialVersionUID = -3970206781360313502L;

		{
			put(111,new Employee("Employee1", 111));
			put(222,new Employee("Employee2", 222));
		}
 
    };
    
	@Override
	public Employee getEmployee(int employeeId) {
		return employeeData.get(employeeId);
	}

}
