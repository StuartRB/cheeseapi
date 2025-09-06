package com.stuart.cheese_api.entity;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CosmosRepository<UserEntity, String> {
    UserEntity findByEmail(String email);
}


