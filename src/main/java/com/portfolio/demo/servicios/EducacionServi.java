package com.portfolio.demo.servicios;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.demo.model.Educacion;
import com.portfolio.demo.repository.RepoEducacion;

@Service
public class EducacionServi implements InterfaceEducacion {
    @Autowired
    private RepoEducacion baseRepo;

    @Override
    public List<Educacion> listarTodo() {
        return baseRepo.findAll();
    }

    @Override
    public void actualizar(Educacion educacion) {
        
        baseRepo.save(educacion);
    }

    

    @Override
    public Educacion buscar(int id) {
        return baseRepo.findById(id).orElse(null);
    }

    @Override
    public void eliminar(int id) {
        baseRepo.deleteById(id);
    }
}