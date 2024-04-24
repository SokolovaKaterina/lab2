package com.university.Lab_R_2.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
//    @Id
//    @GeneratedValue
//    int id = 0;
//    private static int instances = 0;
//    String FIO = "";
//    String address = "";
//    String department = "";
//    String dateBirth = "";
//    String post = "";
//    //private Organisation branch;
//
//    public Employee() {}
//    public Employee(String fio, String address, String department, String dateBirth, String post) {
//        this.id = instances;
//        this.FIO = fio;
//        this.address = address;
//        this.department = department;
//        this.dateBirth = dateBirth;
//        this.post = post;
//        //this.branch = branch;
//        instances++;
//    }
//    public String getAddress() {
//        return address;
//    }
//    public void setAddress(String address) {
//        this.address = address;
//    }
//    public String getDateBirth() {
//        return dateBirth;
//    }
//    public void setDateBirth(String dateBirth) {
//        this.dateBirth = dateBirth;
//    }
//    public String getDepartment() {
//        return department;
//    }
//    public void setDepartment(String department) {
//        this.department = department;
//    }
//    public String getFIO() {
//        return FIO;
//    }
//    public void setFIO(String FIO) {
//        this.FIO = FIO;
//    }
//    public int getId() {
//        return id;
//    }
//    public void setId(int id) {
//        this.id = id;
//    }
//    public String getPost() {
//        return post;
//    }
//    public void setPost(String post) {
//        this.post = post;
//    }
//    //public void setBranch(Organisation branch) { this.branch = branch; }
//
//    public void updateRecordEmployee(Employee updatedEntity) {
//        this.FIO = updatedEntity.FIO;
//        this.address = updatedEntity.address;
//        this.post = updatedEntity.post;
//        this.dateBirth = updatedEntity.dateBirth;
//        this.department = updatedEntity.department;
//    }
//
//    @Override
//    public String toString() {
//        return "\nId: " + this.id +
//                ", FIO: " + this.FIO +
//                ", Address: " + this.address +
//                ", Post: " + this.post +
//                ", DateBirth: " + this.dateBirth +
//                ", Department: " + this.department + ";";
//    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String address;
    @ManyToOne
    private Department department;
    private String dateOfBirth;
    private String position;

    public Employee() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Employee(Long id, String fullName, String address, Department department, String dateOfBirth, String position) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.department = department;
        this.dateOfBirth = dateOfBirth;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", department=" + department +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    public void updateRecordEmployee(Employee updatedEntity) {
    }

}
