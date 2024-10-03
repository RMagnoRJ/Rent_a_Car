package Classes.Rent_a_Car.Entities;

import java.time.Duration;
import java.time.LocalDateTime;


public class CarRental {
 
    private LocalDateTime start;
    private LocalDateTime finish;



    public CarRental(LocalDateTime start, LocalDateTime finish) {
        this.start = start;
        this.finish = finish;
    }

    public CarRental() {
    }




    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    


    public void showDiaria (){

        Duration dur = Duration.between(start, finish);
        long days = dur.toDays();
        long hour = dur.toHours() % 24;
        Long min = dur.toMinutes() & 60;
        

        if (hour < 12 && days == 0){
            if (min > 0){
                System.out.println("Horas = " + (hour + 1));
            } else {
                System.out.println("Horas = " + hour);
            }

        } else if (hour >= 12 && days == 0 ) {
            if (min > 0){
                System.out.println("Horas = " + (hour+1) + "\n (Acima de 12h <=> 1 Diária)");
            } else {
                System.out.println("Horas = " + hour + "\n (Acima de 12h <=> 1 Diária)");
            }

        } else if (hour == 0 && days == 1){
            System.out.println("Diária = " + days);
            
        } else if (hour > 0 && days >= 1) {
            System.out.println("Diária = " + days);
            if (min > 0){
                System.out.println("Horas = " + (hour + 1));
            } else {
                System.out.println("Horas = " + hour);
            }
            
        } else {
            System.out.println("Diária = " + days);
            if (min > 0){
                System.out.println("Horas = " + (hour + 1));
            } else {
                System.out.println("Horas = " + hour);
            }
        }

    }

}
