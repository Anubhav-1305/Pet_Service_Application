package com.example.critter.DTO;

import com.example.critter.Entity.EmployeeSkill;

import java.time.LocalDate;
import java.util.Set;

public class EmployeeRequestDTO {
    private Set<EmployeeSkill> skills;
    private LocalDate date;

    public Set<EmployeeSkill> getSkills() {
        return skills;
    }

    public void setSkills(Set<EmployeeSkill> skills) {
        this.skills = skills;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
