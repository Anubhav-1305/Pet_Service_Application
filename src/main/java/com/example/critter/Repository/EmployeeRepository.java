package com.example.critter.Repository;

import java.time.DayOfWeek;
import java.util.List;

import com.example.critter.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> getAllByAvailDay(DayOfWeek dayOfWeek);

}