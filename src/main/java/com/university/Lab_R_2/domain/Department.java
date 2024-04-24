package com.university.Lab_R_2.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "department")
public class Department {
//    @Id
//    @GeneratedValue
//    int id;
//    private static int instances = 0;
//    String name = "";
//    int quantity = 0;
//    List<String> nameOfRooms = new ArrayList<>();
//    Employee head;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int employeeCount;
    @ElementCollection
    private List<String> rooms;
    @OneToOne
    private Employee head;

    public Department() {}

    public Department(Long id, String name, int employeeCount, List<String> rooms, Employee head) {
        this.id = id;
        this.name = name;
        this.employeeCount = employeeCount;
        this.rooms = rooms;
        this.head = head;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public List<String> getRooms() {
        return rooms;
    }

    public void setRooms(List<String> rooms) {
        this.rooms = rooms;
    }

    public Employee getHead() {
        return head;
    }

    public void setHead(Employee head) {
        this.head = head;
    }

//    public void updateRecordDepartment(Department department) {
//        this.name = department.name;
//        this.quantity = department.quantity;
//        this.nameOfRooms = department.nameOfRooms;
//    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employeeCount=" + employeeCount +
                ", rooms=" + rooms +
                ", head=" + head +
                '}';
    }

    public void updateRecordDepartment(Department updatedEntity) {
        this.name = updatedEntity.name;
        this.employeeCount = updatedEntity.employeeCount;
        this.rooms = updatedEntity.rooms;

    }
}
