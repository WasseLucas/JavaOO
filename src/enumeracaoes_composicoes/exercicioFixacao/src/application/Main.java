package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

//Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um
//sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser
//o instante do sistema: new Date()

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy ");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date ( DD/MM/YYYY ): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate );

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());


        Order order = new Order(new Date(),status,client);

        System.out.print("How many item to this order? ");
        int n = sc.nextInt();

        for (int i = 1;i < n; i++ ){
            System.out.println("Enter #" + n + "item data: ");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            sc.nextLine();
            double productPrice = sc.nextInt();
            System.out.print("Quantity: ");
            int productQuantity =  sc.nextInt();
            sc.nextLine();

            Product product = new Product(productName,productPrice);

            OrderItem it = new OrderItem(productQuantity,productPrice,product);
        }

        System.out.println();
        System.out.println(order);

        sc.close();
    }
}