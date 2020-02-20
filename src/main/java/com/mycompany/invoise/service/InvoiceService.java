package com.mycompany.invoise.service;

import com.mycompany.invoise.entity.Invoice;

import com.mycompany.invoise.repository.InvoiceRepositoryInterface;

public class InvoiceService implements InvoiceServiceInterface{

    private static long lastNumber=0L;

    private InvoiceRepositoryInterface invoiceRepository;

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public void createInvoice(Invoice invoice){
        invoice.setNumber(String.valueOf(++lastNumber));
        invoiceRepository.create(invoice);
    }
}
