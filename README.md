# hystrix-dashboard-eureka-

In this demo, we will create three applications. The below sample is created on top of Netflix Eureka to centrally manage and monitor registered applications. As you may already know that Netflix Eureka server is for building service registry server and associated Eureka clients which will register themselves to lookup other services and communicate thru REST API’s.

## Employee Service 
  This microservice application is responsible to fetch data of Employees.
## Api-Gateway
  This application is to provide common gateway while accessing different microservices. In the following example it will act as a gateway to Employee Service above.
## Eureka Server
  This microservice application will provide service discovery and registration of above microservices.
  
## Technology stack or Development Environment
- Java 1.8
- Spring tool suite
- Spring cloud
- Spring boot
- Spring Rest
- Maven

