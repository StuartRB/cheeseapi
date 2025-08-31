package com.stuart.cheese_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CheeseController {

    @GetMapping("api/cheese")
    public Object getCheeses(){
        return List.of("Cheddar", "Wendleydale");
    }
}
