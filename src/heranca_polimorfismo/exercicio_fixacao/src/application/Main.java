package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int numProduct = sc.nextInt();

        for (int i = 1; i <= numProduct; i++){
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported: (c/u/i)");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String nameProduct = sc.nextLine();
            System.out.print("Price: ");
            double priceProduct = sc.nextDouble();

            if (type == 'c'){
                list.add(new Product(nameProduct,priceProduct));

            } else if (type == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(nameProduct, priceProduct ,date));
            }else {
                System.out.print("Customs free: ");
                double customsFree = sc.nextDouble();
                list.add(new ImportedProduct(nameProduct,priceProduct,customsFree));
            }

        }

        System.out.println();
        System.out.println("Price tags");
        for (Product prod: list){
            System.out.println(prod.priceTag());
        }

        sc.close();
    }
}