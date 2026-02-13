package mascotas;




import java.util.Date;

public class Mascota {
    private String nombre;
    private String raza;
    private String color;
    private double peso;
    private String tamanio;
    private Date fechaNacimiento;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    public String getColor() {
        return color;
    }

    public String getRaza() {
        return raza;
    }

    public String getNombre() {
        return nombre;
    }
    
        
    public void comer(){
        System.out.println("Slurp");
    }
    
    public void dormir(){
        System.out.println("Zzzzz");
    }
    
    public void jugar(){
        System.out.println("Yipi...");
    }
    
}
