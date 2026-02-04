public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Medico med1 = new Medico();
        med1.nombre = "Raúl Rodriguez";
        med1.cedProf = "1234567890";
        
        Paciente pac1 = new Paciente();
        pac1.nombre = "Homero Simpson";
        
        Paciente pac2 = new Paciente();
        pac2.nombre = "Alexander Bell";
                
        med1.diagnosticar(pac1);
        med1.diagnosticar(pac2);

        pac1.enfermarse();
        med1.diagnosticar(pac1);
        
        med1.operar(pac1);
        med1.diagnosticar(pac1);
        
    }
    
}
