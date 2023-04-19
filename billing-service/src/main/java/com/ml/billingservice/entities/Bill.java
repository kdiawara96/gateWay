package main.java.com.ml.billingservice.entities;

import java.beans.Transient;

import main.java.com.ml.billingservice.models.Customer;

@Entity
@data
@NoArgsConstructor
@AllArgsConstructor
@builder
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date billDate;
    private Long customerId;
    @OneToMany(mappedBy = "bill")
    private List<ProductItem> productItems;

    // Transient va dire à jpa cette attribut n'est pas créer dans la base de données
    @Transient
    private Customer customer;
}
