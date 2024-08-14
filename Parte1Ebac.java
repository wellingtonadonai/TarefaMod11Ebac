import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parte1Ebac {

    public static void main(String[] args) {

        nomesImprimir();

        nomesOrdenadosImprimir();
    }



    private static void nomesImprimir() {

        List <String> lista = new ArrayList<>();
        System.out.println("***** Lista *****");

        lista.add("Wellington Henrique");
        lista.add("Elaine Oliveira");
        lista.add("Guilherme Augusto");
        lista.add("Helena Rosa");

        System.out.println(lista);
        System.out.println("");


    }
    private static void nomesOrdenadosImprimir() {

        List <String> listaordenada = new ArrayList<>();
        System.out.println("***** Lista ordenada *****");

        listaordenada.add("Wellington");
        listaordenada.add("Elaine Oliveira");
        listaordenada.add("Guilherme Augusto");
        listaordenada.add("Helena Rosa");
        Collections.sort(listaordenada);

        System.out.println(listaordenada);

    }
}
