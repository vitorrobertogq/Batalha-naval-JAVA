package jogo;

import java.io.IOException;
public class jogo {

    static void game() throws InterruptedException, IOException {
    int [] jogador1 = colocarpeças.inicio(1);
    int [] jogador2 = colocarpeças.inicio(2);
    
    while(true)
    {
        mapa.imprimirMapa(jogador1, jogador2);
        jogador2 = pecas.ataque(jogador2,1);//JOGADOR 2 SOFRE ATAQUE DE JOGADOR 1
        if(acabarjogo.vitoria(jogador2)) {break;}
        mapa.imprimirMapa(jogador1, jogador2);
        jogador2 = pecas.ataque(jogador2,1);
        if(acabarjogo.vitoria(jogador2)) {break;}
        mapa.imprimirMapa(jogador1, jogador2);
        jogador2 = pecas.ataque(jogador2,1);
        if(acabarjogo.vitoria(jogador2)) {break;}
        mapa.imprimirMapa(jogador1, jogador2);
        //TROCA DE TURNO
        mapa.imprimirMapa(jogador2, jogador1);
        jogador1 = pecas.ataque(jogador1,2);//AO CONTRARIO
        if(acabarjogo.vitoria(jogador2)) {break;}
        mapa.imprimirMapa(jogador2, jogador1);
        jogador1 = pecas.ataque(jogador1,2);
        if(acabarjogo.vitoria(jogador2)) {break;}
        mapa.imprimirMapa(jogador2, jogador1);
        jogador1 = pecas.ataque(jogador1,2);
        if(acabarjogo.vitoria(jogador2)) {break;}
        mapa.imprimirMapa(jogador2, jogador1);
            }
    if(acabarjogo.vitoria(jogador2) == true){acabarjogo.telaDeVitoria(1);}
    else if(acabarjogo.vitoria(jogador1) == true) {acabarjogo.telaDeVitoria(2);}
        }
    }

   
        
        
        


