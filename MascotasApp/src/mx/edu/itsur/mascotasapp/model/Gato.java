
package mx.edu.itsur.mascotasapp.model;

import java.time.LocalDate;

/**
 *
 * @author FJML1983
 */
public class Gato extends Mascota{
   
    public Gato(String nombre, String color, String raza, LocalDate fechaDeNacimiento, int estadoDeSalud) {    
        super(nombre, color, raza, fechaDeNacimiento, estadoDeSalud);
    }

    @Override
    public void jugar() {
        System.out.println("      |\\      _,,,---,,_");
        System.out.println("RRRrr /,`.-'`'    -.  ;-;;,_");
        System.out.println("     |,4-  ) )-,_. ,\\ (  `'-'");
        System.out.println("    '---''(_/--'  `-'\\_)");
        System.out.println("          O  <-- Pelota");        
    }

    @Override
    public void updateEstadoDeSalud() {
        //TODO:Programar como actualizar salud
    }
           
}
