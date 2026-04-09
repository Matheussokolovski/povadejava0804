package com.example.ProvaJava0804.Repository;

import com.example.ProvaJava0804.Model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface CursoRepository  extends JpaRepository<Curso, Long> {



}
