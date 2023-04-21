package com.ml.billingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ml.billingservice.entites.Bill;

public interface BillRepository extends JpaRepository<Bill, Long> {
    
}
