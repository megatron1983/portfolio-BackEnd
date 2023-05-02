package com.portfolio.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.demo.model.Educacion;

public interface RepoEducacion extends JpaRepository <Educacion, Integer>{
   
}
