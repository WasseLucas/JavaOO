package entities;

public class Rectangle {


    public double width;
    public double height;


    // calcula area de um retangulo;
    public double area(){
       return width * height;
    };

    //Calcula o perimento de um retangulo;
    public double perimeter(){
        return 2* (width + height);
    };

    // Calcula diagonal do retangulo
    public double diagonal( ){
        return Math.sqrt(width * width + height * height);
    }

}
