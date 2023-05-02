package com.portfolio.demo.model;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Persona {
   private int id;
   private String titulo;
   private String imagen;
   private String password;
   private String usuario;

   public Persona() {
   }

   public Persona(int id, String titulo, String imagen, String password, String usuario) {
      this.id = id;
      this.titulo = titulo;
      this.imagen = imagen;
      this.password = password;
      this.usuario = usuario;
   }

   


   
}
