package org.example.session04.demo.controller;

import org.example.session04.demo.dao.StudentDAO;
import org.example.session04.demo.model.Student;
import org.example.session04.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Đánh dấu bean nó là controller
@Controller
// Đánh dấu đây là đường dẫn đến controller
@RequestMapping// Mặc định là dấu /
// Các Annotation phổ biến
/**
 * Các annotation không khác gì bean dùng để khởi tạo và sử dụng DI
 * - @Controller: Đánh dấu là bean và mục đích là điều hướng
 * - @Component: Đánh dấu là bean để khởi tạo và không có ngữ nghĩa
 * - @Service: Đánh dấu là bean và mục đích là nghiệp vụ
 * - @Repository: Đánh dấu là bean và mục đích xử lí tương tác database
 * - @Aotuwired
 */
public class HomeController {
    // DI
    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentDAO studentDAO;
    // Chức năng 1 có đường dẫn gì
    /**
    * Biến của @RequestMapping
    *   - @GetMapping: đại diện cho phương thức GET
    *   - @PostMapping: đại diện cho phương thức POST
    *   - @PutMapping: đại diện cho phương thức PUT
    *   - @PatchMapping: đại diện cho phương thức PATCH
    *   - @DeleteMapping: đại diện cho phương thức DELETE
    */
//    @RequestMapping(method = RequestMethod.GET) - cách cũ
    @GetMapping // - cách mới
    public String home(Model model) {
        List<Student> students = studentService.getAllStudents();
        System.out.println(students);

        model.addAttribute("listStudent", students);
        return "home";
    }

    @GetMapping("/search")
    public String searchByName(@RequestParam(name = "full_name", defaultValue = "") String keyword, Model model) {
        System.out.println("nội dung tìm kiếm: "+ keyword);
        List<Student> students = studentDAO.search(keyword);
        model.addAttribute("listStudent",students);
        return "home";
    }

    // Thường là những trang detail (chi tiết)
    // id là đường dẫn có thể đặt theo tùy biến
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable int id) {
        System.out.println("Nội dung giá trị trên đường dẫn: "+ id);
        return "home";
    }
}
