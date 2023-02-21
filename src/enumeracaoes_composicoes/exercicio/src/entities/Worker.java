package entities;

import entities.enums.WorklLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private  String name;
    private  WorklLevel leve;
    private  Double baseSalary;


    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(){}

    public Worker(String name, WorklLevel leve, Double baseSalary, Department department) {
        this.name = name;
        this.leve = leve;
        this.baseSalary = baseSalary;
        this.department = department;
    }


    //Get and Set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorklLevel getLeve() {
        return leve;
    }

    public void setLeve(WorklLevel leve) {
        this.leve = leve;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public double income(int year, int month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract c : contracts){
            cal.setTime(c.getDate());
            int c_yaer = cal.get(Calendar.YEAR);
            int c_month =  1 + cal.get(Calendar.MONTH);
            if (year == c_yaer && month == c_month){
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
