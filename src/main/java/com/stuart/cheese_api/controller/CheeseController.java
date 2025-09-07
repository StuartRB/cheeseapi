package com.stuart.cheese_api.controller;

import com.stuart.cheese_api.entity.UserEntity;
import com.stuart.cheese_api.model.Person;
import com.stuart.cheese_api.service.CheeseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CheeseController {

    private final CheeseService service;

    @PostMapping("api/users")
    public UserEntity createUser(@RequestBody Person person) {
        return service.createUser(person);
    }

    @GetMapping("api/users")
    public List<UserEntity> getUsers() {
        return service.getAllUsers();
    }

    @GetMapping("api/users/{email}")
    public List<UserEntity> getUserByEmail(@PathVariable String email) {
        return service.findByEmail(email);
    }
}
