package com.portfolio.demo.servicios;
package com.portfolio.demo.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.portfolio.demo.model.Habilidad;
import com.portfolio.demo.repository.RepoHabilidad;

public class HabilidadServi implements InterfaceHabilidad{
   @Autowired
   private RepoHabilidad baseRepo;
   @Override
   public List<Habilidad> listarTodo() {
      return baseRepo.findAll();
   }

   @Override
   public void actualizar(String nombre_icono,String nombre, int porcentaje) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'actualizar'");
   }

   @Override
   public void modificar() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'modificar'");
   }

   @Override
   public Habilidad buscar() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'buscar'");
   }

   @Override
   public void eliminar() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
   }
   
}
