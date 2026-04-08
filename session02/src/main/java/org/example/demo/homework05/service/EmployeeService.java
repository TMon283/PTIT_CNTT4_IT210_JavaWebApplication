package org.example.demo.homework05.service;

import org.example.demo.homework05.model.Employee;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class EmployeeService {
    private static final List<Employee> employees = new ArrayList<>();

    static {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            employees.add(new Employee("NV001","Nguyễn Thị Lan","Kế toán",15000000,sdf.parse("2020-03-01"),"Đang làm"));
            employees.add(new Employee("NV002","Trần Văn Hùng","Kỹ thuật",25000000,sdf.parse("2019-07-15"),"Đang làm"));
            employees.add(new Employee("NV003","Lê Minh Đức","Kinh doanh",18500000,sdf.parse("2021-11-20"),"Nghỉ phép"));
            employees.add(new Employee("NV004","Phạm Thu Hương","Kỹ thuật",22000000,sdf.parse("2022-01-05"),"Đang làm"));
            employees.add(new Employee("NV005","Hoàng Văn Nam","Kế toán",12000000,sdf.parse("2023-06-10"),"Thử việc"));
        } catch(Exception e) { e.printStackTrace(); }
    }

    public List<Employee> getAll() {
        return employees;
    }

    public Employee findByCode(String code) {
        return employees.stream()
                .filter(e -> e.getCode().equals(code))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Nhân viên ["+code+"] không tồn tại trong hệ thống"));
    }

    public double totalSalaryByDepartment(String dept) {
        return employees.stream()
                .filter(e -> e.getDepartment().equals(dept))
                .mapToDouble(Employee::getSalary)
                .sum();
    }
}

