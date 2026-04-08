package org.example.session04.homework05.controller;

import org.example.session04.homework05.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/homework05/orders/{id}")
    @ResponseBody
    public String getOrder(@PathVariable String id) {
        try {
            int orderId = Integer.parseInt(id);
            return orderService.getOrderById(orderId);
        } catch (NumberFormatException e) {
            return "ID đơn hàng phải là một số";
        }
    }

    @PostMapping("/homework05/orders")
    @ResponseBody
    public String createOrder(@RequestParam(value = "description", defaultValue = "Không có mô tả") String description) {
        return orderService.createOrder(description);
    }

    @DeleteMapping("/homework05/orders/{id}")
    @ResponseBody
    public String cancelOrder(@PathVariable int id) {
        return orderService.cancelOrder(id);
    }
}
