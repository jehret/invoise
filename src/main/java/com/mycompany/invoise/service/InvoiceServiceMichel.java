package com.mycompany.invoise.service;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;


public class InvoiceServiceMichel implements InvoiceServiceInterface{

    private static long lastNumber=112L;

    private InvoiceRepositoryInterface invoiceRepository;

    public void createInvoice(Invoice invoice){
        invoice.setNumber("INV_"+(++lastNumber));
        invoiceRepository.create(invoice);
    }
}
