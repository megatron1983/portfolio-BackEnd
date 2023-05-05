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
public class Contacto {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   @Basic
   
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
