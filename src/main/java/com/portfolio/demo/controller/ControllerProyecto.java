package com.portfolio.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.demo.model.Proyecto;
import com.portfolio.demo.servicios.InterfaceProyecto;


@RestController
//@CrossOrigin(origins ={"https://portfolio-ap-maxi.web.app/"})
@RequestMapping("/Proyecto")
public class ControllerProyecto {
   @Autowired
   private InterfaceProyecto service;

   @PostMapping("/ListarTodo")
   public List<Proyecto> listarTodo() {

      return service.listarTodo();

   }

   @PostMapping("/actualizar")
   public void actualizar(@RequestBody Proyecto proyecto) {
      service.actualizar( proyecto);

   }
   
   @PostMapping("/buscar")
   public Proyecto buscar(@RequestBody int id) {
      return service.buscar(id);

   }
   
   @PostMapping("/eliminar")
   public void eliminar(@RequestBody int id) {
       service.eliminar(id);

   }



   
}