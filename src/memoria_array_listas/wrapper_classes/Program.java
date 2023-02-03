package memoria_array_listas.wrapper_classes;




public class Program {
    public static void main(String[] args) {
        //Boxing é o processo de conversao de um objeto tipo valor para um objeto tipo referencia
        //compativel.


        //int x = 20;
        //Object obj = x;
        //System.out.println(obj);

        //Unboxing é o precesso de conversão de um objeto tipo referencia para um objeto tipo valor
        // compativel

        // int x = 20;

        //Object obj = x;
        //System.out.println(obj);
        //int y = (int)obj;
        //System.out.println(y);

        //Wrapprer classes => São classes que tem como objetivo tratar os tipos primitivos como classes, só que de forma
        //transparente ao compilador.
        //*Sao classes equivalentes ao tipos primitivos
        //* Boxing e unboxing é natural na linguagem
        //Uso comum:Campos de entidades em sistemas de informação
        //*pois tipos referencia(classes) aceitam valor null e usufruem dos recursos Orientaçao Objetos

        //ex

        int x = 20;
        Integer obj = x;
        System.out.println(obj);
        int y = obj * 2;
        System.out.println(y);

    }
}
