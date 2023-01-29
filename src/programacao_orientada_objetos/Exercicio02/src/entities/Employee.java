package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax ;
    }

    public void increaseSalary(double percentagem){
        grossSalary += grossSalary * percentagem/100.0;
    }
    public String toString(){
        return name + ", $" + String.format("%.2f", netSalary());
    }
}

