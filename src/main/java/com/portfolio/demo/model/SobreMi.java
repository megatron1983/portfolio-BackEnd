package com.portfolio.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SobreMi {

   private int id;
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
