package com.portfolio.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Habilidad {
   private int id;
   private String nombre_Icono;
   private String nombre;
   private int porcentaje;

   public Habilidad() {
   }

   public Habilidad(int id, String nombre_Icono, String nombre, int porcentaje) {
      this.id = id;
      this.nombre_Icono = nombre_Icono;
      this.nombre = nombre;
      this.porcentaje = porcentaje;
   }

   
   
   
}
