
package mx.edu.itsur.mascotasapp.model;

import java.time.LocalDate;

/**
 *
 * @author FJML1983
 */
public abstract class Mascota implements IDiagnosticable {
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

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public String getRaza() {
        return raza;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    @Override
    public int getEstadoDeSalud() {
        return estadoDeSalud;
    }
    
    public void comer(){
        System.out.println("La mascota:" + this.nombre + " esta comiendo. ");
    }               
    
    public abstract void jugar();
    
}
