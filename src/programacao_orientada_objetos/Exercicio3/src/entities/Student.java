package entities;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    //Calcula as notas do trimestre
    public double finalGrade(){
        return grade1 + grade2 + grade3;
    }

    //Calcula a nota final do grande do aluno
    public double missingPoints(){
        if(finalGrade() < 60.0){
            return 60.0 -finalGrade();
        }
        else {
            return 0.0;
        }
    }



}
