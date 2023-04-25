package jogo;

import comando.montarTabuleiro;
import comando.validacao;

import java.io.IOException;
import pecas.ataque;
import telas.mapa;
public class jogo implements validacao {

    public void game() throws InterruptedException, IOException {
    
    mapa mapa = new mapa();
    montarTabuleiro montarTabuleiro = new montarTabuleiro();
    ataque ataque = new ataque();

    int [] jogador1 = montarTabuleiro.inicio(1);
    int [] jogador2 = montarTabuleiro.inicio(2);

    while(true) //CICLO INFINITO ATÉ A FUNCAO VITORIA CHECAR UM MAPA SEM NAVIOS
    {
        mapa.imprimirMapa(jogador1, jogador2);
        jogador2 = ataque.atacar(jogador2,1);//JOGADOR 2 SOFRE ATAQUE DE JOGADOR 1
        if(vitoria(jogador2)) {break;}
        mapa.imprimirMapa(jogador1, jogador2);
        jogador2 = ataque.atacar(jogador2,1);
        if(vitoria(jogador2)) {break;}
        mapa.imprimirMapa(jogador1, jogador2);
        jogador2 = ataque.atacar(jogador2,1);
        if(vitoria(jogador2)) {break;}
        mapa.imprimirMapa(jogador1, jogador2);
        //TROCA DE TURNO
        mapa.imprimirMapa(jogador2, jogador1);
        jogador1 = ataque.atacar(jogador1,2);//AO CONTRARIO
        if(vitoria(jogador2)) {break;}
        mapa.imprimirMapa(jogador2, jogador1);
        jogador1 = ataque.atacar(jogador1,2);
        if(vitoria(jogador2)) {break;}
        mapa.imprimirMapa(jogador2, jogador1);
        jogador1 = ataque.atacar(jogador1,2);
        if(vitoria(jogador2)) {break;}
        mapa.imprimirMapa(jogador2, jogador1);
       }
    if(vitoria(jogador2) == true){telaDeVitoria(1);} // SE O JOGADOR 1 GANHAR
    else if(vitoria(jogador1) == true) {telaDeVitoria(2);}// SE O JOGADOR 2 GANHAR
        }

    @Override
    public int posicao(String input) {
        throw new UnsupportedOperationException("Unimplemented method 'posicao'");
    }

    @Override
    public boolean isNumeric(String str) {
        throw new UnsupportedOperationException("Unimplemented method 'isNumeric'");
    }
    }

   
        
        
        


