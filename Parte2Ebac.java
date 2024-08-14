public class Parte2Ebac {

    public static void main(String[] args) {


        String nomesMasculinos = "Wellington = H,Aline = M ,Joao = H ,Carina = M";
        String nomesFemeninos = "Wellington = H,Aline = M ,Joao = H ,Carina = M";


        String[] masculino = nomesMasculinos.split(",");

        System.out.println("***** NomesMasculinos *****");

        System.out.println( "nomes: " + masculino[0]);
        System.out.println( "nomes: " + masculino [2]);

        System.out.println("");

        String[] femenino = nomesFemeninos.split(",");

        System.out.println("***** NomesFemininos ******");

        System.out.println( "nomes: " + femenino[1]);
        System.out.println( "nomes: " + femenino[3]);






    }
}










