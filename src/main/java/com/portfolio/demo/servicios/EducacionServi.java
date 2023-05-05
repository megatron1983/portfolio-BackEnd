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
    public void actualizar(Date fecha_inicio, Date fecha_final, String nombre_empresa, String titulo,
            String descripcion) {
        Educacion educacion = new Educacion();
        baseRepo.save(educacion);
    }

    @Override
    public void modificar(int id, Date fecha_inicio, Date fecha_final, String nombre_empresa, String titulo,
            String descripcion) {
        Educacion educacion = new Educacion(id, fecha_inicio, fecha_final, nombre_empresa, titulo, descripcion);
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