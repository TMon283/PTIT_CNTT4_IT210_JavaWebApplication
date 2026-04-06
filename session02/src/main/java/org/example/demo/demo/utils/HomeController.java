package org.example.demo.demo.utils;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomeController {
    @GetMapping ("/home")// Đại diện cho ngách và phương thức GET
    public String home() {
        return "students";
    }

    @GetMapping("/add")
    public String add() {
        return "add";
    }
}
