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
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        InvoiceControllerInterface invoiceController=context.getBean(InvoiceControllerInterface.class);

        invoiceController.createInvoice();
    }
}
