package Classes.Rent_a_Car.Entities;

import java.util.Random;

public class Ticket {
    
    private Integer registro;

    public Ticket() {
        
    }

    public Integer getRegistro() {
        return registro;
    }
   
    public int gerarTicket(int reg){

        int [] numvec = new int[reg];
            String numStr = "";

            for (int i = 0; i < reg; i++){
                Random ram = new Random();
                int numRam = ram.nextInt(1,9);
                numvec[i] = numRam;
            }
            
            for (int i = 0; i < reg; i++){
                numStr = numStr + String.valueOf(numvec[i]);
            }
        
            int registr = Integer.valueOf(numStr);
            return registr;
    }
}
