package org.example.demo.configs;

import org.example.demo.Person;
import org.example.demo.service.CustomerService;
import org.example.demo.service.OrderService;
import org.example.demo.service.implement.CustomerServiceImpl;
import org.example.demo.service.implement.OrderServiceImpl;
import org.springframework.context.annotation.Bean;

public class AppConfiguration {

    @Bean
    public Person fullstack() {
        Person person1 = new Person();
        person1.setId(1);
        person1.setName("Person1");
        person1.setMajor("Fullstack");
        return person1;
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl();
    }

    @Bean
    public CustomerService customerService() {
        return new CustomerServiceImpl();
    }
}
