package com.university.Lab_R_2.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee getEmployeeByFIO(String FIO);
}
