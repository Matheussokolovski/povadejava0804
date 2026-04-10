package com.example.ProvaJava0804.Controller;

import com.example.ProvaJava0804.Model.Diciplina;
import com.example.ProvaJava0804.Repository.DiciplinaRepository;

import org.springframework.web.bind.annotation.*;
public class  DiciplinaController {

    private final DiciplinaRepository disciplinaRepository;

    public DiciplinaController(DiciplinaRepository diciplinaRepository) {
        this.disciplinaRepository = diciplinaRepository;
    }


    @PostMapping
    public Diciplina criar(@RequestBody Diciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }


    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        disciplinaRepository.deleteById(id);
    }
}



