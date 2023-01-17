import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

/*
        Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
        válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
        possui a maior área.
        A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a
        seguinte (fórmula de Heron).
 */

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measure of the triangle x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measure of the triangle y; ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c)/2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c)/2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle y area: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Larger area: X");
        }
        else {
            System.out.println("Larger area: Y");
        }


        sc.close();
    }
}