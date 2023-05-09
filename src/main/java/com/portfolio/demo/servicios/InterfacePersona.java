package com.portfolio.demo.servicios;
import java.util.List;

import com.portfolio.demo.model.Persona;
public interface InterfacePersona {

   public List<Persona> listarTodo();

   public void actualizar(Persona persona);

  

   public Persona buscar(int id);

   public void eliminar(int id);
   
}
