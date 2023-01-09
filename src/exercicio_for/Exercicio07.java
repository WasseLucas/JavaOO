package exercicio_for;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){

            int primeiro = i;
            int segundo = i * i;
            int terceito = i * i * i;

            System.out.printf("%d %d %d%n", primeiro, segundo, terceito);
        }

        sc.close();
    }
}
