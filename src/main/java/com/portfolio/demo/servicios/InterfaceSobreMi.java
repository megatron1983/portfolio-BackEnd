package com.portfolio.demo.servicios;

import java.util.List;

import com.portfolio.demo.model.SobreMi;

public interface InterfaceSobreMi {
   public SobreMi listarTodo();

   public void actualizar(String profesion,String foto, String descripcion);

   public void modificar();

   public SobreMi buscar(int id);

   public void eliminar(int id);
   
}
