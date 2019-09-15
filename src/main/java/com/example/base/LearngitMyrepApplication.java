package com.example.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.base.components.Alien;
import com.example.base.components.Laptop;

/*
 * Here SpringBoot MVC Web application simplified
 *  - controllers
 *  - usage of requestparams
 *  - passing model pojo (not already connected to some database) as URI parameters
 *  - application.properties config for example to basepath for jsp pages, and suffix (.jsp) and for simple security
 *    once starting url localhost:8080/[home|home2] ==> a security page form is displayed! please enter user=user password=password!
 *  
 *  
 *  
 *  - NOTE: add "tomcat jasper" from mavenrepository because of jsp will not be compiled and viewed in the browser
 * 
 */
@SpringBootApplication
public class LearngitMyrepApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearngitMyrepApplication.class, args); //generated from spring-boot default
		
	}

}
