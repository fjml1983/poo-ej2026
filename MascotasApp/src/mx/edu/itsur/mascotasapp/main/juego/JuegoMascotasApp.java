package mx.edu.itsur.mascotasapp.main.juego;

import java.util.ArrayList;
import java.util.Scanner;
import mx.edu.itsur.mascotasapp.model.Mascota;
import mx.edu.itsur.mascotasapp.model.Veterinario;

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
        this.veterinario = new Veterinario();
        this.gameOver = false;
    }

    /**
     * Es el metodo que permite llevar el control del juego desde su inicio
     * hasta su finalización. En otras palabras es el motor del juego.
     */
    public void iniciarJuego() {
        //Logica del juego
        
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
            Scanner lector = new Scanner(System.in);
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

    private void adoptarNuevaMascota() {
        //TODO programar lógica
    }
}
