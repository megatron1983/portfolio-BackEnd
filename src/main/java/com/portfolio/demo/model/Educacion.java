package com.portfolio.demo.model;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
@Getter
@Setter
public class Educacion {
   private int id;
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
