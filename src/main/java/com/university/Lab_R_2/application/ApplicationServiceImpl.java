package com.university.Lab_R_2.application;

import com.university.Lab_R_2.domain.Department;
import com.university.Lab_R_2.domain.DepartmentRepository;
import com.university.Lab_R_2.domain.Employee;
import com.university.Lab_R_2.domain.EmployeeRepository;
import com.university.Lab_R_2.domain.Organisation;
import com.university.Lab_R_2.domain.OrganisationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;
    private final OrganisationRepository organisationRepository;

    @Autowired
    public ApplicationServiceImpl(DepartmentRepository departmentRepository,
                                  EmployeeRepository employeeRepository,
                                  OrganisationRepository organisationRepository) {
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
        this.organisationRepository = organisationRepository;
    }

    @Override
    public Department getRecordDepartments(int id) {
        return departmentRepository.findById((long) id).orElse(null);
    }

    @Override
    public Department getDepartmentByName(String name) {
        return departmentRepository.getDepartmentByName(name);
    }

    @Override
    public void addRecordDepartment(Department department) {
        departmentRepository.save(department);
    }

    @Override
    public void editDepartment(Department department) {
        departmentRepository.save(department);
    }

    @Override
    public void deleteRecordDepartments(Department department) {
        departmentRepository.delete(department);
    }

    @Override
    public List<Department> getRecordsDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Employee getRecordEmployees(int id) {
        return employeeRepository.findById((long) id).orElse(null);
    }

    @Override
    public Employee getEmployeeByFIO(String FIO) {
        return employeeRepository.getEmployeeByFIO(FIO);
    }

    @Override
    public void editEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void addRecordEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteRecordEmployees(Employee employee) {
        employeeRepository.delete(employee);
    }

    @Override
    public List<Employee> getRecordsEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Organisation getRecordOrganisations(int id) {
        return organisationRepository.findById((long) id).orElse(null);
    }

    @Override
    public Organisation getOrganisationByName(String name) {
        return organisationRepository.getOrganisationByName(name);
    }

    @Override
    public void addRecordOrganisation(Organisation organisation) {
        organisationRepository.save(organisation);
    }

    @Override
    public void editOrganisation(Organisation organisation) {
        organisationRepository.save(organisation);
    }

    @Override
    public void deleteRecordOrganisations(Organisation organisation) {
        organisationRepository.delete(organisation);
    }

    @Override
    public List<Organisation> getRecordsOrganisations() {
        return organisationRepository.findAll();
    }
}
