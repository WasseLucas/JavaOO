package estruturas_condicionais;

// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente.

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valorA; int valorB;

        System.out.println("Digite os valores de A e B para verificar se são multiplos:");

        System.out.print("valor A: ");
        valorA = sc.nextInt();

        System.out.print("Valor B: ");
        valorB = sc.nextByte();

        if (valorA % valorB == 0 || valorB % valorA == 0){
            System.out.println("São multiopls");
        }else {
            System.out.println("Não são multiplos");
        }

        sc.close();
    }
}
