
//Restrições para nomes de variáveis
//• Não pode começar com dígito: use uma letra ou _
//• Não usar acentos ou til
//• Não pode ter espaço em branco
//• Sugestão: use nomes que tenham um significado

// Errado :                                        Correto
// int 5minutos;                                 int _5minutos;
// int salário;                                  int salario;
// int salario do funcionario                    int salarioDoFuncionario;

//Convenções
//• Camel Case: lastName
//• pacotes
//• atributos
//• métodos
//• variáveis e parâmetros
//• Pascal Case: ProductService
//• classes

package topicosBasicosEmJava; //entities

public class Account {
    private String holder;
    private Double balance;

    public Account( String holder, Double balance){
        this.holder = holder;
        this.balance = balance;
    }

    public String getHolder(){
        return holder;
    }

    public void deposit (double amount){
        balance = balance + amount;
    }

    public void  withdraw(double amount){
        balance = balance - amount;
    }
}
