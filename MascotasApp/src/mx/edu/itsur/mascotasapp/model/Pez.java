
package mx.edu.itsur.mascotasapp.model;

import java.time.LocalDate;

/**
 *
 * @author FJML1983
 */
public class Pez extends Mascota {
    
   public Pez(String nombre, String color, String raza, LocalDate fechaDeNacimiento, int estadoDeSalud) {    
        super(nombre, color, raza, fechaDeNacimiento, estadoDeSalud);
    }   
   
   @Override
   public void jugar(){
        System.out.println("       .   o");
        System.out.println("      o      ______");
        System.out.println("    o    ___/      \\\\");
        System.out.println("   <span> <'____  <  \\\\");
        System.out.println("          \\      / //");
        System.out.println("           \\____/ //");
   }

    @Override
    public void updateEstadoDeSalud() {
        //TODO:Programar como actualizar la salud 
    }
}
