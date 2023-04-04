package com.repetition_fixed.repetition_fixed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RepetitionFixedApplication {

    public static void main(String[] args) {
        SpringApplication.run(RepetitionFixedApplication.class, args);

       ForumUser user = new ForumUser("Marcin", "Chudy", 'M', 23, "Chujdy", 0, true);
       user.getName();
       user.getName2();
    }

}
