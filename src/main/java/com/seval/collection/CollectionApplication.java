package com.seval.collection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.seval.collection.domain")
@EntityScan(basePackages = "com.seval.collection.domain")
public class CollectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollectionApplication.class, args);
	}
}
