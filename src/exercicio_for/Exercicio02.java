package exercicio_for;

//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 1; i < n; i++){
           int x = sc.nextInt();
           if (x <= 10 && x <= 20){
               in = in + 1;
           }else {
               out = out + 1;
           }
        }

        sc.close();
    }
}
