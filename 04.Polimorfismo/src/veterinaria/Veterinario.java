package veterinaria;

import mascotas.Gato;
import mascotas.Mascota;


public class Veterinario {
    public String nombre;

    public void vacunar(Mascota m){
        System.out.println("Estoy vacunando a: " + m.getNombre());  
        System.out.println("La mascota es de raza:"+ m.getRaza());
        System.out.println("La mascota es de color:" + m.getColor());
 
    }
    
    public void sacarBolaDePelo(Gato g){
        System.out.println("Sacando bola de pelo a: " + g.getNombre());
        
    }
    
    
}
