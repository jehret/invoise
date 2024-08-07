package com.mycompany.invoise.core.service;

import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.repository.InvoiceRepositoryInterface;

import java.util.List;

public interface InvoiceServiceInterface {
    void createInvoice(Invoice invoice);

    List<Invoice> getInvoiceList();

    void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository);
}
