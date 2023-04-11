package org.hours.inventoryservice;

import org.hours.inventoryservice.Models.Products;
import org.hours.inventoryservice.Repository.ProductsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import java.util.List;


@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

// 	@Bean
//    public CommandLineRunner start(ProductsRepository repo, RepositoryRestConfiguration repositoryRestConfiguration){
// 		repositoryRestConfiguration.exposeIdsFor(Products.class);
// 		return agrs->{
// 			repo.saveAll(
// 				List.of(
// 					Products.builder().name("Iphone 12 pro").quantity(12).price(350000).build(),
// 					Products.builder().name("Cover").quantity(145).price(3500).build(),
// 					Products.builder().name("Tecno").quantity(124).price(35000).build()
// 	            )
// 			);

// 		      repo.findAll().forEach(System.out::println);
// 			  repo.findAll().forEach(c->{
// 				System.out.println(c);
// 			});
// 	};
// 	}

}
