package com.portfolio.demo.servicios;

import com.portfolio.demo.model.Contacto;

public interface InterfaceContacto {

   public Contacto listarTodo();

   public void actualizar(String telefono, String direccion, String email);

   public void modificar(String telefono, String direccion, String email);

   public Contacto buscar(int id);

   public void eliminar(int id);
}
