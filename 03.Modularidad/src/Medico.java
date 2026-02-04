
public class Medico {

    String nombre;
    String cedProf;

    public void diagnosticar(Paciente p) {
        System.out.print(p.nombre + ": ");
        if(p.enfermo == true){
            System.out.println("Tu estado de salud es malo.");
        }else{
            System.out.println("Tu estas muy saludable!");
        }
    }

    public void recetar(Paciente p) {

    }

    public void operar(Paciente p) {
        System.out.println("El medico esta operando a " + p.nombre);
        p.enfermo = false;
    }

}
