import java.util.Locale;

/*
 * Com as variáveis abaixo produza a seguinte saida
 * 
 * Products:
 * Computer, which price is $ 2100,00
 * Office desk, which price is $ 650,00
 * 
 * Record: 30 years old, code 5290 and gender: 'F'
 * 
 * Measue with eight decimal places: 53,23456700
 * Rouded (there decimal places) : 53,235
 * US decimal point: 53.235 
 */
public class ExercicioSaidaDeDados {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        String product = "Computer";
        String product2 = "office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.0;
        double measure = 57.234567;

        //Resolução
        System.out.println();
        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f%n",product, price1);
        System.out.printf("%s, wich prince is $ %.2f%n",product2, price2);
        System.out.println();

        System.out.printf("Record: %d years old, code %d and gender: %c%n",age, code, gender );
        System.out.println();

        System.out.printf("Measue with eight decimal places: %.8f%n",measure);
        System.out.printf("Rouded ( there decimal places): %.3f%n", measure);
        System.out.printf("Us decimal point: %.3f%n",measure);
        System.out.println();
    }
}
