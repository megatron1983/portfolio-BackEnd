package com.portfolio.demo.servicios;

import java.util.List;

public interface InterfaceEducacion {

   public List<Habilidad> listarTodo();

   public void actualizar();

   public void modificar();

   public Habilidad buscar();

   public void eliminar();
   
}