
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Ventana de interfaz gráfica de usuario para veterinario
 * @author FJML1983
 */
public class VeterinariaGUI extends JFrame {
    private JLabel mensajeCrearMascota;  
    private JLabel lblNombre;
    
    //Constructor de la ventana
    public VeterinariaGUI(){
        //Inicializar componentes de GUI contenidos en la ventan
        //Etiqueta para el texto del formulario
        mensajeCrearMascota = new JLabel();
        mensajeCrearMascota.setText("Formulario Crear Mascota");
        mensajeCrearMascota.setBounds(50, 50, 200, 30);
        //mensajeCrearMascota.setFont(Font);
        //Etiqueta para el campo Nombre
        lblNombre = new JLabel();
        lblNombre.setText("Nombre:");
        lblNombre.setBounds(50, 80, 100, 30);        
        
        
        //Inicializar ventana
        this.setBounds(100, 100, 600, 300);
        this.setTitle("Veterinaria APP");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(mensajeCrearMascota);
        this.add(lblNombre);
        this.setVisible(true);
    }
}
