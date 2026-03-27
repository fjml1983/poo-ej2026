
package mx.edu.itsur.mascotasapp.model;

import java.time.LocalDate;

/**
 *
 * @author FJML1983
 */
public class Mascota {
    protected String nombre;
    protected String color;
    protected String raza;    
    protected LocalDate fechaDeNacimiento;   
    protected int estadoDeSalud;

    public Mascota(String nombre, String color, String raza, LocalDate fechaDeNacimiento, int estadoDeSalud) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.estadoDeSalud = estadoDeSalud;
    }
    
        
}
