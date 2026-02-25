/**
 *
 * @author FJML1983
 */
public class Gato extends Mascota {
    
    public Gato(String nombre){
        this.nombre = nombre;
    }    
    
    public void maullar(){
        System.out.println(this.nombre + ": Miau miau");
    }
    
    public void ronronear(){
        System.out.println(this.nombre + ": Rrrrr Rrrrr");    
    }
}
