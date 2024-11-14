package com.example.critter.Repository;

import java.util.List;

import com.example.critter.Entity.Employee;
import com.example.critter.Entity.Pet;
import com.example.critter.Entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    List<Schedule> getAllByPetsContains(Pet pet);
    List<Schedule> getAllByEmployeesContains(Employee employee);
    List<Schedule> getAllByPetsIn(List<Pet> pets);
}