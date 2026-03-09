/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FJML1983
 */
public class Playera {
    int idPlayera;
    String descripcion;
    String color;
    float precio;
    int cantidadEnStock;
    
    public void mostrarInformacion()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Playera{" + "idPlayera=" + idPlayera + ", descripcion=" + descripcion + ", color=" + color + ", precio=" + precio + ", cantidadEnStock=" + cantidadEnStock + '}';
    }

    

}
