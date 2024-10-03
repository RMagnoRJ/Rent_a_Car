package Classes.Rent_a_Car.Application;

import java.time.LocalDateTime;
import java.util.Scanner;

import Classes.Rent_a_Car.Entities.CarRental;
import Classes.Rent_a_Car.Entities.GeneralList;
import Classes.Rent_a_Car.Entities.MasterClass;
import Classes.Rent_a_Car.Entities.Ticket;
import Classes.Rent_a_Car.Entities.Vehicle;
import Classes.Rent_a_Car.Enum.Modelos;
import Classes.Rent_a_Car.Services.PromoTax;
import Classes.Rent_a_Car.Services.RegularTax;

public class Program {

    public static void main(String[] args) {

        // Aula 166 - Programa Rent a Car

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("                      RENT A CAR                     ");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n");
        GeneralList novoCadastro = new GeneralList();
        Scanner inn = new Scanner(System.in);

        boolean continuar = true;

        while (continuar == true) {

            int menu = 0;

            System.out.println("\n      **********");
            System.out.println("      |  MENU  |");
            System.out.println("      **********");

            System.out.print("\n[1] Cadastrar aluguel\n" +
                    "[2] Buscar aluguel\n" +
                    "[3] Cadastro geral\n" +
                    "[4] Encerrar programa\n" +
                    "\n> ");
            menu = inn.nextInt();
            inn.nextLine();

            switch (menu) {

                case 1:
                    System.out.print("\nSelecione o MODELO: \n\n");
                    int cont = 1;
                    for (Modelos model : Modelos.values()) {
                        System.out.println("[" + cont + "] " + model);
                        cont++;
                    }
                    System.out.print("\n> ");
                    int auto = inn.nextInt();
                    inn.nextLine();
                    Ticket reg = new Ticket();
                    int registro = reg.gerarTicket(7);
                    Vehicle novoAuto = new Vehicle(auto);

                    System.out.println("\n === DATA RETIRADA === \n");
                    System.out.print("Dia: ");
                    int dia = inn.nextInt();
                    inn.nextLine();
                    System.out.print("Mês: ");
                    int mes = inn.nextInt();
                    inn.nextLine();
                    System.out.print("Ano: ");
                    int ano = inn.nextInt();
                    inn.nextLine();

                    System.out.println("\n === HORARIO === \n");
                    System.out.print("Hora: ");
                    int hora = inn.nextInt();
                    inn.nextLine();
                    System.out.print("Minuto: ");
                    int min = inn.nextInt();
                    inn.nextLine();

                    LocalDateTime start = LocalDateTime.of(ano, mes, dia, hora, min);

                    System.out.println("\n === DATA DEVOLUÇÃO === \n");
                    System.out.print("Dia: ");
                    int diaDev = inn.nextInt();
                    inn.nextLine();
                    System.out.print("Mês: ");
                    int mesDev = inn.nextInt();
                    inn.nextLine();
                    System.out.print("Ano: ");
                    int anoDev = inn.nextInt();
                    inn.nextLine();

                    System.out.println("\n === HORARIO === \n");
                    System.out.print("Hora: ");
                    int horaDev = inn.nextInt();
                    inn.nextLine();
                    System.out.print("Minuto: ");
                    int minDev = inn.nextInt();
                    inn.nextLine();

                    LocalDateTime finish = LocalDateTime.of(anoDev, mesDev, diaDev, horaDev, minDev);
                    CarRental aluguel = new CarRental(start, finish);

                    if (auto == 3 || auto == 6){
                        MasterClass novoCadAuto = new MasterClass(registro, novoAuto, aluguel, new PromoTax());    
                        novoCadastro.addCadastro(novoCadAuto);
                    } else {
                        MasterClass novoCadAuto = new MasterClass(registro, novoAuto, aluguel, new RegularTax());    
                        novoCadastro.addCadastro(novoCadAuto);
                    }
                    
                    System.out.println("\n ###  CADASTRO REALIZADO COM SUCESSO ### \n");
                    novoCadastro.showCad();
                    break;

                case 2:
                    System.out.println("\n ###  BUSCA TICKET ### \n");
                    System.out.print("Digite o número do ticket: ");
                    int ticket = inn.nextInt(); inn.nextLine();
                    novoCadastro.searchCad(ticket);
                    System.out.println("\n ###  FIM DA BUSCA ### \n");
                    break;

                case 3:
                    System.out.println("\n ###  CADASTRO GERAL ### \n");
                    novoCadastro.showCadGeral();
                    System.out.println("\n ###  FIM DO CADASTRO ### \n");
                    break;

                case 4:
                    continuar = false;
                    break;
            }
            
        }

        System.out.println("\n=== END PROGRAM === \n");
        inn.close();
    }
}
