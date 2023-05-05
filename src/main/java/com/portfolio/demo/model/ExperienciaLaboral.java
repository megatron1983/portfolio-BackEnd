package com.portfolio.demo.model;


import lombok.Getter;
import lombok.Setter;
import java.util.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Getter
@Setter
@Entity
public class ExperienciaLaboral {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Basic
   
   private String logo;
   private Date fecha_inicio;
   private Date fecha_final;
   private String nombre_empresa;
   private String cargo;
   private String descripcion;

   public ExperienciaLaboral() {
   }

   public ExperienciaLaboral(int id, String logo, Date fecha_inicio, Date fecha_final, String nombre_empresa,
         String cargo, String descripcion) {
      this.id = id;
      this.logo = logo;
      this.fecha_inicio = fecha_inicio;
      this.fecha_final = fecha_final;
      this.nombre_empresa = nombre_empresa;
      this.cargo = cargo;
      this.descripcion = descripcion;
   }

   

   

}
