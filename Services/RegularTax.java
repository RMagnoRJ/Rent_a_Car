package Classes.Rent_a_Car.Services;

public class RegularTax implements TaxServices {
    
    public Double addBasicPayment(Double valor){

        if (valor < 100){
            return 0.20;
        } else {
            return 0.15;
        }
    }
    
}
