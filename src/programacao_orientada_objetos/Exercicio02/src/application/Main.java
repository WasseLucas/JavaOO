package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
//seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
//salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
//afetado pela porcentagem) e mostrar novamente os dados do funcionário.

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();
        System.out.print("Name: ");
        emp.name = sc.nextLine();
        System.out.print("Gross salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.print("Employee: " + emp);
        System.out.println();
        System.out.print("Wich percentagem to increase salary? ");
        double percentagem = sc.nextDouble();
        emp.increaseSalary(percentagem);

        System.out.println();
        System.out.println("Updated data: "+ emp);
        sc.close();
    }
}