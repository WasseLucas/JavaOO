import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
 * código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */
public class Exercicio5 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigoPeca1,codigoPeca2,numeroPeca1,numeroPeca2;
        double valorUnitario1,valorUnitario2, valorTotal;

        codigoPeca1 = sc.nextInt();
        numeroPeca1 = sc.nextInt();
        valorUnitario1 = sc.nextDouble();

        codigoPeca2 = sc.nextInt();
        numeroPeca2 = sc.nextInt();
        valorUnitario2 = sc.nextDouble();

        valorTotal = numeroPeca1 * valorUnitario1 + numeroPeca2 * valorUnitario2;
        
        System.out.printf("VALOR A PAGAR : $ %.2f%n",valorTotal);

        sc.close();
    }
}
