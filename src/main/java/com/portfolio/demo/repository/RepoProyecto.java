package com.portfolio.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.demo.model.Proyecto;

public interface RepoProyecto extends JpaRepository <Proyecto, Integer>{
   
}
