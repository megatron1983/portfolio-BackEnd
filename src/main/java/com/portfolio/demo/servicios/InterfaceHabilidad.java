package com.portfolio.demo.servicios;

import java.util.List;

import com.portfolio.demo.model.Habilidad;


public interface InterfaceHabilidad {
   
   public List<Habilidad> listarTodo();

   public void actualizar(Habilidad habilidad);

   

   public Habilidad buscar(int id);

   public void eliminar(int id);
   

   
}
