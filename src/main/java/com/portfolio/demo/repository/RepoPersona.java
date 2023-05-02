package com.portfolio.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.demo.model.Persona;
public interface RepoPersona extends JpaRepository <Persona, Integer>{
   
}
