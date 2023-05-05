package com.portfolio.demo.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Habilidad {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   @Basic
   
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
