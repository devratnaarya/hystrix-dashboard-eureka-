package com.employee.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

	private String name;
	
	private int id;

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}

}
