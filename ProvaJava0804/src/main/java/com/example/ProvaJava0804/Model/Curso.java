package com.example.ProvaJava0804.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Getter
@Setter
@Table(name = "curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 75, nullable = false)
    private String nome;

    private int cargaHoraria
    private LocalDate dataInicio;

    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)
    private List<Diciplina> disciplinas = new ArrayList<>();

    public void addDisciplina(Diciplina d) {
        d.setCurso(this);
        this.disciplinas.add(d);
    }

    public void removeDisciplina(Diciplina d) {
        this.disciplinas.remove(d);
        d.setCurso(null);
    }
}
