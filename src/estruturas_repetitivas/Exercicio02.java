package estruturas_repetitivas;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 2;
        int y = 0;

        while (x < 60){
            System.out.print(x);
            x = x * 2;
            y = y + 10;
        }
        sc.close();
    }
}
