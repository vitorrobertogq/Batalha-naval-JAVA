package comando;

import java.io.IOException;

import telas.mapa;

public class acabarjogo {
    mapa mapa = new mapa();
    public boolean vitoria (int[] array)// FUNCAO QUE CHECA SE O JOGO ACABOU
    {
        int numeroDeNavios = 0;

        for(int i = 0;i < 100;i++) {
            if(array[i] == 1 || array[i] == 2|| array[i] == 3|| array[i] == 4|| array[i] == 5|| array[i] == 6 || array[i] == 7|| array[i] == 8){numeroDeNavios = 1;}
        }

        if(numeroDeNavios != 0){
            return false;
        } else {return true;}
    }

    //FUNCAO CASO O JOGO ACABE
    public void telaDeVitoria(int n) throws InterruptedException, IOException 
    {
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

