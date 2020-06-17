package com.mycompany.invoise.core.repository;

import com.mycompany.invoise.core.entity.Invoice;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;


public interface InvoiceRepositoryInterface extends CrudRepository<Invoice,String> {
    /*Invoice create(Invoice invoice);
    List<Invoice> list();
    Invoice getById(String number);*/
}
