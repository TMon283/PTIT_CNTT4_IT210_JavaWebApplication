package org.example.demo.homework05.controller;

import jakarta.servlet.http.HttpSession;
import org.example.demo.homework05.model.Employee;
import org.example.demo.homework05.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public String listEmployees(HttpSession session, Model model) {
        if(session.getAttribute("loggedUser") == null) {
            return "redirect:/login";
        }
        model.addAttribute("employees", employeeService.getAll());
        model.addAttribute("totalTechSalary", employeeService.totalSalaryByDepartment("Kỹ thuật"));
        return "employees";
    }

    @GetMapping("/employees/{code}")
    public String employeeDetail(@PathVariable String code,
                                 HttpSession session,
                                 Model model) {
        if(session.getAttribute("loggedUser") == null) {
            return "redirect:/login";
        }
        Employee emp = employeeService.findByCode(code);
        model.addAttribute("employee", emp);
        return "employee-detail";
    }
}
