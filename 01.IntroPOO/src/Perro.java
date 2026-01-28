
import java.util.Date;

public class Perro {
    //Estado-Atributos
    String nombre;  //"Firulais"
    String raza;    //"Shar-pei"
    String color;   //"Negro con manchas blancas"
    double peso;    //En gramos, p.ej: 2300
    String tamanio; //Pequeño-Mediano-Grande
    Date fechaDeNacimiento;  //Instancia de la clase Date
    
    //Comportamiento-Metodos
    public void ladrar(){
        System.out.println(nombre + ": Guau-Guau");
    }
    
    public void comer(){
        System.out.println(nombre + ": Ñam,ñam...Slurp...");
    }    
    
}
