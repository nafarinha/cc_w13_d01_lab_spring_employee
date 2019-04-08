package com.example.codeclan.lab_spring_employee;

import com.example.codeclan.lab_spring_employee.models.Employee;
import com.example.codeclan.lab_spring_employee.repositories.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LabSpringEmployeeApplicationTests {

	@Autowired
	EmployeeRepository employeerepo;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployee() {
		Employee employee = new Employee("John Doe", 30, 1234567, "jdoe@email.com");
		employeerepo.save(employee);
	}

}
