package com.example.demo.Student;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    @GetMapping
    public List<Student> getStudent(){
        return List.of(
                new Student(
                        1L,
                        "Sanaa",
                        "Sanaabhl@gmail.com",
                        LocalDate.of(1999,12,29),
                        21
                )
        );
    }
}
