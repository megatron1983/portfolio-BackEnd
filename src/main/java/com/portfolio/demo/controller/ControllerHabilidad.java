package com.portfolio.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.demo.model.Habilidad;
import com.portfolio.demo.servicios.InterfaceHabilidad;


@RestController
//@CrossOrigin(origins ={"https://portfolio-ap-maxi.web.app/"})
@RequestMapping("/Habilidad")
public class ControllerHabilidad {

   @Autowired
   private InterfaceHabilidad service;

   @PostMapping("/ListarTodo")
   public List<Habilidad> listarTodo() {

      return service.listarTodo();

   }

   @PostMapping("/actualizar")
   public void actualizar(@RequestBody Habilidad habilidad) {
      service.actualizar(habilidad);

   }
   
   @PostMapping("/buscar")
   public Habilidad buscar(@RequestBody int id) {
      return service.buscar(id);

   }
   
   @PostMapping("/eliminar")
   public void eliminar(@RequestBody int id) {
       service.eliminar(id);

   }

 }