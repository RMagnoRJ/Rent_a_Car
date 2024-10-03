package Classes.Rent_a_Car.Entities;

import java.util.ArrayList;
import java.util.List;

public class GeneralList {

    
    private List <MasterClass> cadgeral = new ArrayList<>();



    public GeneralList() {
    }

    public GeneralList(List<MasterClass> cadgeral) {
        this.cadgeral = cadgeral;
    }



    public List<MasterClass> getCadgeral() {
        return cadgeral;
    }

    public void addCadastro (MasterClass cad){
        cadgeral.add(cad);
    }

    public void deleteCadastro (MasterClass cad){
        cadgeral.remove(cad);
    }

    public void showCadGeral(){

        for (int i = 0; i < cadgeral.size(); i++){

            System.out.println("\n === TICKET ====\n");
            System.out.println("REGISTRO Nº: " + cadgeral.get(i).getRegistro());
            System.out.println("\n === DESCRITIVO ===\n");
            System.out.println("AUTOMÓVEL: " + cadgeral.get(i).getAutoData().getAutomovel());
            System.out.println("Preço do dia (R$): " + cadgeral.get(i).getAutoData().getPriceDay());
            System.out.println("Preço da hora (R$): " + cadgeral.get(i).getAutoData().getPriceHour());
            System.out.println("\n === FATURADO ===\n");
            cadgeral.get(i).getRentData().showDiaria();
            System.out.println("\n === VALOR ===\n");
            System.out.println("Valor da locação (R$): " + String.format("%.2f", cadgeral.get(i).getPayData().getBasicPayment()));
            System.out.println("Valor do imposto (R$): " + String.format("%.0f", cadgeral.get(i).getPayData().getTax()) + "%");
            System.out.println("Valor TOTAL (R$): " + String.format("%.2f", cadgeral.get(i).getPayData().geraTotalPayment()));

            System.out.println("\n*****************************\n");
        }

    }

    public void searchCad(int search){

        boolean found = false;

        for (int i = 0; i < cadgeral.size(); i++){

            if (cadgeral.get(i).getRegistro() == search){
                found = true;
                System.out.println("\n === TICKET ====\n");
                System.out.println("REGISTRO Nº: " + cadgeral.get(i).getRegistro());
                System.out.println("\n === DESCRITIVO ===\n");
                System.out.println("AUTOMÓVEL: " + cadgeral.get(i).getAutoData().getAutomovel());
                System.out.println("Preço do dia (R$): " + cadgeral.get(i).getAutoData().getPriceDay());
                System.out.println("Preço da hora (R$): " + cadgeral.get(i).getAutoData().getPriceHour());
                System.out.println("\n === FATURADO ===\n");
                cadgeral.get(i).getRentData().showDiaria();
                System.out.println("\n === VALOR ===\n");
                System.out.println("Valor da locação (R$): " + String.format("%.2f", cadgeral.get(i).getPayData().getBasicPayment()));
                System.out.println("Valor do imposto (R$): " + String.format("%.0f", cadgeral.get(i).getPayData().getTax()) + "%");
                System.out.println("Valor TOTAL (R$): " + String.format("%.2f", cadgeral.get(i).getPayData().geraTotalPayment()));
            }
        }
        if (found == false){
            System.out.println("\n### NENHUM RESULTADO ENCONTRADO ###\n");
        }

    }

    public void showCad(){

        
            System.out.println("\n === TICKET ====\n");
            System.out.println("REGISTRO Nº: " + cadgeral.getLast().getRegistro());
            System.out.println("\n === DESCRITIVO ===\n");
            System.out.println("AUTOMÓVEL: " + cadgeral.getLast().getAutoData().getAutomovel());
            System.out.println("Preço do dia (R$): " + cadgeral.getLast().getAutoData().getPriceDay());
            System.out.println("Preço da hora (R$): " + cadgeral.getLast().getAutoData().getPriceHour());
            System.out.println("\n === FATURADO ===\n");
            cadgeral.getLast().getRentData().showDiaria();
            System.out.println("\n === VALOR ===\n");
            System.out.println("Valor da locação (R$): " + String.format("%.2f", cadgeral.getLast().getPayData().getBasicPayment()));
            System.out.println("Valor do imposto (R$): " + String.format("%.0f", cadgeral.getLast().getPayData().getTax()) + "%");
            System.out.println("Valor TOTAL (R$): " + String.format("%.2f", cadgeral.getLast().getPayData().geraTotalPayment()));

        

    }

    
    
}
