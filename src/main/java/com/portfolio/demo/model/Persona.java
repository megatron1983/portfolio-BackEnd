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
public class Persona {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   @Basic

   
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
