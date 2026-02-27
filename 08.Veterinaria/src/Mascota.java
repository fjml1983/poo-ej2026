/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FJML1983
 */
public class Mascota {

    protected String nombre;
    protected String raza;
    protected String color;
    protected double peso;
    //... otros atributos

    public Mascota(String nombre, String raza, String color, double peso) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.peso = peso;
    }

    public void comer() {
        System.out.println("La mascota " + nombre + " come");
        peso = peso + 250;
    }

    public void dormir() {
        System.out.println("La mascota " + nombre + " duerme");
        peso = peso + 50;
    }

    public void jugar() {
        System.out.println("La mascota " + nombre + " juega");
        peso = peso - 100;
    }

}
