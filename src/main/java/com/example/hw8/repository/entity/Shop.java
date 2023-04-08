package com.example.hw8.repository.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "UserTable")
@Data
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String city;
    private String street;
    private String shopName;
    private int employeesCount;
    private boolean hasWebsite;
}