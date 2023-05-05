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
public class SobreMi {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   @Basic
   private String profesion;
   private String foto;
   private String descripcion;

   public SobreMi() {
   }

   public SobreMi(int id, String profesion, String foto, String descripcion) {
      this.id = id;
      this.profesion = profesion;
      this.foto = foto;
      this.descripcion = descripcion;
   }

   
   
}
