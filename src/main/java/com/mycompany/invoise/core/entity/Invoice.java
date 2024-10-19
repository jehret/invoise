package com.mycompany.invoise.core.entity;

public class Invoice {

    private Long number;
    private String customerName;
    private String orderNumber;

    public Invoice(Long number, String customerName) {
        this.number = number;
        this.customerName = customerName;
    }

    public Invoice(long number, String customerName, String orderNumber) {
        this.number = number;
        this.customerName = customerName;
        this.orderNumber = orderNumber;
    }

    public Invoice() {
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
}
