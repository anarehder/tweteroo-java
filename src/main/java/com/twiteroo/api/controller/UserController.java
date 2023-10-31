package com.twiteroo.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twiteroo.api.dto.UserDTO;
import com.twiteroo.api.model.User;
import com.twiteroo.api.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public String olaSpring() {
        return "Olá teste!!";
    }

    @GetMapping
    public List<User> listAll(){
        return repository.findAll();
    }

    @PostMapping
    public void create(@RequestBody UserDTO req) {
        repository.save(new User(req));
    }
}
