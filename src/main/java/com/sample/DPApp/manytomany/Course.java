package com.sample.DPApp.manytomany;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Course
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;
    private String courseName;

    @ManyToMany(mappedBy = "courses")

    private List<Student> students;
}
