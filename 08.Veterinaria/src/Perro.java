/**
 *
 * @author FJML1983
 */
public class Perro extends Mascota{
    private int pulgas; 
    
    public Perro(String color){
        super("", "", "", 0);
        this.color = color;
    }
    
    public Perro(String nombre, int pulgas){
        super(nombre, "común", "gris",2500);
        this.pulgas = pulgas;
    }
   
    public void ladrar(){
        System.out.println("El perro " + nombre +  " ladra Guau");
    }    
    
    public void ladrar(int cantLadridos){
        for (int i = 0; i < cantLadridos; i++) {
            System.out.println("Guau...");
        }    
    }
    
    public void ladrar (String tono){
        
        System.out.println("El perro ladra en tono: " + tono);
    }
    
    @Override
    public void jugar() {
        System.out.println("Perro jugando, guau, guau, grrrrr");
        peso -= 50;
    }
}
