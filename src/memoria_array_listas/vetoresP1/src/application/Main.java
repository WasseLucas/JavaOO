package application;

import java.nio.file.attribute.AttributeView;
import java.util.Locale;
import java.util.Scanner;

//programa para ler média de altura , ultizando vetores;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i< n; i++){
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i =0; i < n; i++){
            sum += vect[i];
        }

        double avg = sum / n;
        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
        sc.close();
    }
}