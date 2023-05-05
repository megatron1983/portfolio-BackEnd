package com.portfolio.demo.servicios;

import java.util.List;

import com.portfolio.demo.model.Contacto;

public interface InterfaceContacto {

   public List<Contacto> listarTodo();

   public void actualizar(String telefono, String direccion, String email);

   public void modificar(int id,String telefono, String direccion, String email);

   public Contacto buscar(int id);

   public void eliminar(int id);
}
