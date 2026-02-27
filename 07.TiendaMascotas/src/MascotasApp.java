
import java.util.Scanner;

/**
 *
 * @author FJML1983
 */
public class MascotasApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gato g1 = new Gato("Garfield", "Gordinflon");        
        Perro p1 = new Perro("Oddie", 0);
        
        while(true){
            System.out.println("Elige un acción:");
            System.out.println("1. Gato maulla");
            System.out.println("2. Gato ronronea");
            System.out.println("3. Perro ladra");        
            System.out.println("4. Gato Juega");
            //... agregar mas opciones al menu...
            
            Scanner lector = new Scanner(System.in);
            int accion = lector.nextInt();
            switch (accion) {
                case 1:
                    g1.maullar();
                    break;
                case 2:
                    g1.ronronear();
                    break;
                case 3:
                    p1.ladrar(g1);
                    break;
                case 4:
                    g1.jugar();
                    break;
                default:
                    break;
            }
            
        }
    }
    
}
