package estruturas_repetitivas;

import java.util.Scanner;

public class ProblemaEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int soma = 0;

        while (x != 0){
            soma += x;
            x = sc.nextInt();
        }

        System.out.print(soma);

        sc.close();
    }
}


// Resumo da aula

/* Estrutura repetitiva "Enquanto"
 * Recomendada quando não se sabe previamente a quantidaded de repstições
 * Regra:
 *    verdadeito: executa e volta
 *    Falso: pula fora
 * */