package com.stuart.cheese_api.model;

import com.stuart.cheese_api.entity.Pet;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String email;
    private String name;
    private int age;
    List<Pet> pets;
}
