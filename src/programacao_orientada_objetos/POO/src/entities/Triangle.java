package entities;

import java.util.Locale;
import java.util.Scanner;

public class Triangle {
    public double a;
    public double b;
    public double c;

    //Função para calcular area de um triangulo
    public double area(){
        double p = (a + b + c)/2.0;
        return Math.sqrt(p * (p-a)*(p-b)*(p-c));
    };

}
