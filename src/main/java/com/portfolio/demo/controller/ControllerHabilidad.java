package com.portfolio.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.demo.model.Habilidad;
import com.portfolio.demo.servicios.InterfaceHabilidad;

@RestController
@RequestMapping("/Habilidad")
public class ControllerHabilidad {

   @Autowired
   private InterfaceHabilidad service;

   @PostMapping("/ListarTodo")
   public List<Habilidad> listarTodo() {

      return service.listarTodo();

   }

   @PostMapping("/actualizar")
   public void  actualizar(@RequestBody String nombre_icono,@RequestBody String nombre, @RequestBody int porcentaje ) {
      service.actualizar(nombre_icono, nombre, porcentaje);
     
   }
 }