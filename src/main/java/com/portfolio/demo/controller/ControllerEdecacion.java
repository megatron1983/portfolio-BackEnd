package com.portfolio.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.demo.model.Educacion;
import com.portfolio.demo.servicios.InterfaceEducacion;
@RestController
@RequestMapping("/Educacion")
public class ControllerEdecacion {
   @Autowired
   private InterfaceEducacion service;

   @PostMapping("/ListarTodo")
   public List<Educacion> listarTodo() {

      return service.listarTodo();

   }

   @PostMapping("/actualizar")
   public void actualizar(@RequestBody Date fecha_inicio, @RequestBody Date fecha_final, @RequestBody String nombre_empresa, String titulo, String descripcion) {
      service.actualizar( fecha_inicio,  fecha_final,  nombre_empresa,  titulo, descripcion);

   }
   
   @PostMapping("/buscar")
   public Educacion buscar(@RequestBody int id) {
      return service.buscar(id);

   }
   
   @PostMapping("/eliminar")
   public void eliminar(@RequestBody int id) {
       service.eliminar(id);

   }



   
}
