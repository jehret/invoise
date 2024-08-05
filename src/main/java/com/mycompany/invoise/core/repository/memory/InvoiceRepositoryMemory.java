package com.mycompany.invoise.core.repository.memory;

import com.mycompany.invoise.core.entity.Invoice;
import com.mycompany.invoise.core.repository.InvoiceRepositoryInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//@Repository
public class InvoiceRepositoryMemory implements InvoiceRepositoryInterface {

    private static final List<Invoice> invoices = new ArrayList<>();

    public Invoice save(Invoice invoice) {
        invoices.add(invoice);
        System.out.println("Invoice added with number " + invoice.getNumber() + " for " + invoice.getCustomerName());
        return invoice;
    }

    @Override
    public Iterable<Invoice> findAll() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterable<Invoice> findAllById(Iterable<String> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long count() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteById(String s) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(Invoice invoice) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteAll(Iterable<? extends Invoice> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException();
    }

    @Override
    public <S extends Invoice> Iterable<S> saveAll(Iterable<S> iterable) {
        throw new UnsupportedOperationException();
    }

    /**
     * Retrieves an entity by its id.
     *
     * @param s must not be {@literal null}.
     * @return the entity with the given id or {@literal Optional#empty()} if none found.
     * @throws IllegalArgumentException if {@literal id} is {@literal null}.
     */
    @Override
    public Optional<Invoice> findById(String s) {
        return Optional.empty();
    }

    /**
     * Returns whether an entity with the given id exists.
     *
     * @param s must not be {@literal null}.
     * @return {@literal true} if an entity with the given id exists, {@literal false} otherwise.
     * @throws IllegalArgumentException if {@literal id} is {@literal null}.
     */
    @Override
    public boolean existsById(String s) {
        return false;
    }

}