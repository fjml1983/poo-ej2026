/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author FJML1983
 */
public class PlayeraPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Playera p1 = new Playera();
        p1.idPlayera = 10;
        p1.color = "Azul";
        p1.descripcion = "Polo moderno a rayas";
        p1.cantidadEnStock = 100;
        p1.precio = 150;  
        p1.mostrarInformacion();
        
        Playera p2 = new Playera();
        p2.idPlayera = 11;
        p2.color = "Roja";
        p2.descripcion = "Polo clasica a rayas";
        p2.cantidadEnStock = 50;
        p2.precio = 100;
        p2.mostrarInformacion();
        
        
    }
    
}
