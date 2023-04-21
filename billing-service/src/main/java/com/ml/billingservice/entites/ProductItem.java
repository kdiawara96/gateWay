package com.ml.billingservice.entites;


import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import com.ml.billingservice.models.Product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ProductItem {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

   private Long id; 
   private Long productId;

   @ManyToOne
   private Bill bill;
   private int quantity;
   private double price;
   private double discount;
   
   @Transient
   private Product product;
}
