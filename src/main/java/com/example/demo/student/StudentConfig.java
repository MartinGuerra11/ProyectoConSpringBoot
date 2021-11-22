package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariana = new Student(
                    "Mariana",
                    "mariana.rodriguez@gmail.com",
                    LocalDate.of(1998, Month.MAY, 27)
            );
            Student alex = new Student(
                    "Martín",
                    "martin.paz@gmail.com",
                    LocalDate.of(1997, Month.JUNE, 11)
            );

            repository.saveAll(
                    Arrays.asList(mariana,alex)
            );
        };
    }
}
