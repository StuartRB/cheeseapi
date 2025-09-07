package com.stuart.cheese_api.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Pet {

    private String id;
    private String name;
    private int age;
    private String type;
}


