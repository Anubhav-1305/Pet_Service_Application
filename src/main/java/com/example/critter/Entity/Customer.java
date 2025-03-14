package com.example.critter.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String phoneNumber;
    private String notes;
    private String name;

    @OneToMany(targetEntity = Pet.class)
    private List<Pet> pets;

    public void insertPet(Pet pet) {
        pets.add(pet);
    }
}