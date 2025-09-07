package com.stuart.cheese_api.entity;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends CosmosRepository<UserEntity, String> {
    List<UserEntity> findByEmail(String email);
}


