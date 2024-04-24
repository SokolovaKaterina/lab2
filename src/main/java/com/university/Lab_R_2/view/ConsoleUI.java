package com.university.Lab_R_2.view;

import com.university.Lab_R_2.application.ApplicationService;
import com.university.Lab_R_2.domain.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Scanner;

@Component
public class ConsoleUI {
    private final Scanner scanner;
    private final ApplicationService applicationService;

    @Autowired
    public ConsoleUI(ApplicationService applicationService) {
        this.applicationService = applicationService;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to Employee Management System!");

        while (true) {
            System.out.println("1. Add Department\n2. Add Employee\n3. Add Organisation\n4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addDepartment();
                    break;
                case 2:
                    addEmployee();
                    break;
                case 3:
                    addOrganisation();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }

    private void addDepartment() {
        System.out.println("Enter department name:");
        String name = scanner.nextLine();
        System.out.println("Enter number of employees:");
        int employeeCount = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.println("Enter rooms (comma-separated):");
        String[] roomsArray = scanner.nextLine().split(",");
        Department department = new Department();
        department.setName(name);
        department.setEmployeeCount(employeeCount);
        department.setRooms(Arrays.asList(roomsArray));
        applicationService.addRecordDepartment(department);
        System.out.println("Department added successfully!");
    }

    private void addEmployee() {
        // Similar logic for adding an employee
    }

    private void addOrganisation() {
        // Similar logic for adding an organisation
    }
}
