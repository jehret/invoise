package com.mycompany.invoise.core.service;

import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.repository.InvoiceRepositoryInterface;

import java.util.List;

public interface InvoiceServiceInterface {
    Invoice createInvoice(Invoice invoice);

    List<Invoice> getInvoiceList();

    Invoice getInvoiceByNumber(String number);

    void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository);
}
