import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //String x = sc.next();
        //int x = sc.nextInt();
        //double x = sc.nextDouble();
        //System.out.printf("Vocẽ digitou: %.2f%n", x);

        // char a;
        //a = sc.next().charAt(0);
        //System.out.println("Voce digitou: "+a);

        String x;
        int y;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();
    }
}
