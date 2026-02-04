
import java.util.Date;

public class Mascota {
    String nombre;
    String raza;
    String color;
    double peso;
    String tamanio;
    Date fechaNacimiento;
    
    public void comer(){
        System.out.println("Slurp");
    }
    
    public void dormir(){
        System.out.println("Zzzzz");
    }
    
    public void jugar(){
        System.out.println("Yipi...");
    }
    
}
