/**
 *
 * @author FJML1983
 */
public class Persona extends SerHumano implements Programador, Panadero {
    public String nombre;
    
    public void pensar(){
        System.out.println(nombre + " esta pensando...");
    }    

    @Override
    public void programar() {
        System.out.println("Programando como persona");
    }

    @Override
    public void tomarCafe() {
        System.out.println("Tomando cafe como persona");
    }

    @Override
    public void hornearPan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
