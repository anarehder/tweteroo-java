package com.twiteroo.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twiteroo.api.dto.UserDTO;

@RestController
@RequestMapping("/ola")
public class UserController {

    @GetMapping
    public String olaSpring() {
        return "Olá teste!!";
    }

    @PostMapping
    public void create(@RequestBody UserDTO req) {
        System.out.println("oi2");
    }
}
