
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author FJML1983
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //No se puede instanciar una clase abstracta
        //Figura f = new Figura("A",0,0);
        //double area = f.calcularArea();

        ArrayList<Figura> figuras = new ArrayList<>();

        Rectangulo r = new Rectangulo("A", 0, 0, 10, 10);
        Circulo c = new Circulo("C", 100, 100, 50);

        figuras.add(r);
        figuras.add(c);
        /*
        System.out.println("Area del rectangulo:");
        double area = r.calcularArea();
        System.out.println(area);
        
        System.out.println("Area del circulo:");
        System.out.println(c.calcularArea());
         */
        for (Figura f : figuras) {
            System.out.println(f.calcularArea());
        }

    }

}
