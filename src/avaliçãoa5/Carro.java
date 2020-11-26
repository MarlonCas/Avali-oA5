package avaliçãoa5;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Marlon
 */
public class Carro extends Veiculos {
   
    public String nPortas;
    
    
    public Carro() {
        
    }
    
    public void checkin(){
        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("HH:mm:ss");
        String horaCheckinCarro = formatar.format(data);
        System.out.println(horaCheckinCarro);  
    }
    
    public void checkout(){
        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("HH:mm:ss");
        String horaChekoutCarro = formatar.format(data);
        System.out.println(horaChekoutCarro);  
    }


}

