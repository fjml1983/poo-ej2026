/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.mascotasapp.model;

import java.time.LocalDate;

/**
 *
 * @author FJML1983
 */
public class Perro extends Mascota {
  
   public Perro(String nombre, String color, String raza, LocalDate fechaDeNacimiento, int estadoDeSalud) {    
        super(nombre, color, raza, fechaDeNacimiento, estadoDeSalud);
    }    
}
