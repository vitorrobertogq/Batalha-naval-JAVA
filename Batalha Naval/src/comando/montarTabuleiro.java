package comando;

import java.io.IOException;
import pecas.colocar;
import telas.mapa;

public class montarTabuleiro {
    public static int [] inicio (int vez) throws InterruptedException, IOException {
        int[] jogador1 = new int[100];
        int[] jogador2 = new int[100];

        for(int i = 0;i < 100;i++) {
            jogador1[i] = 0;
            jogador2[i] = 0;
        }
        //EXECUCAO DAS FUNCOES VINDAS DE PECAS PARA REDUZIR FUNCOES NA CLASSE JOGO
        mapa.imprimirMapa(jogador1,jogador2);
        jogador1 = colocar.PortaAvioes(jogador1,vez);
        mapa.imprimirMapa(jogador1,jogador2);
        jogador1 = colocar.NavioDe4canos(jogador1,vez);
        mapa.imprimirMapa(jogador1,jogador2);
        jogador1 = colocar.NavioDe3canos(jogador1,vez,6);
        mapa.imprimirMapa(jogador1, jogador2);
        jogador1 = colocar.NavioDe3canos(jogador1,vez,5);
        mapa.imprimirMapa(jogador1, jogador2);
        jogador1 = colocar.NavioDe2canos(jogador1,vez,4);
        mapa.imprimirMapa(jogador1, jogador2);
        jogador1 = colocar.NavioDe2canos(jogador1,vez,3);
        mapa.imprimirMapa(jogador1, jogador2);
        jogador1 = colocar.NavioDe2canos(jogador1,vez,2);
        mapa.imprimirMapa(jogador1, jogador2);
        jogador1 = colocar.NavioDe1cano(jogador1,vez);
        mapa.imprimirMapa(jogador1, jogador2);
        jogador1 = colocar.NavioDe1cano(jogador1,vez);
        mapa.imprimirMapa(jogador1, jogador2);
        jogador1 = colocar.NavioDe1cano(jogador1,vez);
        mapa.imprimirMapa(jogador1, jogador2);
        jogador1 = colocar.NavioDe1cano(jogador1,vez);
        mapa.imprimirMapa(jogador1, jogador2);
        
        return jogador1;
        }
    }

