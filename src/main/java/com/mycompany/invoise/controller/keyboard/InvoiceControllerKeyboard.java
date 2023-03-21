package com.mycompany.invoise.controller.keyboard;

import com.mycompany.invoise.controller.InvoiceControllerInterface;
import com.mycompany.invoise.entity.Invoice;

import com.mycompany.invoise.service.InvoiceServiceInterface;
import org.springframework.stereotype.Controller;

import java.util.Scanner;
@Controller
public class InvoiceControllerKeyboard implements InvoiceControllerInterface {

    public InvoiceControllerKeyboard(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    private final InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void createInvoice(){
        System.out.println( "What is the customer name?" );
        Scanner sc=new Scanner(System.in);
        String customerName=sc.nextLine();
        Invoice invoice=new Invoice();
        invoice.setCustomerName(customerName);

        invoiceService.createInvoice(invoice);
    }

}
