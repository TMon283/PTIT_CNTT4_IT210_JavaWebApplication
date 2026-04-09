package org.example.session05.homework05.service;

import org.example.session05.homework03.model.Dish;
import org.example.session05.homework05.repository.OrderRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Dish> getAvailableDishes() {
        return orderRepository.findAllDishes();
    }

    public double calculateTotal(List<Dish> selectedDishes) {
        return selectedDishes.stream()
                .mapToDouble(Dish::getPrice)
                .sum();
    }
}

