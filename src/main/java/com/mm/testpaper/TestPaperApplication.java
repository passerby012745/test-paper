package com.mm.testpaper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TestPaperApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestPaperApplication.class, args);
    }


    @GetMapping(value = "/name")
    public String getName(){
        return "hello";
    }
}
