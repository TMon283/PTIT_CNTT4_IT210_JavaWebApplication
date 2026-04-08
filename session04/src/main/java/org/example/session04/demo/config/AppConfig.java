package org.example.session04.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

// Đánh dấu là lớp cấu hình
@Configuration
// Bật chết độ web mvc
@EnableWebMvc
// Quét các bean đang cần được khởi tạo
@ComponentScan(basePackages = "org.example.session04")
public class AppConfig {
    // Cấu hình Bean ViewResolver để đọc được view
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        // Cấu hình tiền tố
        viewResolver.setPrefix("/WEB-INF/views/");
        // Cấu hình hậu tố
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}
