package com.mycompany.invoise;

import com.mycompany.invoise.controller.InvoiceController;
import com.mycompany.invoise.controller.InvoiceControllerMichel;
import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceService;
import com.mycompany.invoise.service.InvoiceServiceMichel;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println("Dans quelle configuration êtes-vous ?");
        Scanner sc=new Scanner(System.in);
        int configuration=sc.nextInt();
        if (configuration==1) {
            InvoiceController invoiceController = new InvoiceController();
            invoiceController.createInvoice();
        }
        else if (configuration==2) {
            InvoiceControllerMichel invoiceController = new InvoiceControllerMichel();
            invoiceController.createInvoice();
        }
    }
}
