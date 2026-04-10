package com.example.ProvaJava0804.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Entity
@Getter
@Setter
public class Diciplina {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 75, nullable = false)
    private String Nome;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;
}