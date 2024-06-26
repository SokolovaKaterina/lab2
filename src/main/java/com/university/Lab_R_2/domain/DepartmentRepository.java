package com.university.Lab_R_2.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department getDepartmentByName(String name);
}
