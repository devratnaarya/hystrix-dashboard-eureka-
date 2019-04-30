package com.apigateway.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.apigateway.service.EmployeeService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@Service
public class EmployeeServiceImpl extends EmployeeService {

	@HystrixCommand(fallbackMethod = "fallbackMethod", commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10"),
			@HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "10") })
	public String getEmployee(int employeeId) {
		String response = restTemplate.exchange("http://employee-service/employee/{employeeId}",
				HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
				}, employeeId).getBody();
		return response;
	}

	@Autowired
	RestTemplate restTemplate;
}
