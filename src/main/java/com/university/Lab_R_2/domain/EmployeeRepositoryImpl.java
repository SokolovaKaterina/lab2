package com.university.Lab_R_2.domain;

import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

import java.util.List;

@Repository
public class EmployeeRepositoryImpl {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Employee getEntity(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Transactional
    public Employee getEmployeeByFIO(String FIO) {
        return employeeRepository.getEmployeeByFIO(FIO);
    }

    @Transactional
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Transactional
    public void editEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Transactional
    public void removeEmployee(Employee employee) {
        employeeRepository.delete(employee);
    }

    @Transactional
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }
}
