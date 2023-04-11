package org.hours.customerservice.Models;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullCustomer", types = Customers.class)
public interface CustomerProjection {
    public Long getId();
    public String getName();
}
