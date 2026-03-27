
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
    
}
