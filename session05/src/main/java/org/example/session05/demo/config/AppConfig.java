package org.example.session05.demo.config;

import nz.net.ultraq.thymeleaf.layoutdialect.LayoutDialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring6.view.ThymeleafViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "org.example.session05")
public class AppConfig {
    // 1. Bean SpringResourceTemplateResolver - đọc cấu hình folder file view
    @Bean
    public SpringResourceTemplateResolver templateResolver() {
        SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
        // set tiền tố
        resolver.setPrefix("/WEB-INF/views/");
        // set hậu tố
        resolver.setSuffix(".html");
        // set charactor UTF-8 để nhận những kí tự tiếng việt
        resolver.setCharacterEncoding("UTF-8");
        return resolver;
    }
    // 2. Bean SpringTemplateEngine - bộ máy trung tâm xử lí và chuyên các cú pháp Thymeleaf
    @Bean
    public SpringTemplateEngine templateEngine() {
        SpringTemplateEngine engine = new SpringTemplateEngine();
        engine.setTemplateResolver(templateResolver());
//        // Để sử dụng được layout dialect của thymeleaf
//        engine.setDialect(new LayoutDialect());
        return engine;
    }

    // 3. Bean ThymeleafViewResolver - giao tiếp Spring MVC với Thymeleaf
    @Bean
    public ThymeleafViewResolver viewResolver() {
        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
        resolver.setTemplateEngine(templateEngine());
        resolver.setCharacterEncoding("UTF-8");
        return resolver;
    }
}
