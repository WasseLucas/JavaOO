package memoria_array_listas.for_each;

public class Program {
    public static void main(String[] args) {

        String [] vect = new String[]{"Maria","Bob","Tobirama"};

        for (int i = 0; i < vect.length; i++){
            System.out.println(vect[i]);
        }
        System.out.println("---------------------");
        for (String obj : vect){
            System.out.println(obj);
        }

    }
}
