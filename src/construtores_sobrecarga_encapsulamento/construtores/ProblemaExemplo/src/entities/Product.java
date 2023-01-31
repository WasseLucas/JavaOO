package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    //constutor
    public Product(String name, double price, int quantity){
        this.name = this.name;
        this.price = this.price;
        this.quantity = this.quantity;
    }

    public double totalValueInStock(){
        return  price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity = quantity + quantity;
    }

    public void  removeProducts(int quantity){
        this.quantity = quantity - quantity;
    }
}
