package com.portfolio.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.demo.model.Habilidad;
import com.portfolio.demo.model.Persona;
import com.portfolio.demo.servicios.InterfacePersona;

@RestController
@RequestMapping("/Persona")
public class ControllerPersona {
   @Autowired
   private InterfacePersona service;

   @PostMapping("/ListarTodo")
   public List<Persona> listarTodo() {

      return service.listarTodo();

   }

   @PostMapping("/actualizar")
   public void actualizar(@RequestBody String titulo, @RequestBody String imagen, @RequestBody String password,@RequestBody String usuario ) {
      service.actualizar(titulo, imagen, password, usuario);

   }
   
   @PostMapping("/buscar")
   public Persona buscar(@RequestBody int id) {
      return service.buscar(id);

   }
   
   @PostMapping("/eliminar")
   public void eliminar(@RequestBody int id) {
       service.eliminar(id);

   }
}
