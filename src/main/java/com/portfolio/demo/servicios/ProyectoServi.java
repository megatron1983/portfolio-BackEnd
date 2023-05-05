package com.portfolio.demo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.portfolio.demo.model.Proyecto;
import com.portfolio.demo.repository.RepoProyecto;

public class ProyectoServi implements InterfaceProyecto{
    @Autowired
    private RepoProyecto baseRepo;

    @Override
    public List<Proyecto> listarTodo() {
        return baseRepo.findAll();
    }

    @Override
    public void actualizar( String imagen, String titulo, String descripcion, String link) {
       Proyecto proyecto = new Proyecto();
        baseRepo.save(proyecto);
    }

    @Override
    public void modificar(int id, String imagen, String titulo, String descripcion, String link) {
       Proyecto proyecto = new Proyecto( id,  imagen,  titulo,  descripcion,  link);

        baseRepo.save(proyecto);

    }

    @Override
    public Proyecto buscar(int id) {
        return baseRepo.findById(id);
    }

    @Override
    public void eliminar(int id) {
        baseRepo.deleteById(id);
    }
}
