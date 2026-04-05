package org.example.demo.service.implement;

import org.example.demo.service.OrderService;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService {
    @Override
    public void serve() {
        System.out.println("Dang phuc vu khach hang...");
    }
}
