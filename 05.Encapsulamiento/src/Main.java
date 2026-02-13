
import mascotas.Perro;
import mascotas.Gato;
import veterinaria.Veterinario;


public class Main {
    public static void main(String[] args) {
        Perro p1 = new Perro();
        p1.setNombre("Daisy");
        p1.ladrar();        
        p1.jugar();        
        
        Gato g1 = new Gato();
        g1.setNombre("Roger");
        g1.ronronear();
        g1.dormir();
        
        Veterinario v1 = new Veterinario();
        v1.nombre = "Pepe";
        v1.vacunar(g1);
        v1.vacunar(p1);
        //v1.sacarBolaDePelo(p1);  Esto sería inválido      
        v1.sacarBolaDePelo(g1);
    }    
}
