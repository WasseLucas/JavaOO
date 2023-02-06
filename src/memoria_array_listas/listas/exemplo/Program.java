package memoria_array_listas.listas.exemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        //List interface        ArrayList complementação da lista
        List<String> list = new ArrayList<>();

        //Como adicionar elemento
        list.add("Maria");
        list.add("Joana");
        list.add("Luana");
        list.add(2,"Milena");
        list.add("Marcia");
        //imprime o tamanho da lista
        System.out.println(list.size());
        //imprimindo os elementos da lista
        for (String m : list){
            System.out.println(m);
        }
        //operaçao para remover o dado apartir da comparaçao do elemento
        //list.remove("Joana");
        //operaçao para remover o dado apartir da sua posiçao da lista
        //list.remove(1);
        System.out.println("-------------------------");

        //remoção por predicado
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list){
            System.out.println(x);
        }
        //Operação para buscar elemento da lista  index.of
        System.out.println("--------------------------");
        System.out.println("Index of Luana "+ list.indexOf("Luana"));
        System.out.println("Index of Marco "+ list.indexOf("Marco"));

        //Operaçao para filtrar elementos da lista
        System.out.println("---------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : result){
            System.out.println(x);
        }

        System.out.println("-----------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null);
        System.out.println(name);
    }
}
