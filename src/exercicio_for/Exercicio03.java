package exercicio_for;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i =0; i < n; i++) {
            double teste1 = sc.nextDouble();
            double teste2 = sc.nextDouble();
            double teste3 = sc.nextDouble();

            double media = ( teste1 * 2.0 + teste2 * 3.0 + teste3 * 5.0)/10 ; //calcula média dos testes

            System.out.printf("%.1f%n",media);
        }

        sc.close();
    }
}
