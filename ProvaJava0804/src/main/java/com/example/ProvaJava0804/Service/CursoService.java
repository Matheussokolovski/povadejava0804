package com.example.ProvaJava0804.Service;

import com.example.ProvaJava0804.Model.Curso;
import com.example.ProvaJava0804.Repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CursoService {

    private final CursoService CursoService;

    public CursoService(CursoService cursoService, CursoService cursoService1) {
        CursoService = cursoService1;

    }

    //cria
    //public Curso save(Curso curso) {
       // Curso save = CursoRepository.save(curso);
       // return save;

   // }


}
