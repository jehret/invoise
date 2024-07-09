package com.mycompany.invoise.controller.web;

import com.mycompany.invoise.controller.InvoiceControllerInterface;
import com.mycompany.invoise.entity.Invoice;

import com.mycompany.invoise.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class InvoiceControllerWeb implements InvoiceControllerInterface {

    @Autowired
    private InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    public void createInvoice(){

        String customerName="Tesla";
        Invoice invoice=new Invoice();
        invoice.setCustomerName(customerName);

        invoiceService.createInvoice(invoice);
    }

    @RequestMapping("/invoice-home")
    public @ModelAttribute("invoices") List<Invoice> displayHome(){
        System.out.println("La méthode display Home a été invoquée");
        List<Invoice> invoices=invoiceService.getInvoiceList();
        return invoices;
    }
}
