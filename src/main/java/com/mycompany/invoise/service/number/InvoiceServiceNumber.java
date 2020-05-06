package com.mycompany.invoise.service.number;

import com.mycompany.invoise.entity.Invoice;

import com.mycompany.invoise.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.service.InvoiceServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public class InvoiceServiceNumber implements InvoiceServiceInterface {

    private static long lastNumber=0L;

    private InvoiceRepositoryInterface invoiceRepository;

    @Override
    public List<Invoice> getInvoiceList() {
        return invoiceRepository.list();
    }

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
