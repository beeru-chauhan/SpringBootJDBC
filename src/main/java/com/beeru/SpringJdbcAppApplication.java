package com.beeru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.beeru.model.Employee;

@SpringBootApplication
public class SpringJdbcAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcAppApplication.class, args);
		Employee e=new Employee();
		e.setId(4);
		e.setName("Rohan");
		e.setCity("Mumbai");
			
	}

}
