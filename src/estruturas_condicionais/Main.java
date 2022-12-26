package estruturas_condicionais;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hora;

        System.out.println("Quantas horas?");
        hora= sc.nextInt();

        if (hora >=5 && hora <=12 ){
            System.out.println("Bom dia!");
        }
            else if(hora > 12 && hora <18){
            System.out.println("Boa tarde");
        }
            else if (hora >=18 && hora <=24){
            System.out.println("Boa noite!");
        }
            else if (hora >=0 && hora <=5) {
            System.out.println("Boa madrugada!");
        }
            else if (hora >24){
            System.out.println("Hora incorreta");
        }

        sc.close();
    }
}
