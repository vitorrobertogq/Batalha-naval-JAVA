package jogo;
import java.io.IOException;



public class mapa{
    static void clear() throws InterruptedException, IOException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
    //printar o mapa (array de inteiros sendo 1 para a posiçao com navios e 0 para a sem navios)
    static void imprimirMapa(int[] meusNavios,int[] naviosInimigos) throws InterruptedException, IOException {
        clear();


        String contorno = "+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+";
        String espaco = "|     |     |     |     |     |     |     |     |     |     |";

        char[] letras = {'A','B','C','D','E','F','G','H','I','J'};

        System.out.println("\n\n\n"+"                                     Mapa de Defesa                                                              Mapa de Ataque"+ "\n\n\n");
        for(int i = 0; i < 10 ;i++) {
            System.out.print("              " + contorno + "               " + contorno + "\n");
            System.out.print("              " + espaco + "               " + espaco + "\n");
            System.out.print("            " + letras[i] + " |");
            for(int j =0;j < 10;j++){

                if(meusNavios[(i*10) +j ] == 1){
                System.out.print("  N  |");}
                else if(meusNavios[(i*10) +j ] == 2){
                System.out.print("  D  |");}
                else if(naviosInimigos[(i*10) +j ] == 3) {
                System.out.print("  -  |");}
                else {System.out.print("     |");}}

            System.out.print("           ");
            System.out.print("  " + letras[i] + " |");
            for(int j =0;j < 10;j++){

                if(naviosInimigos[(i*10) +j ] == 2){
                System.out.print("  D  |");}
                else if(naviosInimigos[(i*10) +j ] == 3) {
                System.out.print("  -  |");}
                else {System.out.print("     |");}}

            System.out.print("\n              " + espaco + "               " + espaco + "\n");
        }
        System.out.print("              " + contorno + "               " + contorno + "\n");
        System.out.print("                 1     2     3     4     5     6     7     8     9     10" + "                    " + "1     2     3     4     5     6     7     8     9     10\n\n");
      }     
}
