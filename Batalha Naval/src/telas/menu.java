package telas;


import java.io.IOException;
import java.util.Scanner;

import jogo.jogo;


public class menu {

tela1 tutorial = new tela1();
tela2 ranking = new tela2();
jogo jogo = new jogo();


//PRINT DO MENU E INPUT DA ESCOLHA DO USUARIO
public void printMenu() throws InterruptedException, IOException{
System.out.print("▀█████████▄     ▄████████     ███        ▄████████  ▄█          ▄█    █▄       ▄████████      ███▄▄▄▄      ▄████████  ▄█    █▄     ▄████████  ▄█      \n");
System.out.print("  ███    ███   ███    ███ ▀█████████▄   ███    ███ ███         ███    ███     ███    ███      ███▀▀▀██▄   ███    ███ ███    ███   ███    ███ ███      \n");
System.out.print("  ███    ███   ███    ███    ▀███▀▀██   ███    ███ ███         ███    ███     ███    ███      ███   ███   ███    ███ ███    ███   ███    ███ ███      \n");
System.out.print(" ▄███▄▄▄██▀    ███    ███     ███   ▀   ███    ███ ███        ▄███▄▄▄▄███▄▄   ███    ███      ███   ███   ███    ███ ███    ███   ███    ███ ███      \n");
System.out.print("▀▀███▀▀▀██▄  ▀███████████     ███     ▀███████████ ███       ▀▀███▀▀▀▀███▀  ▀███████████      ███   ███ ▀███████████ ███    ███ ▀███████████ ███      \n");
System.out.print("  ███    ██▄   ███    ███     ███       ███    ███ ███         ███    ███     ███    ███      ███   ███   ███    ███ ███    ███   ███    ███ ███      \n");
System.out.print("  ███    ███   ███    ███     ███       ███    ███ ███     ▄   ███    ███     ███    ███      ███   ███   ███    ███ ███    ███   ███    ███ ███▌    ▄\n");
System.out.print("▄█████████▀    ███    █▀     ▄████▀     ███    █▀  █████▄▄██   ███    █▀      ███    █▀        ▀█   █▀    ███    █▀   ▀██████▀    ███    █▀  █████▄▄██\n\n");

System.out.print("1 - JOGAR\n\n");
System.out.print("2 - TUTORIAL\n\n");//AINDA SEM TUTORIAL
System.out.print("3 - RANKING\n\n");//AINDA SEM RANK
System.out.print("R  :");

Scanner sc5 = new Scanner(System.in);
int escolha = sc5.nextInt();


if(escolha == 1){jogo.game();}
else if(escolha == 2){tutorial.tutorial();}
else if(escolha == 3){ranking.ranking();}


    }
}
