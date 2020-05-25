package edu.ubb.reactivespring.annotationdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@EnableReactiveMongoRepositories
@SpringBootApplication
public class AnnotationdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnnotationdemoApplication.class, args);
	}

}
