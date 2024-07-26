package com.example.StudentsPostgresDemo.model;


import jakarta.persistence.*;
import lombok.*;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String faculty;
    private String className;
    private LocalDate datbith;
   private LocalTime times;
    public Student() {

    }



}

