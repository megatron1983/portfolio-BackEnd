package com.portfolio.demo.model;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Proyecto {
   private int id;
   private String imagen;
   private String titulo;
   private String descripcion;
   private String link;

   public Proyecto() {
   }

   public Proyecto(int id, String imagen, String titulo, String descripcion, String link) {
      this.id = id;
      this.imagen = imagen;
      this.titulo = titulo;
      this.descripcion = descripcion;
      this.link = link;
   }

   

   
   
}
