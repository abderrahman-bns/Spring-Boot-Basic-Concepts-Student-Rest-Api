package com.example.demo.Student;

import org.apache.tomcat.jni.Local;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student sanaa = new Student(
                    "BAHLOULI Sanaa",
                    "Sanaabhl@gmail.com",
                    LocalDate.of(1999,12,29),
            );
            repository.saveAll(List.of(sanaa));
        };
    }
}
