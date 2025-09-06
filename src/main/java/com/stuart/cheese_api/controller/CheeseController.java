package com.stuart.cheese_api.controller;

import com.stuart.cheese_api.entity.UserEntity;
import com.stuart.cheese_api.entity.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.stream.StreamSupport;

@RestController
@AllArgsConstructor
public class CheeseController {

    private final UserRepository userRepository;

    @GetMapping("api/cheese")
    public Object getCheeses(){
        return List.of("Cheddar", "Wendleydale", "brie");
    }

    @PostMapping("api/users")
    public UserEntity createUser(){
        var user = UserEntity.builder().id("ianso") .age(34).name("Stu").build();
        userRepository.save(user);
        return user;
    }

    @GetMapping("api/users")
    public List<UserEntity> getUsers(){
        return StreamSupport
                .stream(userRepository.findAll().spliterator(), false)
                .toList();
//        return Collections.emptyList();
    }
}
