package org.example.session04.homework05.service;

import org.example.session04.homework05.dao.OrderDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderDAO orderDAO;

    @Autowired
    public OrderService(OrderDAO orderDAO) {
        this.orderDAO = orderDAO;
    }

    public String getOrderById(int id) {
        return orderDAO.findOrderById(id);
    }

    public String createOrder(String description) {
        return orderDAO.createOrder(description);
    }

    public String cancelOrder(int id) {
        return orderDAO.deleteOrder(id);
    }
}