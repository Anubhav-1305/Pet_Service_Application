package com.example.critter.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
public class Pet implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private PetType type;
    private String name;

    @ManyToOne(targetEntity = Customer.class, optional = false)
    private Customer customer;
    private LocalDate birthDate;
    private String notes;
}