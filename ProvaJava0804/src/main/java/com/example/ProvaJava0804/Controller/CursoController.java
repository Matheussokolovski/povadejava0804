package com.example.ProvaJava0804.Controller;

import com.example.ProvaJava0804.Model.Curso;
import com.example.ProvaJava0804.Repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class CursoController {
    @Autowired
    private Curso cursoRepository;

    /// criar curso
    @PostMapping
    public Curso createCurso(@RequestBody Curso curso) {;
        return curso;
    }
/// Delete
    @DeleteMapping("/curso/{id}")
    public void deleteCurso(@PathVariable Long id) {



    }
}
