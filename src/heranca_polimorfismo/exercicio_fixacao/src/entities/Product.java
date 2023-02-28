package entities;

import java.util.ArrayList;
import java.util.List;

public class Product {

    //Atributos
    private String name;
    private  Double price;


    public Product(){}

    public Product(String name, Double price){
        this.name =  name;
        this.price = price;
    }

    //Metodos Get e set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public String priceTag() {
        return name
                + " $"
                + String.format("%.2f", price);
    }
}