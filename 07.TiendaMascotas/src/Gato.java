/**
 *
 * @author FJML1983
 */
public class Gato extends Mascota {
    
    public Gato(String nombre, String raza){
        super(nombre, raza);
    }    
    
    public void maullar(){
        System.out.println(this.nombre + ": Miau miau");
    }
    
    public void ronronear(){
        System.out.println(this.nombre + ": Rrrrr Rrrrr");    
    }
}
