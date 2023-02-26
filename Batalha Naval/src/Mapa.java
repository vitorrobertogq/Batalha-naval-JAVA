import java.io.IOException;

public class Mapa {
    
    //printar o mapa (array de inteiros sendo 1 para a posiçao com navios e 0 para a sem navios)
    static void mapa1(int[] meusNavios,int[] naviosInimigos) {
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
                else {System.out.print("     |");}}
            System.out.print("           ");
            System.out.print("  " + letras[i] + " |");
            for(int j =0;j < 10;j++){
                if(naviosInimigos[(i*10) +j ] == 1){
                System.out.print("  N  |");}
                else {System.out.print("     |");}}
            System.out.print("\n              " + espaco + "               " + espaco + "\n");
        }
        System.out.print("              " + contorno + "               " + contorno + "\n");
        System.out.print("                 1     2     3     4     5     6     7     8     9     10" + "                    " + "1     2     3     4     5     6     7     8     9     10");

      }     
    
    //funçao para limpar o console
    static void clear() throws InterruptedException, IOException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public static void main(String [] args) throws InterruptedException, IOException {
        int[] tes = new int[100];
        int[] tes1 = new int[100];
        for(int i = 0;i < 100;i++){
            tes[i] = 0;
            tes1[i] = 0;}
        clear();
        mapa1(tes,tes1);
      
}}
