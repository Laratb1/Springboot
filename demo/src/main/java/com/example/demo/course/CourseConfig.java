package com.example.demo.course;

import org.springframework.boot.CommanLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CourseConfig {

    @Bean
    CommandLineRunner CommandLineRunner(CourseRepository repository){
        return args -> {
                Course java = new Course(
                    "Java",
                    123
                );

                Course c = new Course(
                    "C",
                    456
                );

                repository.saveAll(
                    List.of(java, c)
                );
        };
    }
}