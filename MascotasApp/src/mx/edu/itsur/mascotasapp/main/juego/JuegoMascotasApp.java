package mx.edu.itsur.mascotasapp.main.juego;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;
import mx.edu.itsur.mascotasapp.model.*;

/**
 *
 * @author FJML1983
 */
public class JuegoMascotasApp {

    private ArrayList<Mascota> mascotas;
    private Veterinario veterinario;
    private boolean gameOver;

    public JuegoMascotasApp() {
        this.mascotas = new ArrayList();
        this.veterinario = new Veterinario("Dr.Brown","12345678",2);
        this.gameOver = false;
    }

    /**
     * Es el metodo que permite llevar el control del juego desde su inicio
     * hasta su finalización. En otras palabras es el motor del juego.
     */
    public void iniciarJuego() {
        //Logica del juego

        //Crear una unica instancia del scanner para ser utilizada muchas veces
        Scanner lector = new Scanner(System.in);

        //Repetir mientras no sea game over
        while (!gameOver) {

            //Paso 1. Imprimir el menu
            System.out.print("** MASCOTAS APP - MENU PRINCIPAL**\n"
                    + "----------------------------------\n"
                    + "1. Ver mis mascotas\n"
                    + "2. Alimentar una mascota.\n"
                    + "3. Jugar con una mascota.\n"
                    + "4. Llevar una mascota al veterinario.\n"
                    + "5. Adoptar una nueva mascota.\n"
                    + "6. Salir\n"
                    + "\n"
                    + "¿Que accion deseas realizar? \n"
                    + "(escribe el numero y presiona ENTER): "
            );

            //Paso 2. Leer la opcion del usuario
            int opcion = lector.nextInt();

            //Paso 3. Realizar la accion elegida
            switch (opcion) {
                case 1:
                    this.verMascotas();
                    break;
                case 2:
                    this.alimentarMascota();
                    break;
                case 3:
                    this.jugarConMascota();
                    break;
                case 4:
                    this.llevarMascotaAlVeterinario();
                    break;
                case 5:
                    this.adoptarNuevaMascota();
                    break;
                case 6:
                    gameOver = true;
                    break;
                default:
                    break;
            }
        }
    }

    /**
     * Cuando el usuario selecciones la opción Ver mascotas, la aplicación
     * deberá mostrar la lista de mascotas adoptadas vigente.
     */
    private void verMascotas() {
        //TODO programar lógica
    }

    private void alimentarMascota() {
        //TODO programar lógica
    }

    private void jugarConMascota() {
        //TODO programar lógica
    }

    private void llevarMascotaAlVeterinario() {
        //TODO programar lógica
    }

    /**
     * La aplicación deberá permitir registrar la nueva mascota pidiendo llenar
     * los datos a través de un formulario
     */
    private void adoptarNuevaMascota() {
        //TODO programar lógica
        System.out.println("**LLENA EL FORMULARIO PARA ADOPTAR LA NUEVA MASCOTA **");
        System.out.println("Tipo de mascota? [p]erro, [g]gato, Pe[z] ([x] para cancelar) ");

        Scanner scan = new Scanner(System.in);
        char tipoMascota = (char) scan.nextInt();
        
        //Pedir los datos para llenar estas variables:
        String nombre = "??";
        String color = "??";
        String raza = "??";
        int anioNac = 0;
        int mesNac = 0;
        int diaNac = 0;
        
        //Solicitar los datos de la mascota
        //Escribir aqui todos los scanner.next necesarios
        
        Mascota m = null;
        if (tipoMascota == 'p') {
            m = new Perro(nombre, color, raza, LocalDate.of(anioNac, mesNac, diaNac) , 100);
        } else if (tipoMascota == 'g') {
            m = new Gato(nombre, color, raza, LocalDate.of(anioNac, mesNac, diaNac) , 50);
        } else if (tipoMascota == 'z') {
            m = new Pez(nombre, color, raza, LocalDate.of(anioNac, mesNac, diaNac) , 10);
        }        
                
        mascotas.add(m);

    }
}
