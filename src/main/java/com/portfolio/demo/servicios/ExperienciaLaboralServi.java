package com.portfolio.demo.servicios;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.portfolio.demo.model.ExperienciaLaboral;
import com.portfolio.demo.repository.RepoExperienciaLaboral;

public class ExperienciaLaboralServi implements InterfaceExperienciaLaboral {
   @Autowired
    private RepoExperienciaLaboral baseRepo;

    @Override
    public List<ExperienciaLaboral> listarTodo() {
        return baseRepo.findAll();
    }

    @Override
    public void actualizar(String logo,Date fecha_inicio,  Date fecha_final, String nombre_empresa, String cargo, String descripcion) {
        ExperienciaLaboral experiencia = new         ExperienciaLaboral();

        baseRepo.save(experiencia);
    }

    @Override
    public void modificar(int id,String logo,Date fecha_inicio,  Date fecha_final, String nombre_empresa, String cargo, String descripcion) {
        ExperienciaLaboral experiencia = new ExperienciaLaboral(id, logo, fecha_inicio,   fecha_final,  nombre_empresa,  cargo,  descripcion);
        baseRepo.save(experiencia);
    }

    @Override
    public ExperienciaLaboral buscar(int id) {
        return baseRepo.findById(id);
    }

    @Override
    public void eliminar(int id) {
        baseRepo.deleteById(id);
    }
}
