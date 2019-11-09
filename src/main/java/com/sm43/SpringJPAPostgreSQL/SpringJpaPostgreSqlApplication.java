package com.sm43.SpringJPAPostgreSQL;

import com.sm43.SpringJPAPostgreSQL.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringJpaPostgreSqlApplication {

	@Autowired
	UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaPostgreSqlApplication.class, args);
	}

	@PostConstruct
	public void initializeDb() {
		userService.addUsers();
	}

}
