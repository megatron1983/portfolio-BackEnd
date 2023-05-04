package com.portfolio.demo.model;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Setter
@Getter
@Entity
public class Educacion {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;

   @Basic
   private Date fecha_inicio;
   private Date fecha_final;
   private String nombre_empresa;
   private String titulo;
   private String descripcion;

   public Educacion() {
   }

   public Educacion(int id, Date fecha_inicio, Date fecha_final, String nombre_empresa, String titulo,
         String descripcion) {
      this.id = id;
      this.fecha_inicio = fecha_inicio;
      this.fecha_final = fecha_final;
      this.nombre_empresa = nombre_empresa;
      this.titulo = titulo;
      this.descripcion = descripcion;
   }

}
