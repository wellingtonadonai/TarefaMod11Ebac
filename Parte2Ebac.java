import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parte2Ebac {

    public static void main(String[] args) {

        String nomes = " Wellington = H, Aline = M, Benedito = H, Carina = M ";



        String[] nomeSeparado = nomes.split(",");




        List<String> separandoNomes = new ArrayList<>();


        for (String nome : nomeSeparado ) {
            separandoNomes.add(nome);
        }



        Collections.sort(separandoNomes);


        for (String nome : separandoNomes) {
            System.out.println(nome);
        }
    }
}






