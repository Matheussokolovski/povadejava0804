package com.example.ProvaJava0804.Service;

import com.example.ProvaJava0804.Model.Curso;
import com.example.ProvaJava0804.Repository.CursoRepository;
import org.springframework.stereotype.Service;


@Service
public class CursoService {

    private final CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }


    public Curso salvar(Curso curso) {
        return cursoRepository.save(curso);
    }



    public void deletar(Long id) {
        cursoRepository.deleteById(id);
    }
}
