package com.portfolio.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.demo.model.Contacto;
public interface RepoContacto extends JpaRepository <Contacto, Integer> {
   
}
