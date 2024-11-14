package com.example.critter.Service;

import java.util.List;

import javax.transaction.Transactional;

import com.example.critter.Entity.Customer;
import com.example.critter.Entity.Pet;
import com.example.critter.Repository.CustomerRepository;
import com.example.critter.Repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PetService {

    @Autowired
    private PetRepository petRepository;

    @Autowired
    private CustomerRepository customerRepository;

    public Pet savePet(Pet pet, Long ownerId) {
        Customer customer = customerRepository.getOne(ownerId);
        pet.setCustomer(customer);
        pet = petRepository.save(pet);
        customer.insertPet(pet);
        customerRepository.save(customer);
        return pet;
    }

    public Pet getPetById(Long petId){
        return petRepository.getOne(petId);
    }

    public List<Pet> getPetsByCustomerId(Long customerId){
        return petRepository.getAllByCustomerId(customerId);
    }

    public List<Pet> getAllPets() {
        return petRepository.findAll();
    }

}