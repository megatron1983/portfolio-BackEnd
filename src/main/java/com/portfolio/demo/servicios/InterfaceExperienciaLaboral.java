package com.portfolio.demo.servicios;

import java.util.Date;
import java.util.List;
import com.portfolio.demo.model.ExperienciaLaboral;

public interface InterfaceExperienciaLaboral {

   public List<ExperienciaLaboral> listarTodo();

   public void actualizar(ExperienciaLaboral laboral);

   

   public ExperienciaLaboral buscar(int id);

   public void eliminar(int id );
   
}
