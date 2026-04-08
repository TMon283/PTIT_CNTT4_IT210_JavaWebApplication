package org.example.session04.demo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null; // không cần config root
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{AppConfig.class}; // đăng ký config Spring MVC
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"}; // mapping toàn bộ request
    }
}