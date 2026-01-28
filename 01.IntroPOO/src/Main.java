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
        p1.nombre = "Bethoven";
        p1.raza = "San Bernardo";
        p1.color = "Blanco con café";
        //Invocar comportamiento del objeto
        p1.ladrar();
        
        
        Perro p2 = new Perro();
        p2.nombre = "Papi";
        p2.raza = "Chihuahua";
        p2.color = "Cafe claro";
        p2.comer();
        
        Gato g1 = new Gato();
        g1.nombre = "Garfield";
        g1.raza = "Shorthair";
        g1.peso = 12000;
        g1.maullar();
        
    }
    
}
