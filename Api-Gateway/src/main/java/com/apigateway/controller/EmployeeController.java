package com.apigateway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.apigateway.service.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/employee/{employeeid}", method = RequestMethod.GET)
	public String getStudents(@PathVariable int employeeid) throws Exception {
		Object obj = employeeService.getEmployee(employeeid);
		ObjectMapper mapper = new ObjectMapper();
		return "Employee Id -  " + employeeid + " [ Employee Details " + mapper.writeValueAsString(obj) + " ] Request_id";
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
