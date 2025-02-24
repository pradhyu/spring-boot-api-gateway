package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ServiceController {

    @GetMapping("/ice1")
    public String handleService1() {
        return "Response from Service 1";
    }

    @GetMapping("/ice2")
    public String handleService2() {
        return "Response from Service 2";
    }
} 