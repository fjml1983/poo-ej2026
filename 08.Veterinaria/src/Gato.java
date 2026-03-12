/**
 *
 * @author FJML1983
 */
public class Gato extends Mascota{
    
    public Gato(String nombre){
        super(nombre, "común", "gris",1500);
    }
    
    public void maullar(){
        System.out.println("El gato " + nombre +  " maulla");
    }
    
    public void jugar(){
        System.out.println("Miau Miau, girando la bola de estambre");
        peso -= 30;
    }
}
