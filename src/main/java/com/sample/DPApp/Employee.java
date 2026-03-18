package com.sample.DPApp;

import jakarta.persistence.*;

@Entity
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @OneToOne
    @JoinColumn(name = "lap_id")
    private Laptop laptop; // fk
}