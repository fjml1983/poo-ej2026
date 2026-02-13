/**
 *
 * @author FJML1983
 */
public class Animal {
    String tipoAlimentacion;
    String tipoReproduccion;
    String tipoEstrucCorporal;
    
    void comer(String comida){
        System.out.println("El animal esta comiendo ñam ñam");
    }
    
    void reproducir(Animal pareja){
        System.out.println("El animal se esta reproduciendo yahoo");
    }
    
    void morir(){
        System.out.println("El animal esta muriendo shhhh");
    }
    
}
