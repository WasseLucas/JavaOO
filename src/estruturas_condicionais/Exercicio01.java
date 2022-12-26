package estruturas_condicionais;

import java.util.Scanner;

public class Exercicio01 {

    // Fazer um programa para ler um número inteiro, e depois dizer se é negativo ou não.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número:");
        numero = sc.nextInt();

        if (numero < 0){
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NÃO NEGATIVO");
        }

        sc.close();
    }
}
