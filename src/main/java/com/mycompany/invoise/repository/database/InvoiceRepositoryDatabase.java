package com.mycompany.invoise.repository.database;

import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.repository.InvoiceRepositoryInterface;
import org.springframework.stereotype.Repository;

@Repository
public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {

    public void create(Invoice invoice) {
        /*[…]
        PreparedStatement pstmt=connexion.prepareStatement("INSERT INTO FACTURE (NUMBER,CUSTOMERNAME) VALUES (?,?)");
                […]
        pstmt.executeUpdate();*/
        System.out.println("Database: Invoice added with number " + invoice.getNumber() + " for " + invoice.getCustomerName());
    }

}
