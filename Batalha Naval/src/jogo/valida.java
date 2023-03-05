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
            if(mapa[arrayDePosicoes[i]] != 0){return false;}}

        Arrays.sort(arrayDePosicoes);     

        if(nDePecas != 5){
        for(int j = 1;j < nDePecas;j++){
            if(arrayDePosicoes[0]+j != arrayDePosicoes[j]){if(arrayDePosicoes[0]+(10*j) != arrayDePosicoes[j]){return false;}}}}
        else{if(arrayDePosicoes[0]+10 != arrayDePosicoes[1] || arrayDePosicoes[0]+11 != arrayDePosicoes[2] || arrayDePosicoes[0]+12 != arrayDePosicoes[3] || arrayDePosicoes[0]+20 != arrayDePosicoes[4]){if(arrayDePosicoes[0]+8!= arrayDePosicoes[1] || arrayDePosicoes[0]+9 != arrayDePosicoes[2] || arrayDePosicoes[0]+10 != arrayDePosicoes[3] || arrayDePosicoes[0]+20 != arrayDePosicoes[4]){if(arrayDePosicoes[0]+10 != arrayDePosicoes[1] || arrayDePosicoes[0]+19 != arrayDePosicoes[2] || arrayDePosicoes[0]+20 != arrayDePosicoes[3] || arrayDePosicoes[0]+21 != arrayDePosicoes[4]){if(arrayDePosicoes[0]+1!= arrayDePosicoes[1] || arrayDePosicoes[0]+2 != arrayDePosicoes[2] || arrayDePosicoes[0]+11 != arrayDePosicoes[3] || arrayDePosicoes[0]+21 != arrayDePosicoes[4]){return false;}}}}}
        return true;
}}
