import java.util.Scanner;

public class EntradaDeDadosPart2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int x ;
        String s1,s2,s3;

        x = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.println();

        System.out.println("Dados Digitados: ");
        System.out.println();

        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
/*
 * Quando usa-se um comando de leitura diferente do nextLine()e 
 * da alguma quebra de linha, essa quebra de linha de fica "pendente"
 * na entra padrão.
 * Se você então fizer um nextLine(), aquela quebra de linha pendente
 * sera absorvida pelo nextLine().
 * 
 * Solução fazer um nextLine() extra antes de fazer o nextLine() de seu interesse.
 */