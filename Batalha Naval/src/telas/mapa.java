package telas;
import java.io.IOException;



public class mapa{
    public static void clear() throws InterruptedException, IOException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
    //printar o mapa (10 = TIRO NA AGUA,9 = ESTRUTURAS DESTRUIDAS, 8 = PORTA-AVIAO,7 = NAVIO DE 4 CANOS,6 e 5 = NAVIOS DE 3 CANOS,4,3 e 2 = NAVIOS DE 2 CANOS,1 = NAVIO DE 1 CANOS E 0 = POSICAO SEM NAVIO)
    public static void imprimirMapa(int[] meusNavios,int[] naviosInimigos) throws InterruptedException, IOException {
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

                if(meusNavios[(i*10) +j ] == 0){
                System.out.print("     |");}
                else if(meusNavios[(i*10) +j ] == 9){
                System.out.print("  D  |");}
                else if(meusNavios[(i*10) +j ] == 10) {
                System.out.print("  -  |");}
                else {System.out.print("  N  |");}}

            System.out.print("           ");
            System.out.print("  " + letras[i] + " |");
            for(int j =0;j < 10;j++){

                if(naviosInimigos[(i*10) +j ] == 9){
                System.out.print("  D  |");}
                else if(naviosInimigos[(i*10) +j ] == 10) {
                System.out.print("  -  |");}
                else {System.out.print("     |");}}

            System.out.print("\n              " + espaco + "               " + espaco + "\n");
        }
        System.out.print("              " + contorno + "               " + contorno + "\n");
        System.out.print("                 1     2     3     4     5     6     7     8     9     10" + "                    " + "1     2     3     4     5     6     7     8     9     10\n\n");
      }     
}
