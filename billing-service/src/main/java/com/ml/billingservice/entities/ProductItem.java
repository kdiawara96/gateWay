package main.java.com.ml.billingservice.entities;

import java.sql.Date;
import java.util.List;

@Entity
@data
@NoArgsConstructor
@AllArgsConstructor
@builder

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
}
