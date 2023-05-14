package com.portfolio.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.demo.model.Educacion;
import com.portfolio.demo.servicios.InterfaceEducacion;
import org.springframework.web.bind.annotation.CrossOrigin;
@RestController
@CrossOrigin(origins ={"https://portfolio-ap-maxi.web.app/"})
@RequestMapping("/Educacion")
public class ControllerEducacion {
   @Autowired
   private InterfaceEducacion service;

   @GetMapping("/ListarTodo")
   public List<Educacion> listarTodo() {

      return service.listarTodo();

   }

   @PostMapping("/actualizar")
   public void actualizar(@RequestBody Educacion educacion) {
      service.actualizar( educacion);

   }
   
   @PostMapping("/buscar")
   public Educacion buscar(@RequestBody int id) {
      return service.buscar(id);

   }
   
   @PostMapping("/eliminar")
   public void eliminar(@RequestParam int id) {
       service.eliminar(id);

   }



   
}
