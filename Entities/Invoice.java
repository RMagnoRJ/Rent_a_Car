package Classes.Rent_a_Car.Entities;



public class Invoice {
    
    private Double basicPayment;
    private Double tax;


    public Invoice() {
               
    }


    public Double getBasicPayment() {
        return basicPayment;
    }

    public Double getTax() {
        return tax * 100;
    }


    public Double geraTotalPayment(){

        return basicPayment + (basicPayment * tax);
    }


    public void setPaymentData(Double valor, Double taxa) {
        this.tax  = taxa;
        this.basicPayment = valor;
    }
 

}
