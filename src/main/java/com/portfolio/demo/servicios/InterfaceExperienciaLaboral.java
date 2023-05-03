package com.portfolio.demo.servicios;

import java.util.Date;
import java.util.List;
import com.portfolio.demo.model.ExperienciaLaboral;

public interface InterfaceExperienciaLaboral {

   public List<ExperienciaLaboral> listarTodo();

   public void actualizar(String logo,Date fecha_inicio,  Date fecha_final, String nombre_empresa, String cargo, String descripcion);

   public void modificar();

   public ExperienciaLaboral buscar(int id);

   public void eliminar(int id );
   
}
