package com.mycompany.invoise.repository;

import com.mycompany.invoise.entity.Invoice;

public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface{

    public void create(Invoice invoice){
        /*[…]
        PreparedStatement pstmt=connexion.prepareStatement("INSERT INTO FACTURE (NUMBER,CUSTOMERNAME) VALUES (?,?)");
                […]
        pstmt.executeUpdate();*/
        System.out.println("Database: Invoice added with number "+invoice.getNumber()+" for "+invoice.getCustomerName());
    }

}
