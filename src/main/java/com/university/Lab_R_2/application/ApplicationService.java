package com.university.Lab_R_2.application;

import com.university.Lab_R_2.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ApplicationService {

    Department getRecordDepartments(int id);
    Department getDepartmentByName(String name);
    void addRecordDepartment(Department department);
    void editDepartment(Department department);
    void deleteRecordDepartments(Department department);
    List<Department> getRecordsDepartments();

    Employee getRecordEmployees(int id);
    Employee getEmployeeByFIO(String FIO);
    void addRecordEmployee(Employee employee);
    void editEmployee(Employee employee);
    void deleteRecordEmployees(Employee employee);
    List<Employee> getRecordsEmployees();

    Organisation getRecordOrganisations(int id);
    Organisation getOrganisationByName(String name);
    void addRecordOrganisation(Organisation organisation);
    void editOrganisation(Organisation organisation);
    void deleteRecordOrganisations(Organisation organisation);
    List<Organisation> getRecordsOrganisations();
}
