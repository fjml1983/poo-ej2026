/**
 *
 * @author Fernando J. Mtz. L.
 */
public class Main {

    public static void main(String[] args) {
        Caballo c1 = new Caballo("Arabe");
        Pato p1 = new Pato();
        
        //c1.raza = "Arabe";
        c1.comer("Alfalfa");
        c1.correr();
        
        p1.plumas = 10;
        p1.comer("pez");
        p1.graznar();
        
    }
    
}
