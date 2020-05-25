package edu.ubb.reactivespring.functionaldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@EnableReactiveMongoRepositories
@SpringBootApplication
public class FunctionaldemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FunctionaldemoApplication.class, args);
	}

}
