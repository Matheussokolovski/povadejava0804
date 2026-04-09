package com.example.ProvaJava0804.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Entity
@Getter
@Setter
@Table(name = "curso_id")
public class Curso {
    @Id
 @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    private String Nome;

    private int CargaHoraria ;

    private LocalDate Data;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "curso_id", referencedColumnName = "") // Foreign key in Employee table
    private Set<Employee> employees; // Um curso pode ter várias diciplinas



}
