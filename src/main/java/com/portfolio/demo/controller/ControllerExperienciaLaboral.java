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
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
//@CrossOrigin(origins ={"https://portfolio-ap-maxi.web.app/"})
@RequestMapping("/ExperienciaLaboral")
public class ControllerExperienciaLaboral {

   @Autowired
   private InterfaceExperienciaLaboral service;

   @PostMapping("/ListarTodo")
   public List<ExperienciaLaboral> listarTodo() {

      return service.listarTodo();

   }

   @PostMapping("/actualizar")
   public void actualizar(@RequestBody ExperienciaLaboral laboral) {
      service.actualizar(  laboral);

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
