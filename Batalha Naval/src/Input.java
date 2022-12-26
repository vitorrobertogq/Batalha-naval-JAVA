import java.io.IOException;
import java.util.Scanner;
import java.util.spi.CurrencyNameProvider;
public class Input {
    static void clear() throws InterruptedException, IOException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    static void printVez(int jogador){
        System.out.println("É a vez do jogador " + jogador);
    }

    public static void main(String[] args) throws InterruptedException, IOException{
        Scanner scanner = new Scanner(System.in);
        clear();
        printVez(1);
        System.out.println("Digite continuar para continuar");
        String currentInput = scanner.nextLine();
        if(currentInput.equals("continuar"))
        {
            //printar o mapa
            clear();
            System.out.println("A");
        }

        
        scanner.close();

    }
}
