package estruturas_condicionais;

import java.util.Scanner;

//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Digite um valor para verificar se é par ou impar. :");
        System.out.print("número: ");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par. ");
        } else {
            System.out.println("O número é impar.");
        }

        sc.close();
    }
}
