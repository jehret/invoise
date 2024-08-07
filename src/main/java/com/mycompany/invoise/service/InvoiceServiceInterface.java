package com.mycompany.invoise.service;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;

import java.util.List;

public interface InvoiceServiceInterface {
    void createInvoice(Invoice invoice);

    List<Invoice> getInvoiceList();

    void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository);
}
