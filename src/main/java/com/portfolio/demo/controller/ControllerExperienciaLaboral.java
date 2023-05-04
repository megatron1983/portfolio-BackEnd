package com.portfolio.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.demo.model.ExperienciaLaboral;
import com.portfolio.demo.servicios.InterfaceExperienciaLaboral;

@RestController
@RequestMapping("/ExperienciaLaboral")
public class ControllerExperienciaLaboral {

   @Autowired
   private InterfaceExperienciaLaboral service;

   @PostMapping("/ListarTodo")
   public List<ExperienciaLaboral> listarTodo() {

      return service.listarTodo();

   }

   @PostMapping("/actualizar")
   public void actualizar(@RequestBody String logo, @RequestBody Date fecha_inicio, @RequestBody Date fecha_final,@RequestBody String nombre_empresa,@RequestBody String cargo,@RequestBody String descripcion) {
      service.actualizar( logo,fecha_inicio,   fecha_final, nombre_empresa, cargo, descripcion);

   }
   
   @PostMapping("/buscar")
   public ExperienciaLaboral buscar(@RequestBody int id) {
      return service.buscar(id);

   }
   
   @PostMapping("/eliminar")
   public void eliminar(@RequestBody int id) {
       service.eliminar(id);

   }

 }