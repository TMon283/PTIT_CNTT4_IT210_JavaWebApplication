package org.example.session04.demo.service;

import org.example.session04.demo.dao.StudentDAO;
import org.example.session04.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    // Tiêm sự phụ thuộc
    @Autowired
    private StudentDAO studentDAO;

    public List<Student> getAllStudents() {
        List<Student> students = studentDAO.findAll();
        return students;
    }
}
