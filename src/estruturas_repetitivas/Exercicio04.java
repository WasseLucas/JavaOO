package estruturas_repetitivas;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 0;

        while (x < 5){
           int y = x * 3;

            System.out.print(y);

            x = x + 1;
        }

        System.out.println("Fim");

        sc.close();
    }
}
