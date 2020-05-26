package com.mycompany.invoise.core.controller;

import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.service.InvoiceServiceInterface;

public interface InvoiceControllerInterface {

    String createInvoice(Invoice invoice);
    void setInvoiceService(InvoiceServiceInterface invoiceService);
}
