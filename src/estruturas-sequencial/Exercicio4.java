import java.util.Locale;
import java.util.Scanner;
/*
 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
 * hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
 * decimais.
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in);

        int numeroDeFuncionarios, horasTrabalhada;
        double valorHoraTrabalhada, salario;
        
        numeroDeFuncionarios = sc.nextInt();
        horasTrabalhada = sc.nextInt();
        valorHoraTrabalhada = sc.nextDouble();
        
        salario = horasTrabalhada * valorHoraTrabalhada;

        System.out.println("Number = " + numeroDeFuncionarios);
        System.out.printf("SALARY = $ %.2f%n", salario);

        sc.close();
    }
}
