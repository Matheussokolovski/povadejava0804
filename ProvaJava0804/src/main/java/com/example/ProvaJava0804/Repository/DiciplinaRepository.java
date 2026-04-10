package com.example.ProvaJava0804.Repository;

import com.example.ProvaJava0804.Model.Diciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiciplinaRepository extends JpaRepository  <Diciplina, Long>{

}
