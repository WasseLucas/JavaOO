package estruturas_condicionais;

import java.util.Scanner;

//Fazer um programa para ler um valor inteiro de 1 a 7 representando um
//dia da semana (sendo 1=domingo, 2=segunda, e assim por diante).
//Escrever na tela o dia da semana correspondente, conforme exemplos.

public class ProblemaExemplo01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String dia;

        if ( x == 1 ){
            dia = "Domingo";
        }

        else if(x == 2){
            dia = "Segunda";
        }

        else if(x == 3){
            dia = "Terça";
        }

        else if(x == 4){
            dia = "Quarta";
        }

        else if(x == 5){
            dia = "Quinta";
        }

        else if(x == 6){
            dia = "Sexta";
        }

        else if(x == 7){
            dia = "Sábado";
        }

        else {
            dia = "valor inválido";
        }

        sc.close();
    }
}
