package org.example.session04.demo.dao;

import org.example.session04.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class StudentDAO {
    private List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(1, "Nguyễn Văn A", 18, true),
                    new Student(2, "Trần Văn B", 19, true),
                    new Student(3, "Lê Thị C", 20, false)
            )
    );

    public List<Student> findAll() {
        return students;
    }

    public List<Student> search(String keyword) {
        return students.stream().filter(s -> s.getFullName().toLowerCase().contains(keyword.toLowerCase())).toList();
    }
}
