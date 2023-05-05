package com.portfolio.demo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.demo.model.Habilidad;
import com.portfolio.demo.repository.RepoHabilidad;
@Service
public class HabilidadServi implements InterfaceHabilidad {
   @Autowired
   private RepoHabilidad baseRepo;

   @Override
   public List<Habilidad> listarTodo() {
      return baseRepo.findAll();
   }

   @Override
   public void actualizar(String nombre_icono, String nombre, int porcentaje) {
      Habilidad skill = new Habilidad(porcentaje, nombre_icono, nombre, porcentaje);
      baseRepo.save(skill);
   }

   @Override
   public void modificar() {
      throw new UnsupportedOperationException("Unimplemented method 'modificar'");
   }

   @Override
   public Habilidad buscar(int id) {
      return baseRepo.findById(id).orElse(null);
   }

   @Override
   public void eliminar(int id) {
      baseRepo.deleteById(id);
   }

}
