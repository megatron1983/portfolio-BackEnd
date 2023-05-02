package com.portfolio.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.demo.model.SobreMi;

public interface RepoSobreMi extends JpaRepository <SobreMi, Integer> {
   
}
