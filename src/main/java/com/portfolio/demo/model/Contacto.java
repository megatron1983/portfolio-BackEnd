package com.portfolio.demo.model;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contacto {
   private int id;
   private String telefono;
   private String direccion;
   private String email;

   public Contacto() {
   }

   public Contacto(int id, String telefono, String direccion, String email) {
      this.id = id;
      this.telefono = telefono;
      this.direccion = direccion;
      this.email = email;
   }

   
   
   
}
