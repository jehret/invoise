package com.mycompany.invoise.repository;

import com.mycompany.invoise.entity.Invoice;

import java.util.List;

public interface InvoiceRepositoryInterface {
    void create(Invoice invoice);
    List<Invoice> list();
}
