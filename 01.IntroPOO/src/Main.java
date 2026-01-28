/**
 *
 * @author FJML1983
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        Perro p1 = new Perro(); //Crear Instancia (objeto)
        //Asignar valores a la instancia (objeto) creada
        p1.raza = "San Bernardo";
        p1.color = "Verde";
        //Invocar comportamiento del objeto
        p1.ladrar();
        
        
        Perro p2 = new Perro();
        p2.raza = "Chihuahua";
        p2.color = "Naranja";
        p2.comer();
        
    }
    
}
