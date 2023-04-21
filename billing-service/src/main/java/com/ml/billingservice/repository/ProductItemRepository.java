package com.ml.billingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ml.billingservice.entites.ProductItem;

public interface ProductItemRepository extends JpaRepository<ProductItem, Long> {
    
}
