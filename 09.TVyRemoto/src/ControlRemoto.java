/**
 *
 * @author FJML1983
 */
public class ControlRemoto {
    //Atributos
    private String tipoSenial; //IR, BT, WIFI
    private Televisor tv;
    //otros atributos
    
    //Constructor
    public ControlRemoto(Televisor tv){
        this.tv = tv;
    }
    
    //Método del botón único encender/apagar
    public void encenderApagar(){        
        if(tv.isEncendido())
            tv.apagar();
        else
            tv.encender();
    }
}
