package com.portfolio.demo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.portfolio.demo.model.Contacto;
import com.portfolio.demo.repository.RepoContacto;

public class ContactoServi implements InterfaceContacto{
   @Autowired
    private RepoContacto baseRepo;

    @Override
    public List<Contacto> listarTodo() {
        return baseRepo.findAll();
    }

    @Override
    public void actualizar( String telefono, String direccion, String email) {
        Contacto contacto = new Contacto();
        baseRepo.save(contacto);
    }

    @Override
    public void modificar(int id, String telefono, String direccion, String email) {
        Contacto contacto = new Contacto(id,telefono, direccion, email);
        baseRepo.save(contacto);
    }

    @Override
    public Contacto buscar(int id) {
        return baseRepo.findById(id);
    }

    @Override
    public void eliminar(int id) {
        baseRepo.deleteById(id);
    }
}
