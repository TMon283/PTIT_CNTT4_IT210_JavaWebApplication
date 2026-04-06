package org.example.demo.homework03;

import java.util.Date;

public class Order {
    private int id;
    private String productName;
    private double totalAmount;
    private Date orderDate;

    public Order() {
    }

    public Order(String productName, double totalAmount, Date orderDate, int id) {
        this.productName = productName;
        this.totalAmount = totalAmount;
        this.orderDate = orderDate;
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
