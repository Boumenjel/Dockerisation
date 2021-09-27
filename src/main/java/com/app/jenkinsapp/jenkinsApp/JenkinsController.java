package com.app.jenkinsapp.jenkinsApp;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class JenkinsController {

    @GetMapping("/hello")
    public String getHello(Model model) {
        model.addAttribute("hello","Hello Spring Boot User");
        return "hello Wael Boumenjel";
    }
}
