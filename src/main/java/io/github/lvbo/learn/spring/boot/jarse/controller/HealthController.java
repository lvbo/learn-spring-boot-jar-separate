package io.github.lvbo.learn.spring.boot.jarse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping
    public String healthTest() {
        return "success";
    }

}
