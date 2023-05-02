package com.portfolio.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.demo.model.ExperienciaLaboral;

public interface RepoLaboral extends JpaRepository <ExperienciaLaboral, Integer> {
   
}
