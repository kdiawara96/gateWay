package com.ml.billingservice.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ml.billingservice.models.Product;

@FeignClient(name = "INVENTORY-SERVICE")
public interface ProductRestClient{
    
    @GetMapping(path = "/productses/{id}")
    public Product findProductById(@PathVariable Long id);

    @GetMapping(path = "/productses")
    public PagedModel<Product> findAllProducts();
}
