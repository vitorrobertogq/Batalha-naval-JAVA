package jogo;

import comando.montarTabuleiro;
import java.io.IOException;
import comando.acabarjogo;
import pecas.ataque;
import telas.mapa;
public class jogo {

    public static void game() throws InterruptedException, IOException {
    int [] jogador1 = montarTabuleiro.inicio(1);
    int [] jogador2 = montarTabuleiro.inicio(2);

    while(true) //CICLO INFINITO ATÉ A FUNCAO ACABARJOGO.VITORIA CHECAR UM MAPA SEM NAVIOS
    {
        mapa.imprimirMapa(jogador1, jogador2);
        jogador2 = ataque.atacar(jogador2,1);//JOGADOR 2 SOFRE ATAQUE DE JOGADOR 1
        if(acabarjogo.vitoria(jogador2)) {break;}
        mapa.imprimirMapa(jogador1, jogador2);
        jogador2 = ataque.atacar(jogador2,1);
        if(acabarjogo.vitoria(jogador2)) {break;}
        mapa.imprimirMapa(jogador1, jogador2);
        jogador2 = ataque.atacar(jogador2,1);
        if(acabarjogo.vitoria(jogador2)) {break;}
        mapa.imprimirMapa(jogador1, jogador2);
        //TROCA DE TURNO
        mapa.imprimirMapa(jogador2, jogador1);
        jogador1 = ataque.atacar(jogador1,2);//AO CONTRARIO
        if(acabarjogo.vitoria(jogador2)) {break;}
        mapa.imprimirMapa(jogador2, jogador1);
        jogador1 = ataque.atacar(jogador1,2);
        if(acabarjogo.vitoria(jogador2)) {break;}
        mapa.imprimirMapa(jogador2, jogador1);
        jogador1 = ataque.atacar(jogador1,2);
        if(acabarjogo.vitoria(jogador2)) {break;}
        mapa.imprimirMapa(jogador2, jogador1);
       }
    if(acabarjogo.vitoria(jogador2) == true){acabarjogo.telaDeVitoria(1);} // SE O JOGADOR 1 GANHAR
    else if(acabarjogo.vitoria(jogador1) == true) {acabarjogo.telaDeVitoria(2);}// SE O JOGADOR 2 GANHAR
        }
    }

   
        
        
        


