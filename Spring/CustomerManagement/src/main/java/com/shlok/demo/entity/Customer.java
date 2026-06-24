package com.shlok.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // Tells Spring Boot and Hibernate that this Java class represents a database table.
@Table(name="Customer")
@Data // Lombok annotation which generates all boilerplate code (getters, setters, toString, hashcode(), .equals() at compile time
@NoArgsConstructor   // default constructor
@AllArgsConstructor  // Parameterized constructor 
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // everytime new id generated 
    private Integer customerId; // Primary key, auto-incremented

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(nullable = false, length = 15)
    private String phone;

    // TEXT in SQL usually maps to a standard String in Java. We use length to hint to Hibernate.
    @Column(nullable = false, length = 500) 
    private String address;

    // Defines a custom enumeration type, restricting the values this variable can hold.
    public enum KycStatus {  // holds const value
        PENDING, VERIFIED
    }

    // Tells hibernate to store enum text (e.g., "PENDING") instead of a numerical index
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private KycStatus kycStatus;

}