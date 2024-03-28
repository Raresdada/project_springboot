package com.example.myspringapi.model;

import jakarta.persistence.*;
import jdk.jshell.Snippet;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String firstName;
    private String lastName;
    private int age;
    private String emailAddress;
    private String address;
    private String role;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patron_id")
    private Patron patron;

    public Employee(Long id, String firstName, String lastName, int age, String emailAddress, String address, String role, Patron patron) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.emailAddress = emailAddress;
        this.address = address;
        this.role = role;
        this.patron = patron;
        this.id = id;
    }

    public Employee() {

    }

    public static Snippet builder() {
        return null;
    }
}
