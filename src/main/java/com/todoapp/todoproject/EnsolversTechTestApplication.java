package com.todoapp.todoproject;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories("com.sharaafnazeer.todo.repo")
@SpringBootApplication()
public class EnsolversTechTestApplication {

	public static void main(String[] args) {
            System.out.println("Application started");
	    SpringApplication.run(EnsolversTechTestApplication.class, args);
	}

}
