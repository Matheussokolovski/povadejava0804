package com.example.ProvaJava0804.Service;

import com.example.ProvaJava0804.Model.Diciplina;
import com.example.ProvaJava0804.Repository.DiciplinaRepository;
import org.springframework.stereotype.Service;

@Service
public class DiciplinaService {

    private final DiciplinaRepository disciplinaRepository;

    public DiciplinaService(DiciplinaRepository disciplinaRepository) {
        this.disciplinaRepository = disciplinaRepository;
    }


    public Diciplina salvar(Diciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }


    public void deletar(Long id) {
        disciplinaRepository.deleteById(id);
    }
}
