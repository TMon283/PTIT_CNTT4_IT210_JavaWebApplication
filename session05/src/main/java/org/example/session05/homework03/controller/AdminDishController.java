package org.example.session05.homework03.controller;

import org.example.session05.homework03.service.AdminDishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AdminDishController {

    @Autowired
    private AdminDishService adminDishService;

    @GetMapping("/homework03/edit/{id}")
    public String editDish(@PathVariable Long id, Model model) {
        return adminDishService.findById(id)
                .map(dish -> {
                    model.addAttribute("dish", dish);
                    return "edit-dish";
                })
                .orElseGet(() -> {
                    model.addAttribute("errorMessage", "Không tìm thấy món ăn yêu cầu!");
                    return "redirect:/homework02/dishes";
                });
    }
}
