package jogo;

import java.io.IOException;

public class acabarjogo {
    static boolean vitoria (int[] array) {
        int numeroDeNavios = 0;

        for(int i = 0;i < 100;i++) {
            if(array[i] == 1){numeroDeNavios = 1;}
        }

        if(numeroDeNavios != 0){
            return false;
        } else {return true;}
    }

    static void telaDeVitoria(int n) throws InterruptedException, IOException {
        mapa.clear();
        
    System.out.print("      ███████╗██╗███╗   ███╗    ██████╗ ███████╗         ██╗ ██████╗  ██████╗  ██████╗ \n");
    System.out.print("      ██╔════╝██║████╗ ████║    ██╔══██╗██╔════╝         ██║██╔═══██╗██╔════╝ ██╔═══██╗\n");
    System.out.print("      █████╗  ██║██╔████╔██║    ██║  ██║█████╗           ██║██║   ██║██║  ███╗██║   ██║\n");
    System.out.print("      ██╔══╝  ██║██║╚██╔╝██║    ██║  ██║██╔══╝      ██   ██║██║   ██║██║   ██║██║   ██║\n");
    System.out.print("      ██║     ██║██║ ╚═╝ ██║    ██████╔╝███████╗    ╚█████╔╝╚██████╔╝╚██████╔╝╚██████╔╝\n");
    System.out.print("      ╚═╝     ╚═╝╚═╝     ╚═╝    ╚═════╝ ╚══════╝     ╚════╝  ╚═════╝  ╚═════╝  ╚═════╝ \n");

    System.out.print("                              VITORIA DO JOGADOR " + n);
                                                                                 

    }
    }

