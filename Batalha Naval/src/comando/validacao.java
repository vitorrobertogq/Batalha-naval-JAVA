package comando;

import java.io.IOException;
import java.util.Arrays;

import pecas.lugar;
import telas.mapa;

public interface validacao extends lugar{
    
    
    mapa mapa = new mapa();//APENAS PELA FUNCAO CLEAR

    public default boolean vitoria (int[] array)// FUNCAO QUE CHECA SE O JOGO ACABOU
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
    public default void telaDeVitoria(int n) throws InterruptedException, IOException 
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

    public default boolean validaDefesa (String [] inputs,int nDePecas) //VALIDACAO PARA NAVIOS SOBREPOSTOS OU INPUTS ERRADOS
    {
        if(inputs.length != nDePecas){return false;}
        
        for(int i = 0;i < nDePecas;i++) {
            if(posicao(inputs[i]) == 100){
                System.out.print(" Posiçao INVÁLIDA\n");
                return false;}
        }
        return true;
        
    }

    public default boolean validapecas(int[] mapa, String [] array,int nDePecas) //VALIDACAO PARA ESTRUTURAS IRREGULARES
    {
        int[] arrayDePosicoes = new int[nDePecas];
        for(int i = 0;i < nDePecas;i++){
            arrayDePosicoes[i] = posicao(array[i]);
            if(mapa[arrayDePosicoes[i]] != 0){
                System.out.print(" Posiçao já ocupada\n");
                return false;}}

        Arrays.sort(arrayDePosicoes);     

        if(nDePecas != 5){
        for(int j = 1;j < nDePecas;j++){
            if(arrayDePosicoes[0]+j != arrayDePosicoes[j]){if(arrayDePosicoes[0]+(10*j) != arrayDePosicoes[j]){
                System.out.print(" Formato INVÁLIDO\n");
                return false;}}}}
        else{if(arrayDePosicoes[0]+10 != arrayDePosicoes[1] || arrayDePosicoes[0]+11 != arrayDePosicoes[2] || arrayDePosicoes[0]+12 != arrayDePosicoes[3] || arrayDePosicoes[0]+20 != arrayDePosicoes[4]){if(arrayDePosicoes[0]+8!= arrayDePosicoes[1] || arrayDePosicoes[0]+9 != arrayDePosicoes[2] || arrayDePosicoes[0]+10 != arrayDePosicoes[3] || arrayDePosicoes[0]+20 != arrayDePosicoes[4]){if(arrayDePosicoes[0]+10 != arrayDePosicoes[1] || arrayDePosicoes[0]+19 != arrayDePosicoes[2] || arrayDePosicoes[0]+20 != arrayDePosicoes[3] || arrayDePosicoes[0]+21 != arrayDePosicoes[4]){if(arrayDePosicoes[0]+1!= arrayDePosicoes[1] || arrayDePosicoes[0]+2 != arrayDePosicoes[2] || arrayDePosicoes[0]+11 != arrayDePosicoes[3] || arrayDePosicoes[0]+21 != arrayDePosicoes[4]){
            System.out.print(" Formato INVÁLIDO\n");
            return false;}}}}}
        return true;
    }

    public default boolean checarNavios(int[] array,int n)// FUNCAO PARA CHECAR SE CERTA ESTRUTURA AFUNDOU
    {
        for(int i = 0;i < 100;i++){
            if(array[i] == n){return false;}
        }
        return true;
    }
    }

