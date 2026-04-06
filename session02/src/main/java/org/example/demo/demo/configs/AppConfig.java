package org.example.demo.demo.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

// đánh dấu lớp cầu hình
@Configuration
// bật sử dụng web mvc
@EnableWebMvc
// sử dụng scan đ quét các bean
@ComponentScan(basePackages = "org.example.demo")
public class AppConfig {
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        // tiền tố
        viewResolver.setPrefix("/views/");
        // hậu tố
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}
