package com.portfolio.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.demo.model.SobreMi;
import com.portfolio.demo.servicios.InterfaceSobreMi;

import java.util.List;

@RestController
@RequestMapping("/SobreMi")
public class ControllerSobreMi {
   @Autowired
   private InterfaceSobreMi service;

   @PostMapping("/ListarTodo")
   public List<SobreMi> listarTodo() {

      return service.listarTodo();

   }

   @PostMapping("/actualizar")
   public void actualizar(@RequestBody String profesion, @RequestBody String foto, @RequestBody String descripcion) {
      service.actualizar(profesion, foto, descripcion);

   }

   @PostMapping("/buscar")
   public SobreMi buscar(@RequestBody int id) {
      return service.buscar(id);

   }

   @PostMapping("/eliminar")
   public void eliminar(@RequestBody int id) {
      service.eliminar(id);

   }
}