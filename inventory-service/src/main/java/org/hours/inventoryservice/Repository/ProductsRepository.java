package org.hours.inventoryservice.Repository;

import org.hours.inventoryservice.Models.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource
public interface ProductsRepository extends JpaRepository<Products, Long>{
    
}
