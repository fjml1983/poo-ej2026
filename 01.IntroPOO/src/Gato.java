
import java.util.Date;

public class Gato {
    String nombre;
    String raza;
    String estadoDeSalud;
    double peso;
    Date fechaDeNacimiento;

    public void maullar() {
        System.out.println(nombre + ": Miau");
    }

    public void comer() {
        System.out.println(nombre + ": Slurp..");
    }
    
}
