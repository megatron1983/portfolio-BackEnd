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
public class Proyecto {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   @Basic
   
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
