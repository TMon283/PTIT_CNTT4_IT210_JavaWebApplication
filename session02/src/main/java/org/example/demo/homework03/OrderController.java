package org.example.demo.homework03;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private ServletContext application;

    @GetMapping("/orders")
    public String showOrders(HttpSession session, Model model) {
        if (session.getAttribute("loggedUser") == null) {
            return "redirect:/login";
        }

        synchronized (application) {
            Integer count = (Integer) application.getAttribute("totalViewCount");
            if (count == null) {
                count = 0;
            }
            count++;
            application.setAttribute("totalViewCount", count);
        }

        List<Order> orders = Arrays.asList(
                new Order("Điện thoại iPhone 15", 22500000.0, new Date(), 101),
                new Order("Tai nghe AirPods Pro", 5200000.0, new Date(), 102),
                new Order("Củ sạc Anker 20W", 350000.0, new Date(), 103)
        );

        model.addAttribute("orderList", orders);

        return "orders";
    }
}