package org.example.demo.service.implement;

import org.example.demo.service.CustomerService;
import org.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerServiceImpl implements CustomerService {
    // DI: Tiêm sự phụ thuộc
    @Autowired // Sử dụng annotation @Autowired để DI bằng field
    private OrderService orderService;

    // Bao nhiêu cách tiêm DI: 3
    // 1. Constructors
//    public CustomerServiceImpl(OrderService orderService) {
//        this.orderService = orderService;
//    }
    // 2. Setter
//    public void setOrderService(OrderService orderService) {
//        this.orderService = orderService;
//    }
    // 3. Field

    @Override
    public void eat() {
        orderService.serve();
    }

    public void sleep() {
        System.out.println("Dang ngu...");
    }
}
