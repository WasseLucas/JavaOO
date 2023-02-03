package application;
//Problema "soma_vetor".
//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//- Imprimir todos os elementos do vetor
//- Mostrar na tela a soma e a média dos elementos do vetor

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double soma,media;

        System.out.print("Quantos números voce vai digitar: ");
        n = sc.nextInt();

        double [] vetor = new double[n];

        //For criado para referenciar um valor dentro do vetor
        for (int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            vetor[i]= sc.nextDouble();
        }

        soma =0;
        //For para realizar a soma dos vetores
        for (int i = 0; i < n; i++){
            soma = soma + vetor[i];
        }

        media = soma / n;

        System.out.print("O VALORES= ");

        for (int i = 0; i < n; i++){
            System.out.printf("%.1f  ", vetor[i]);
        }

        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);

        sc.close();
    }
}