package com.chunjae.tqgpt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.GetMapping;

@EnableJpaAuditing
@EnableScheduling
@SpringBootApplication
public class TqgptApplication {
    public static void main(String[] args) {
        SpringApplication.run(TqgptApplication.class, args);
    }
}
