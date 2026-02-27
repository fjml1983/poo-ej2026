/**
 *
 * @author FJML1983
 */
public class Perro extends Mascota {
    private int pulgas;
    
    public Perro(String nombre, String raza){
        super(nombre, raza);
    }
    
    public Perro(String nombre, int pulgas){
        super(nombre, "Callejero");
        this.pulgas = pulgas;
    }    
    
    public void ladrar(Gato g){
        System.out.println(this.nombre + ": Guau Guau");
        g.maullar();
    }    
}
