package com.stuart.cheese_api.entity;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Container(containerName = "users")
@Data
@Builder
public class UserEntity {

    @Id
    private String id;

    @PartitionKey
    private String email;

    private String name;
    private int age;

    // getters and setters
}


