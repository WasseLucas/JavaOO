package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        Product product = new Product(name,price,quantity);

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        product.addProducts(quantity);

        System.out.println();
        System.out.print("Update data: "+ product);

        System.out.println();
        System.out.println("Enter the numer of products to be removed from stock: ");
        quantity= sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updata data: "+ product);
        sc.close();
    }
}