
/**
 *
 * @author Danna
 */
public class Circulo extends Figura {

    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }
    
    public double calcularArea(){
        double r = Math.PI * Math.pow(radio, 2);
        return r;
    }
}
