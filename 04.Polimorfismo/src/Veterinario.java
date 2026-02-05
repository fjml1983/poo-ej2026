
public class Veterinario {
    String nombre;

    public void vacunar(Mascota m){
        System.out.println("Estoy vacunando a: " + m.nombre);        
    }
    
    public void sacarBolaDePelo(Gato g){
        System.out.println("Sacando bola de pelo a: " + g.nombre);
    }
    
}
