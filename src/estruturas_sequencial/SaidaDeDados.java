import java.util.Locale;

public class SaidaDeDados{
    public static void main(String[] args) {

        System.out.println(" Hello World");
        System.out.println("Good Morning");

        int y = 32;
        double x =10.234432;
        System.out.println(y);
        System.out.printf("%.2f%n",x); // Imprimindo valor de x com 2 casas decimais
        System.out.printf("%.4f%n",x); // Imprimindo o valor de x com 4 casas decimais
        Locale.setDefault(Locale.US);

        /*
         * Para Concatenar vário elementos em um mesmo comando de escrita
         */
        System.out.println("Resultado = " + x + "Metros");

        /*
         * Para Concatenar vário elementos em um mesmo comando de escrita
         * Usando Printf
         */

         System.out.printf("Resultado = %.2f mestro%n", x);
            System.out.println();
         //Exemplo
         String nome ="Maria";
         int idade = 32;
         double renda = 4000.0;
         System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade,renda);
    }
}