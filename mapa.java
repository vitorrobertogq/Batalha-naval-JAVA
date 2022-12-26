import java.io.IOException;

class mapa {
    //APENAS O DESENHO DO MAPA
   
    static void map(int x,int y,int coluna) {
        String contorno = "+-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+\n";
        String espaco = "|     |     |     |     |     |     |     |     |     |     |\n";

        char[] letras = {'A','B','C','D','E','F','G','H','I','J'};

        for(int i = 0; i < coluna ;i++) {
            System.out.print("  " +contorno);
            System.out.print("  " + espaco);
            System.out.print(letras[i] + " " + espaco);
            System.out.print("  " + espaco);
        }
        System.out.print("  " +contorno);
        System.out.print("     1     2     3     4     5     6     7     8     9     10");

      }     
    
    static void clear() throws InterruptedException, IOException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public static void main(String args[]) throws InterruptedException, IOException {
        map(0,0,10);
        clear();
        
    }
}
