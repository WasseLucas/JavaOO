package exercicio_for;

import java.util.Locale;
import java.util.Scanner;

//Ler um número inteiro N e calcular todos os seus divisores.

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            if ( n % 2 == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
