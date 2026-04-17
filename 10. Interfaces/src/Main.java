/**
 *
 * @author FJML1983
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.nombre = "Brian";
        
        Persona p2 = new Persona();
        p2.nombre = "Hugo";
        
        p1.pensar();
        p2.respirar();
        
    }
    
}
