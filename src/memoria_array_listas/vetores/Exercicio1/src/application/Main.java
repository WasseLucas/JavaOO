package application;

//Problema "negativos"

//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Váriavel que vai referenciar o tamanho do vetor;
        int n;

        System.out.print("Quantos numero voce vai digitar?");
        n = sc.nextInt();

        int [] vetor = new int[n];

        for (int i = 0; i < vetor.length;i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");

        for (int i = 0; i< vetor.length; i++){
            if (vetor[i] < 0){
                System.out.printf("%d\n", vetor[i]);
            }
        }

        sc.close();
    }
}