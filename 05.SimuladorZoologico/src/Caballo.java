/**
 *
 * @author FJML1983
 */
public class Caballo extends Animal {
    private String raza;
        
    public Caballo(String raza){
        this.raza = raza;
    }
    
    public void correr(){        
        System.out.println("Caballo " + this.raza 
                            +  " corriendo");
    }
}
