package com.sample.DPApp;

import jakarta.persistence.*;

@Entity
public class Laptop
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer  RAM;

    @OneToOne(mappedBy = "laptop")
    private Employee employee;
}
