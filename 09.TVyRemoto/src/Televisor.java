/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FJML1983
 */
public class Televisor {
    //Atributos
    private int pulgadas;
    private boolean encendido; //True=encendido False=apagado
    //..otros atributos
    
    //Constructor
    public Televisor(int pulg){
        this.pulgadas = pulg;
        this.encendido = false; //Apagado por default
    }

    //Métodos Getter 
    public boolean isEncendido() {    
        return encendido;
    }    
    
    //Métodos
    public void encender() {
        //Logica para encender TV
        cargarSoftware();  
        ajustarIluminacionPantalla();
        probarSenialAntena();
        this.encendido = true;
    }
    
    public void apagar(){
        System.out.println("Guardando configuración actual...");
        System.out.println("TV apagada correctamente.");
        //Logica de apagar
        this.encendido = false;
    }
    
    private void cargarSoftware(){
        System.out.println("WebOS loading...");
        //Toda la logica para inicializar el OS  
        System.out.println("WebOS ready.");
    }
    
    private void probarSenialAntena(){
        System.out.println("Antena test ha iniciado...");
        //Logica para probar señal
        System.out.println("El test ha finalizado");
    }
    
    private void ajustarIluminacionPantalla(){
        System.out.println("Ajustando Iluminación");
    }
    
}
