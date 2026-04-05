package org.example.demo;

import org.example.demo.configs.AppConfiguration;
import org.example.demo.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Đọc cấu hình của lớp AppConfiguration.class
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        CustomerService customerService = context.getBean("customerService", CustomerService.class);
        customerService.eat();
        customerService.sleep();
    }
}
