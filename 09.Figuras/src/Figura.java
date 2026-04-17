
/**
 *
 * @author FJML1983
 */
public abstract class Figura {

    protected String nombre;
    protected double x;
    protected double y;

    public Figura(String nombre, double x, double y) {
        this.nombre = nombre;
        this.x = x;
        this.y = y;
    }

    public abstract double calcularArea();

    public void mostrarInfo() {
        System.out.println("Aqui se mostrara la info de la figura");
    }
}
