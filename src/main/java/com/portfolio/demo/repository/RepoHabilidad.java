package com.portfolio.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.demo.model.Habilidad;
public interface RepoHabilidad extends JpaRepository <Habilidad, Integer> {
   
   
}
