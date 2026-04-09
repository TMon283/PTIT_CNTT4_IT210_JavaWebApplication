package org.example.session05.homework05.controller;

import org.example.session05.homework03.model.Dish;
import org.example.session05.homework05.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class OrderDetailController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/homework05/order/quick")
    public String quickOrder(Model model) {
        model.addAttribute("dishes", orderService.getAvailableDishes());
        return "order-quick";
    }

    @GetMapping("/homework05/dish/{id}")
    public String dishDetail(@PathVariable Long id, Model model) {
        Optional<Dish> dish = orderService.getAvailableDishes()
                .stream().filter(d -> d.getId().equals(id)).findFirst();

        if (dish.isPresent()) {
            model.addAttribute("dish", dish.get());
            return "dish-detail";
        } else {
            model.addAttribute("errorMessage", "Không tìm thấy món ăn yêu cầu!");
            return "redirect:/bai2/dishes";
        }
    }
}

