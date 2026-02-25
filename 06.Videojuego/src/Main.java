/**
 *
 * @author FJML1983
 */
public class Main {

    public static void main(String[] args) {
        
        DonkeyKong dk1 = new DonkeyKong("VERDE");
        dk1.golperPiso();
        System.out.println(dk1.colorCorbata);
        
        DonkeyKong dk2 = new DonkeyKong("ROJO");
        System.out.println(dk2.colorCorbata);
                
        
        
        Pikachu p1 = new Pikachu("Catsup");            
        p1.caminar("NORTE");
        
        Pikachu p2 = new Pikachu("Panchito");
        //p2.nombre = "Panchito";
        p2.caminar("SUR");
        
    }
    
}
