package org.hours.customerservice;

import java.util.List;
import org.hours.customerservice.Models.Customers;
import org.hours.customerservice.Repository.CustomersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}


	// @Bean
	// public CommandLineRunner commandLineRunner(CustomersRepository customersRepository,
	//  RepositoryRestConfiguration repositoryRestConfiguration){

	// 	// -------------------CELA VOUS EXPOSER LES ID-----------------------------
	// 	repositoryRestConfiguration.exposeIdsFor(Customers.class);
	// 	return args -> {
	// 		customersRepository.saveAll(
	// 			List.of(
	// 			Customers.builder().name("DIAWARA Karim").email("karimdiawara96@gmail.com").build(),
	// 			Customers.builder().name("DIAWARA Karim").email("karimdiawara96@gmail.com").build(),
	// 			Customers.builder().name("DIAWARA Karim").email("karimdiawara96@gmail.com").build(),
	// 			Customers.builder().name("DIAWARA Karim").email("karimdiawara96@gmail.com").build()
	//         )
	//       );
	// 	//   --------------------LES DEUX SONT PAREIL-------------------------
	// 	  customersRepository.findAll().forEach(System.out::println);
	// 	//   ------------------------METHODE DEUX---------------------------
	// 	  customersRepository.findAll().forEach(c->{
	// 		System.out.println(c);
	// 	  });
	// 	};
	// }

}
