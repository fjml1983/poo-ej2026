
import java.time.LocalDate;

/**
 *
 * @author FJML1983
 */
public class Mascota {
    //Atributos
    protected String nombre;
    protected String raza;
    protected String color;
    protected double peso;
    protected String tamanio;
    protected LocalDate fechaDeNacimiento;
    
    //Constructores
    public Mascota(String nombre, String raza){
        this.nombre = nombre;
        this.raza = raza;
    }
    
    //Métodos
    public void comer(){
        System.out.println(this.nombre + ": Ñam Ñam");
    }
    
    public void dormir(){
        System.out.println(this.nombre + ": Zzz Zzzz");        
    }
    
    public void jugar(){
        System.out.println(this.nombre + ": Yipi Yipi");
    }
}
