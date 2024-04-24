package com.university.Lab_R_2.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "organisation")
public class Organisation {
//    @Id
//    @GeneratedValue
//    String name = "";
//    String address = "";
//    Employee head;
//
//    public Organisation() {}
//
//    public Organisation(String name, String address, Employee head) {
//        this.name = name;
//        this.address = address;
//        this.head = head;
//    }
//
//    public String getName() { return name; }
//    public void setName(String name) { this.name = name; }
//    public String getAddress() { return address; }
//    public void setAddress(String address) { this.address = address; }
//    public void setHead(Employee head) { this.head = head; }
//    public void updateRecordOrganisation(Organisation organisation) {
//        this.name = organisation.name;
//        this.address = organisation.address;
//        this.head = organisation.head;
//    }
//
//    @Override
//    public String toString() {
//        return "\nName: '" + this.name +
//                ", address='" + this.address +
//                ", head=" + this.head + ";";
//    }
//
//    public Employee getHead() {
//        return null;
//    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    @OneToOne
    private Employee head;

    public Organisation(Long id, String name, String address, Employee head) {
        this.id = id;
        this.name = name;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee getHead() {
        return head;
    }

    public void setHead(Employee head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "Organisation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", head=" + head +
                '}';
    }
}