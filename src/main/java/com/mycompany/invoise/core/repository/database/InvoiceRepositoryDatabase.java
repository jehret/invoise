package com.mycompany.invoise.core.repository.database;

import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.repository.InvoiceRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

@Repository
public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Invoice create(Invoice invoice) {

        KeyHolder kh = new GeneratedKeyHolder();

        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO INVOICE(CUSTOMER_NAME,ORDER_NUMBER) VALUES (?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, invoice.getCustomerName());
            ps.setString(2, invoice.getOrderNumber());
            return ps;
        }, kh);

        invoice.setNumber(kh.getKey().longValue()); // Assuming invoice number is now a Long

        return invoice;
    }

    @Override
    public List<Invoice> list() {

        return jdbcTemplate.query("SELECT INVOICE_NUMBER,CUSTOMER_NAME FROM INVOICE",
                (rs, rowNum) -> new Invoice((rs.getLong("INVOICE_NUMBER")),
                        rs.getString("CUSTOMER_NAME")));


    }

    @Override
    public Invoice getById(Long number) {
        return jdbcTemplate.queryForObject("SELECT INVOICE_NUMBER,CUSTOMER_NAME,ORDER_NUMBER FROM INVOICE WHERE INVOICE_NUMBER=?",
                new Object[]{number},
                (rs, rowNum) -> new Invoice((rs.getLong("INVOICE_NUMBER")),
                        rs.getString("CUSTOMER_NAME"), rs.getString("ORDER_NUMBER")));
    }
}
