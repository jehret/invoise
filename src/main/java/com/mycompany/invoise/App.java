package com.mycompany.invoise;

import com.mycompany.invoise.controller.InvoiceControllerInterface;
import com.mycompany.invoise.controller.InvoiceControllerKeyboard;
import com.mycompany.invoise.controller.InvoiceControllerDouchette;
import com.mycompany.invoise.controller.InvoiceControllerWeb;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;
import com.mycompany.invoise.repository.InvoiceRepositoryMemory;
import com.mycompany.invoise.repository.InvoiceRepositoryDatabase;
import com.mycompany.invoise.service.InvoiceServiceInterface;
import com.mycompany.invoise.service.InvoiceServiceNumber;
import com.mycompany.invoise.service.InvoiceServicePrefix;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Quel est la classe de controller  ?");
        String controllerClass=sc.nextLine();
        System.out.println("Quel est la classe de service ?");
        String serviceClass=sc.nextLine();
        System.out.println("Quel est la classe repository ?");
        String repositoryClass=sc.nextLine();


        InvoiceControllerInterface invoiceController=null;

        InvoiceServiceInterface invoiceService=null;

        InvoiceRepositoryInterface invoiceRepository=null;

        try {
            invoiceController = (InvoiceControllerInterface) Class.forName(controllerClass).getDeclaredConstructor().newInstance();
            invoiceService = (InvoiceServiceInterface) Class.forName(serviceClass).getDeclaredConstructor().newInstance();
            invoiceRepository = (InvoiceRepositoryInterface) Class.forName(repositoryClass).getDeclaredConstructor().newInstance();
        }
        catch (Exception e){
            e.printStackTrace();
        }


        invoiceController.setInvoiceService(invoiceService);
        invoiceService.setInvoiceRepository(invoiceRepository);

        invoiceController.createInvoice();
    }
}
