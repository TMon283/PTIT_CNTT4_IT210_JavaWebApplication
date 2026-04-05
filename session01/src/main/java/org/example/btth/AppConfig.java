package org.example.btth;

import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

public class AppConfig {

    // Bean - NormalNotify
    @Bean
    public NormalNotify normalNotify() {
        return new NormalNotify();
    }
    // Bean - VIPNotify
    @Bean
    public VIPNotify vipNotify() {
        return new VIPNotify();
    }
    // Bean - AccountManagememt
    @Bean
    public AccountManagement accountManagement() {
        Map<String, Double> students = new HashMap<>();
        students.put("Đinh Quốc Khánh", 1000.0);
        students.put("Doãn Ngọc Duy", 6000.0);
        students.put("Nguyễn Tiến Minh", 36000.0);
        return new AccountManagement(students);
    }
}
