package com.mycompany.invoise.core.repository;

import com.mycompany.invoise.core.entity.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepositoryInterface extends CrudRepository<Customer, Long> {
    /*Invoice create(Invoice invoice);
    List<Invoice> list();
    Invoice getById(Long number);*/
}
