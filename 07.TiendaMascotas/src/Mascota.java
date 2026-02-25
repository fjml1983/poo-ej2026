
import java.time.LocalDate;

/**
 *
 * @author FJML1983
 */
public class Mascota {
    protected String nombre;
    protected String raza;
    protected String color;
    protected double peso;
    protected String tamanio;
    protected LocalDate fechaDeNacimiento;
    
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
