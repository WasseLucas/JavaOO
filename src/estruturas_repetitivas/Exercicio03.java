package estruturas_repetitivas;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 100;
        int y = 100;

        while (x != y){
            System.out.print("Olha");

            x = (int) Math.sqrt(y);
        }

        sc.close();
    }
}
