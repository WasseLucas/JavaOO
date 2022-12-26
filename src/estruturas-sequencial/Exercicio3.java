import java.util.Locale;
import java.util.Scanner;

/*
 *  Fazer um programa para ler quatro valores inteiros A, B, C e D.
 *  A seguir, calcule e mostre a diferença do produto
 *  de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 */

public class Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A, B, C, D, DIF;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        DIF = (A * B)-(C * D);

        System.out.println("A DIFERENÇA = " + DIF);

        sc.close();
    };
};
