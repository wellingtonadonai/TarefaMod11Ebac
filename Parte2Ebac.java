import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parte2Ebac {


    public static void main(String[] args) {
        nomeHomemSeparado();
        nomeMulherSeparado();

    }

    private static void nomeHomemSeparado() {
        String nomesHomens = " Wellington = Homem, Benedito = Homem, Matheus = Homem, Tiago = Homem" ;
        String[] nomeSeparadoHomens = nomesHomens.split(",");

        List<String> Homens = new ArrayList<>();

        for (String nome : nomeSeparadoHomens ) {
            Homens.add(nome);
        }

        Collections.sort(Homens);

        for (String nome : Homens) {
            System.out.println(nome);


        }

        System.out.println("");
        System.out.println("********Lista de mulheres********** \n");
    }


    private static void nomeMulherSeparado() {

        String nomesMulheres = " Aline = Mulher, Carina = Mulher, Catia = Mulher, Sara = Mulher ";
        String[] nomeSeparadoM = nomesMulheres.split(",");

        List<String> Mulheres = new ArrayList<>();


        for (String nome : nomeSeparadoM ) {
            Mulheres.add(nome);
        }

        Collections.sort(Mulheres);

        for (String nome : Mulheres) {
            System.out.println(nome);


        }
    }

}







