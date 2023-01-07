package exercicio_for;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int fat = 1;

        for(int i = 1; i <= n; i++){
            fat = fat * i;
        }

        System.out.println(fat);

        sc.close();
    }
}
