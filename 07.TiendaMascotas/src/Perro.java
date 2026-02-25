/**
 *
 * @author FJML1983
 */
public class Perro extends Mascota {
    private int pulgas;
    
    public Perro(String nombre, String raza){
        this.nombre = nombre;
        this.raza = raza;
    }
    
    public Perro(String nombre, int pulgas){
        this.nombre = nombre;
        this.pulgas = pulgas;
    }    
    
    public void ladrar(){
        System.out.println(this.nombre + ": Guau Guau");
    }    
}
