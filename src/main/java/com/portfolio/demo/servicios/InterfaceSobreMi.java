package com.portfolio.demo.servicios;

import java.util.List;

import com.portfolio.demo.model.SobreMi;

public interface InterfaceSobreMi {
   public List<SobreMi> listarTodo();

   public void actualizar(String profesion,String foto, String descripcion);

   public void modificar(int id,String profesion,String foto, String descripcion);

   public SobreMi buscar(int id);

   public void eliminar(int id);
   
}
