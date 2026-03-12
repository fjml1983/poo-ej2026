/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafa
 */
public class Rectangulo extends Figura{
    private double base;
    private double altura;
    
    public Rectangulo(String nombre, double base, double altura)
    {
       // this.nombre = nombre;
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double r;
        r = base*altura;
        return r;
    }
    
}
