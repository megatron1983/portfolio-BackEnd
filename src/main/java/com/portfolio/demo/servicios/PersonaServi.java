package com.portfolio.demo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.portfolio.demo.model.Persona;
import com.portfolio.demo.repository.RepoPersona;

public class PersonaServi implements InterfacePersona{
   @Autowired
    private RepoPersona baseRepo;

    @Override
    public List<Persona> listarTodo() {
        return baseRepo.findAll();
    }

    @Override
    public void actualizar( String titulo, String imagen, String password, String usuario) {
        Persona persona = new Persona();
        baseRepo.save(persona);
    }

    @Override
    public void modificar(int id, String titulo, String imagen, String password, String usuario) {
        Persona persona = new Persona( id,  titulo,  imagen,  password,  usuario);
        baseRepo.save(persona);
    }

    @Override
    public Persona buscar(int id) {
        return baseRepo.findById(id);
    }

    @Override
    public void eliminar(int id) {
        baseRepo.deleteById(id);
    }  
   
}
