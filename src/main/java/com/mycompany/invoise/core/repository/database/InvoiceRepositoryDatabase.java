package com.mycompany.invoise.core.repository.database;

import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.repository.InvoiceRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {

    public void create(Invoice invoice) {
        /*[…]
        PreparedStatement pstmt=connexion.prepareStatement("INSERT INTO FACTURE (NUMBER,CUSTOMERNAME) VALUES (?,?)");
                […]
        pstmt.executeUpdate();*/
        System.out.println("Database: Invoice added with number " + invoice.getNumber() + " for " + invoice.getCustomerName());
    }

    @Override
    public List<Invoice> list() {
        Invoice invoice1 = new Invoice();
        invoice1.setNumber(1L);
        invoice1.setCustomerName("EDF");
        Invoice invoice2 = new Invoice();
        invoice2.setNumber(2L);
        invoice2.setCustomerName("La poste");
        return List.of(invoice1, invoice2);
    }

    @Override
    public Invoice getById(Long number) {
        Invoice invoice1 = new Invoice();
        invoice1.setNumber(number);
        invoice1.setCustomerName("EDF");
        invoice1.setOrderNumber("ON_002");
        return invoice1;
    }
}
