package com.portfolio.demo.servicios;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.demo.model.ExperienciaLaboral;
import com.portfolio.demo.repository.RepoExperienciaLaboral;

@Service
public class ExperienciaLaboralServi implements InterfaceExperienciaLaboral {
   @Autowired
    private RepoExperienciaLaboral baseRepo;

    @Override
    public List<ExperienciaLaboral> listarTodo() {
        return baseRepo.findAll();
    }

    @Override
    public void actualizar(ExperienciaLaboral laboral) {
        
        baseRepo.save(laboral);
    }

    @Override
    public void modificar(int id,String logo,Date fecha_inicio,  Date fecha_final, String nombre_empresa, String cargo, String descripcion) {
        ExperienciaLaboral experiencia = new ExperienciaLaboral(id, logo, fecha_inicio,   fecha_final,  nombre_empresa,  cargo,  descripcion);
        baseRepo.save(experiencia);
    }

    @Override
    public ExperienciaLaboral buscar(int id) {
        return baseRepo.findById(id).orElse(null);
    }

    @Override
    public void eliminar(int id) {
        baseRepo.deleteById(id);
    }
}
