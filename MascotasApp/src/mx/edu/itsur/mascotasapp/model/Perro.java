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

    @Override
    public void jugar() {
        System.out.println("      __");
        System.out.println(" (___()'';      O  <-- ¡Lánzala!");
        System.out.println(" /,    /`      /\\");
        System.out.println(" \\\\\"--\\\\      /  \\");      
    }

    @Override
    public void updateEstadoDeSalud() {
        //TODO: Aquí tenemos que programar
        //como el perro debe actulzar su salud
    }
   
}
