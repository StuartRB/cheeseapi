package com.stuart.cheese_api.service;

import com.stuart.cheese_api.entity.Pet;
import com.stuart.cheese_api.entity.UserEntity;
import com.stuart.cheese_api.entity.UserRepository;
import com.stuart.cheese_api.model.Person;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.UUID;
import java.util.stream.StreamSupport;

@Service
@Slf4j
@AllArgsConstructor
public class CheeseService {

    private UserRepository userRepository;

    public UserEntity createUser(Person person){
        var user = UserEntity.builder()
                .id(UUID.randomUUID().toString())
                .age(person.getAge())
                .name(person.getName())
                .email(person.getEmail())
                .createdDate(Instant.now().toString())
                .pets(mapPets(person.getPets()))
                .build();
        userRepository.save(user);
        log.info("Added new user with id {}", user.getId());
        return user;
    }

    public List<UserEntity> getAllUsers(){
        return StreamSupport
                .stream(userRepository.findAll().spliterator(), false)
                .toList();
    }

    public List<UserEntity> findByEmail(String email){
        return userRepository.findByEmail(email);
    }

    private List<Pet> mapPets(List<Pet> pets) {
        return pets.stream().map(pet -> Pet.builder()
                .id(UUID.randomUUID().toString())
                .name(pet.getName())
                .age(pet.getAge())
                .type(pet.getType())
                .build()).toList();
    }
}
