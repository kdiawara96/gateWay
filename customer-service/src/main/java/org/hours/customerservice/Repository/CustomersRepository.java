package org.hours.customerservice.Repository;

import org.hours.customerservice.Models.Customers;
import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface CustomersRepository extends JpaRepository<Customers,Long>{
    
}
