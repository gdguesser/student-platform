package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student gabriel = new Student(
                    "Gabriel",
                    "gdguesser@gmail.com",
                    LocalDate.of(1999, Month.MARCH, 24),
                    22
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(1998, Month.JANUARY, 24),
                    23
            );

            repository.saveAll(
                    List.of(gabriel, alex)
            );
        };
    }
}
