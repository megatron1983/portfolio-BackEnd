package com.portfolio.demo.servicios;

import java.util.List;

import com.portfolio.demo.model.SobreMi;

public interface InterfaceSobreMi {
   public List<SobreMi> listarTodo();

   public void actualizar(SobreMi sobre);

  
   public SobreMi buscar(int id);

   public void eliminar(int id);
   
}
