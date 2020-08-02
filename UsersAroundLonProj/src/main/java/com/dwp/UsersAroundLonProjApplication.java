package com.dwp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(UsersAroundLonProjConfig.class)
public class UsersAroundLonProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersAroundLonProjApplication.class, args);
	}

}
