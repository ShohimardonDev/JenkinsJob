package org.example.springbootjenkinsjobs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping
    public String main() {
        return "Working ...";
    }
        @GetMapping("/test_2")
    public String test_2() {
        return "Working (2)...";
    }

}
