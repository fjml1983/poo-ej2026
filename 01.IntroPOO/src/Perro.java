
import java.util.Date;

public class Perro {
    //Estado-Atributos
    String raza;    //"Shar-pei"
    String color;   //"Negro con manchas blancas"
    double peso;    //En gramos, p.ej: 2300
    String tamanio; //Pequeño-Mediano-Grande
    Date fechaDeNacimiento;  //Instancia de la clase Date
    
    //Comportamiento-Metodos
    public void ladrar(){
        System.out.println("Guau-Guau");
    }
    
    public void comer(){
        System.out.println("Ñam,ñam...Slurp...");
    }    
    
}
