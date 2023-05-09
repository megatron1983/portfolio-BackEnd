package com.portfolio.demo.servicios;

import java.util.Date;
import java.util.List;

import com.portfolio.demo.model.Educacion;

public interface InterfaceEducacion {

   public List<Educacion> listarTodo();

   public void actualizar(Educacion educacion);

   

   public Educacion buscar(int id);

   public void eliminar(int id);
   
}
