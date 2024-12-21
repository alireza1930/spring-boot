package com.alibou.springdemo.student;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents() {
        return List.of(
                new Student(
                        "Ali reza",
                        "tajik",
                        LocalDate.now(),
                        "ali@test.com",
                        25),
                new Student()

        );
    }

}
