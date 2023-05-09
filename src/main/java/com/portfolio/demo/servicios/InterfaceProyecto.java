package com.portfolio.demo.servicios;

import java.util.List;

import com.portfolio.demo.model.Proyecto;

public interface InterfaceProyecto {

   public List<Proyecto> listarTodo();

   public void actualizar(Proyecto proyecto);

   
   public Proyecto buscar(int id);

   public void eliminar(int id);
   
}
