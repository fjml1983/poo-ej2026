/**
 *
 * @author FJML1983
 */
public class Perro extends Mascota{
    private int pulgas; 
    
    public Perro(String nombre, int pulgas){
        super(nombre, "común", "gris",2500);
        this.pulgas = pulgas;
    }
    
    public void ladrar(){
        System.out.println("El perro " + nombre +  " ladra");
    }    
    
}
