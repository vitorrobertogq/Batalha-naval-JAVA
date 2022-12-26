package arquivos;
import java.io.IOException;

public class Mapa {
   
    static void map() {
        String contorno = "+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+\n";
        String espaco = "|     |     |     |     |     |     |     |     |     |     |\n";
        boolean[] navios = {false,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false};

        char[] letras = {'A','B','C','D','E','F','G','H','I','J'};

        for(int i = 0; i < 10 ;i++) {
            System.out.print("  " +contorno);
            System.out.print("  " + espaco);
            System.out.print(letras[i] + " |");
            for(int j =0;j < 10;j++){
                if(navios[(i*10) +j ]){
                System.out.print("  N  |");}
                else {System.out.print("     |");}}
            System.out.print("\n  " + espaco);
        }
        System.out.print("  " +contorno);
        System.out.print("     1     2     3     4     5     6     7     8     9     10");

      }     
    
    void clear() throws InterruptedException, IOException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public static void main(String[] args) {
        map();
    }
}
