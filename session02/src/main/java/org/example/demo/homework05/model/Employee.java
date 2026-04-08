package org.example.demo.homework05.model;

import java.util.Date;

public class Employee {
    private String code;
    private String name;
    private String department;
    private double salary;
    private Date startDate;
    private String status;

    public Employee() {
    }

    public Employee(String code, String name, String department, double salary, Date startDate, String status) {
        this.code = code;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.startDate = startDate;
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
