package com.greg.demo_cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {


    @GetMapping("/hello")
    public String helloGreg() {
        return "Hello Paris";
    }
}
