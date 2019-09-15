package com.example.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.base.components.Alien;
import com.example.base.components.Laptop;

@SpringBootApplication
public class LearngitMyrepApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LearngitMyrepApplication.class, args); //generated from spring-boot default
		ConfigurableApplicationContext ctx=SpringApplication.run(LearngitMyrepApplication.class, args);
		
		//obtain the Bean alien that must be configured as singleton and with @Component in the Alien class
		Alien a=ctx.getBean(Alien.class);
		a.setAid(1);a.setAname("Smith");a.setTech("Java");
		Alien b=ctx.getBean(Alien.class);
		if(a==b) System.out.println("Bean "+a+" IS THE SAME of Bean "+b);
		else System.out.println("Beans (a) and (b) are different! (maybe only if Scope is Prototype)");
		
		//obtain the Bean laptop , same as Alien configuration
		Laptop l=ctx.getBean(Laptop.class);
		l.setIdlap(1);l.setBrand("HP");l.setName("Pavillon 9600");
		
		//demostration of laptop autowired (Alien bean config) into bean a, that is performed by spring container and not from user
		//Dependency Injection feature demonstration
		System.out.println(l);
		System.out.println(a);
	}

}
