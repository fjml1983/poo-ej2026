
public class Main {
    public static void main(String[] args) {
        Perro p1 = new Perro();
        p1.nombre = "Daisy";
        p1.ladrar();        
        p1.jugar();        
        
        Gato g1 = new Gato();
        g1.nombre = "Roger";
        g1.ronronear();
        g1.dormir();
        
        Veterinario v1 = new Veterinario();
        v1.nombre = "Pepe";
        v1.vacunar(g1);
        v1.vacunar(p1);
        v1.sacarBolaDePelo(g1);
    }    
}
