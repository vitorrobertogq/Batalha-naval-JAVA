package jogo;

import java.io.IOException;
public class jogo {


    //SETANDO O MAPA SEM NAVIOS PARA INICIO DO JOGo


    
    static void game () throws InterruptedException,IOException {
        
        //LIMPANDO O MAPA DOS 2 JOGADORES
        int[] jogador1 = new int[100];
        int[] jogador2 = new int[100];
        for(int i = 0;i < 100;i++) {
            jogador1[i] = 0;
            jogador2[i] = 0;
        }
        
        //POSICIONANDO AS PEÇAS DO JOGADOR 1
        mapa.imprimirMapa(jogador1,jogador2);
        jogador1 = pecas.colocarPortaAvioes(jogador1);
        mapa.imprimirMapa(jogador1,jogador2);
        jogador1 = pecas.colocarNavioDe4canos(jogador1);
        mapa.imprimirMapa(jogador1,jogador2);
        jogador1 = pecas.colocarNavioDe3canos(jogador1);
        mapa.imprimirMapa(jogador1, jogador2);
        jogador1 = pecas.colocarNavioDe3canos(jogador1);
        mapa.imprimirMapa(jogador1, jogador2);
        jogador1 = pecas.colocarNavioDe2canos(jogador1);
        mapa.imprimirMapa(jogador1, jogador2);
        jogador1 = pecas.colocarNavioDe2canos(jogador1);
        mapa.imprimirMapa(jogador1, jogador2);
        jogador1 = pecas.colocarNavioDe2canos(jogador1);
        mapa.imprimirMapa(jogador1, jogador2);
        jogador1 = pecas.colocarNavioDe1cano(jogador1);
        mapa.imprimirMapa(jogador1, jogador2);
        jogador1 = pecas.colocarNavioDe1cano(jogador1);
        mapa.imprimirMapa(jogador1, jogador2);
        jogador1 = pecas.colocarNavioDe1cano(jogador1);
        mapa.imprimirMapa(jogador1, jogador2);
        jogador1 = pecas.colocarNavioDe1cano(jogador1);
        mapa.imprimirMapa(jogador1, jogador2);
    }}


