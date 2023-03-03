package jogo;

import java.io.IOException;
import java.util.Scanner;

public class menu {

static void printMenu() throws InterruptedException, IOException {
System.out.print("▀█████████▄     ▄████████     ███        ▄████████  ▄█          ▄█    █▄       ▄████████      ███▄▄▄▄      ▄████████  ▄█    █▄     ▄████████  ▄█      \n");
System.out.print("  ███    ███   ███    ███ ▀█████████▄   ███    ███ ███         ███    ███     ███    ███      ███▀▀▀██▄   ███    ███ ███    ███   ███    ███ ███      \n");
System.out.print("  ███    ███   ███    ███    ▀███▀▀██   ███    ███ ███         ███    ███     ███    ███      ███   ███   ███    ███ ███    ███   ███    ███ ███      \n");
System.out.print(" ▄███▄▄▄██▀    ███    ███     ███   ▀   ███    ███ ███        ▄███▄▄▄▄███▄▄   ███    ███      ███   ███   ███    ███ ███    ███   ███    ███ ███      \n");
System.out.print("▀▀███▀▀▀██▄  ▀███████████     ███     ▀███████████ ███       ▀▀███▀▀▀▀███▀  ▀███████████      ███   ███ ▀███████████ ███    ███ ▀███████████ ███      \n");
System.out.print("  ███    ██▄   ███    ███     ███       ███    ███ ███         ███    ███     ███    ███      ███   ███   ███    ███ ███    ███   ███    ███ ███      \n");
System.out.print("  ███    ███   ███    ███     ███       ███    ███ ███▌    ▄   ███    ███     ███    ███      ███   ███   ███    ███ ███    ███   ███    ███ ███▌    ▄\n");
System.out.print("▄█████████▀    ███    █▀     ▄████▀     ███    █▀  █████▄▄██   ███    █▀      ███    █▀        ▀█   █▀    ███    █▀   ▀██████▀    ███    █▀  █████▄▄██\n\n");

System.out.print("1 - JOGAR\n\n");
System.out.print("2 - TUTORIAL\n\n");
System.out.print("3 - RANKING\n");

Scanner sc5 = new Scanner(System.in);
int escolha = sc5.nextInt();


if(escolha == 1){jogo.game();}
else if(escolha == 2){tela1.tutorial();}
else if(escolha == 3){tela2.ranking();}


    }
}
