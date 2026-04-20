package mx.edu.itsur.mascotasapp.model;

/**
 *
 * @author FJML1983
 */
public class Veterinario {
    protected String nombre;
    protected String cedulaProf;
    protected int aniosDeExperiencia;

    public Veterinario(String nombre, String cedulaProf, int aniosDeExperiencia) {
        this.nombre = nombre;
        this.cedulaProf = cedulaProf;
        this.aniosDeExperiencia = aniosDeExperiencia;
    }    
    
    public String diagnosticar(IDiagnosticable cosa){
        //TODO: Programar aqui la manera de diagnosticar
        
        int estadoActual = cosa.getEstadoDeSalud();
        
        //cosa.getClass();
        
        if(estadoActual < 50){
            System.out.println("Cosa Enferma");
        }
        
        return null;
    }
    
}
