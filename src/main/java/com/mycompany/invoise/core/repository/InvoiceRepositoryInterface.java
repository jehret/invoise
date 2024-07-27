package com.mycompany.invoise.core.repository;

import com.mycompany.invoise.core.entity.Invoice;
import org.springframework.data.repository.CrudRepository;


import java.util.List;

public interface InvoiceRepositoryInterface extends CrudRepository<Invoice, String> {
    /*Invoice create(Invoice invoice);
    List<Invoice> list();
    Invoice getById(String number);*/
}
