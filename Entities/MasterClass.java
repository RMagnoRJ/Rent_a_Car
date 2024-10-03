package Classes.Rent_a_Car.Entities;

import java.time.Duration;

import Classes.Rent_a_Car.Services.TaxServices;

public class MasterClass {
    
    private Integer registro;
    private Vehicle autoData;
    private CarRental rentData;
    private Invoice payData;

    public MasterClass() {
    }

    public MasterClass(Integer registro, Vehicle autoData, CarRental rentData, TaxServices tax) {
        this.registro = registro;
        this.autoData = autoData;
        this.rentData = rentData;
        
        payData = new Invoice();
        Duration dur = Duration.between(rentData.getStart(), rentData.getFinish());
        Long days = dur.toDays();
        Long hour = dur.toHours() % 24;
        Long min = dur.toMinutes() & 60;
       
        Double pgBasico = 0.0;

        int dayInt =  Math.toIntExact(days);
        int hourInt =  Math.toIntExact(hour);
        int minInt = Math.toIntExact(min);

        if (hourInt < 12 && dayInt == 0){
            Double horaRent = autoData.getPriceHour();
            if (minInt > 0){
                pgBasico = horaRent * (hourInt + 1);
            } else {
                pgBasico = horaRent * hourInt;
            }
            

        } else if (hourInt >= 12 && dayInt == 0 ) {
            dayInt = dayInt + 1;
            hourInt = 0;
            Double diaRent = autoData.getPriceDay();
            pgBasico = diaRent;

        } else if (hourInt == 0 && dayInt == 1){
            Double diaRent = autoData.getPriceDay();
            pgBasico = diaRent * dayInt;

        } else if ((hourInt == 0 && dayInt >= 1) || (hourInt > 0 && dayInt >= 1) ) {
     
            if (minInt > 0){
                hourInt = hourInt + 1;
            } 
            Double diaRent = autoData.getPriceDay();
            Double horaRent = autoData.getPriceHour();
            Double totalrent = (diaRent * dayInt) + (horaRent * hourInt);
            pgBasico = totalrent;
        }
        Double taxa = tax.addBasicPayment(pgBasico);
        payData.setPaymentData(pgBasico, taxa);
        
    }    


    
    public Vehicle getAutoData() {
        return autoData;
    }

    public CarRental getRentData() {
        return rentData;
    }

    public Invoice getPayData() {
        return payData;
    }

    public Integer getRegistro() {
        return registro;
    }

   
  
}
