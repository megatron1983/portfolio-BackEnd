package com.portfolio.demo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.demo.model.Proyecto;
import com.portfolio.demo.repository.RepoProyecto;
@Service
public class ProyectoServi implements InterfaceProyecto{
    @Autowired
    private RepoProyecto baseRepo;

    @Override
    public List<Proyecto> listarTodo() {
        return baseRepo.findAll();
    }

    @Override
    public void actualizar( Proyecto proyecto) {
       
        baseRepo.save(proyecto);
    }

    

    @Override
    public Proyecto buscar(int id) {
        return baseRepo.findById(id).orElse(null);
    }

    @Override
    public void eliminar(int id) {
        baseRepo.deleteById(id);
    }
}
