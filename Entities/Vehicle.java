package Classes.Rent_a_Car.Entities;

import Classes.Rent_a_Car.Enum.Modelos;

public class Vehicle {
    
    
    private Modelos automovel;
    private Double priceDay;
    private Double priceHour;



    public Vehicle() {
    }

    public Vehicle(int auto) {
        
        if (auto == 1){
            this.automovel = Modelos.CIVIC;
            this.priceHour = 10.0;
            this.priceDay = 130.0;
            
        } else if (auto == 2){
            this.automovel = Modelos.COROLA;
            this.priceHour = 12.5;
            this.priceDay = 199.90;
         
        } else if (auto == 3){
            this.automovel = Modelos.HB20;
            this.priceHour = 10.5;
            this.priceDay = 150.0;
           
        } else if (auto == 4){
            this.automovel = Modelos.HILUX;
            this.priceHour = 27.0;
            this.priceDay = 320.0;
         
        } else if (auto == 5){
            this.automovel = Modelos.RANGER;
            this.priceHour = 25.0;
            this.priceDay = 299.0;
          
        } else if (auto == 6){
            this.automovel = Modelos.UP;
            this.priceHour = 7.99;
            this.priceDay = 89.90;
          
        }
        
    }

    
    public Modelos getAutomovel() {
        return automovel;
    }

    public Double getPriceDay() {
        return priceDay;
    }

    public Double getPriceHour() {
        return priceHour;
    }

 

    
}
