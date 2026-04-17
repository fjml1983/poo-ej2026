
/**
 *
 * @author Danna
 */
public class Circulo extends Figura {

    private double radio;

    public Circulo(String nombre, double x, double y, double radio) {
        super(nombre,x,y);
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        double r = Math.PI * Math.pow(radio, 2);
        return r;
    }
    

}
