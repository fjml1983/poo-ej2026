package mx.edu.itsur.mascotasapp.main.juego;

import java.util.ArrayList;
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
        while(!gameOver){
            //Logica del juego
            
        }        
    }

    /**
     * Cuando el usuario selecciones la opción Ver mascotas, 
     * la aplicación deberá mostrar la lista de mascotas adoptadas vigente.
     */
    private void verMascotas() {
        
    }

    private void alimentarMascota() {
    }

    private void jugarConMascota() {
    }

    private void llevarMascotaAlVeterinario() {
    }

    private void adoptarNuevaMascota() {
    }
}
