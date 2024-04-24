package com.university.Lab_R_2.domain;

import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

import java.util.List;

@Repository
public class DepartmentRepositoryImpl {

    @Autowired
    private DepartmentRepository departmentRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Department getEntity(Long id) {
        return departmentRepository.findById(id).orElse(null);
    }

    @Transactional
    public Department getDepartmentByName(String name) {
        return departmentRepository.getDepartmentByName(name);
    }

    @Transactional
    public void addDepartment(Department department) {
        departmentRepository.save(department);
    }

    @Transactional
    public void editDepartment(Department department) {
        departmentRepository.save(department);
    }

    @Transactional
    public void removeDepartment(Department department) {
        departmentRepository.delete(department);
    }

    @Transactional
    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }
}
