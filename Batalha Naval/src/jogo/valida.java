package jogo;
import java.util.Arrays;


public class valida {
    static boolean validaDefesa (String [] inputs,int nDePecas) {
        if(inputs.length != nDePecas){return false;}
        
        for(int i = 0;i < nDePecas;i++) {
            if(pecas.posicao(inputs[i]) == 100){return false;}
        }
        return true;
        
    }

    static boolean validapecas(int[] mapa, String [] array,int nDePecas) {
        int[] arrayDePosicoes = new int[nDePecas];
        for(int i = 0;i < nDePecas;i++){
            arrayDePosicoes[i] = pecas.posicao(array[i]);
            if(mapa[arrayDePosicoes[i]] == 1){return false;}}
        Arrays.sort(arrayDePosicoes);
        System.out.print(arrayDePosicoes[0]);
        if(nDePecas != 5){
        for(int j = 1;j < nDePecas;){
            System.out.print(arrayDePosicoes[j]);
            if(arrayDePosicoes[0]+j != arrayDePosicoes[j]){if(arrayDePosicoes[0]+(10*j) != arrayDePosicoes[j]){return false;}
            else {return true;}
        } else {return true;}}
    }
        return true;
}}
