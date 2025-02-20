package com.example.controller_swagger;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class NameController {

    @GetMapping("/name")
    public String getName(@RequestParam String name) {
        return name;
    }

    @PostMapping("/name/reverse")
    public String reverseName(@RequestBody String name) {
        StringBuilder reversedName = new StringBuilder(name);
        return reversedName.reverse().toString();
    }
}
