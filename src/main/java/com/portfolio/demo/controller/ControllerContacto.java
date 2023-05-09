package com.portfolio.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.portfolio.demo.model.Contacto;
import com.portfolio.demo.servicios.InterfaceContacto;

@RestController
@RequestMapping("/Contacto")
public class ControllerContacto {
   @Autowired
   private InterfaceContacto service;

   @PostMapping("/ListarTodo")
   public List<Contacto> listarTodo() {

      return service.listarTodo();

   }

   @PostMapping("/actualizar")
   public void actualizar(@RequestBody Contacto contacto) {
      service.actualizar(contacto);

   }

   @PostMapping("/buscar")
   public Contacto buscar(@RequestBody int id) {
      return service.buscar(id);

   }

   @PostMapping("/eliminar")
   public void eliminar(@RequestBody int id) {
      service.eliminar(id);

   }
}
