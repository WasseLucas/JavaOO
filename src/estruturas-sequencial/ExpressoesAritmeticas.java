/* 
    Operadores
    +  = Soma
    - = Subtração
    * = Multiplicação
    / = Divisão
    % = Resto da divisão
*/
public class ExpressoesAritmeticas {
    public static void main(String[] args) {

        //Exemplos
        int num1 = 2; int num2 = 3; int num3 = 5; int num4 = 20; int resultado;

        //Adição
        System.out.println("Adição");
        resultado = num2 + num3 ;
        System.out.println("A soma de num2 + num3"); // Resultado esperado 8
        System.out.println("O resultado foi = "+ resultado);
        System.out.println();

        //Subtração
        System.out.println("Subtração");
        resultado = num3 - num1;
        System.out.println("A subtração de num3 - num1"); // Resultado esperado 3
        System.out.println("O resultado foi = " +resultado);
        System.out.println();

        //multiplicação
        System.out.println("Multiplicação");
        resultado = num3 * num1;
        System.out.println("A multiplicação entre num3 * num1"); //Resultado esperado 10
        System.out.println("O resultado foi = " + resultado);
        System.out.println();

        //Divisão
        System.out.println("Divisao");
        resultado = num4 / num1;
        System.out.println("O resultado da divisão entre num4 / num1"); //Resultado esperado 10
        System.out.println("O resultado foi = " + resultado);
        System.out.println();

    }
}