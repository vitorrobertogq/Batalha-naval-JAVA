package comando;
import java.util.Arrays;

import pecas.lugar;


public class valida {
    public static boolean validaDefesa (String [] inputs,int nDePecas) //VALIDACAO PARA NAVIOS SOBREPOSTOS OU INPUTS ERRADOS
    {
        if(inputs.length != nDePecas){return false;}
        
        for(int i = 0;i < nDePecas;i++) {
            if(lugar.posicao(inputs[i]) == 100){return false;}
        }
        return true;
        
    }

    public static boolean validapecas(int[] mapa, String [] array,int nDePecas) //VALIDACAO PARA ESTRUTURAS IRREGULARES
    {
        int[] arrayDePosicoes = new int[nDePecas];
        for(int i = 0;i < nDePecas;i++){
            arrayDePosicoes[i] = lugar.posicao(array[i]);
            if(mapa[arrayDePosicoes[i]] != 0){return false;}}

        Arrays.sort(arrayDePosicoes);     

        if(nDePecas != 5){
        for(int j = 1;j < nDePecas;j++){
            if(arrayDePosicoes[0]+j != arrayDePosicoes[j]){if(arrayDePosicoes[0]+(10*j) != arrayDePosicoes[j]){return false;}}}}
        else{if(arrayDePosicoes[0]+10 != arrayDePosicoes[1] || arrayDePosicoes[0]+11 != arrayDePosicoes[2] || arrayDePosicoes[0]+12 != arrayDePosicoes[3] || arrayDePosicoes[0]+20 != arrayDePosicoes[4]){if(arrayDePosicoes[0]+8!= arrayDePosicoes[1] || arrayDePosicoes[0]+9 != arrayDePosicoes[2] || arrayDePosicoes[0]+10 != arrayDePosicoes[3] || arrayDePosicoes[0]+20 != arrayDePosicoes[4]){if(arrayDePosicoes[0]+10 != arrayDePosicoes[1] || arrayDePosicoes[0]+19 != arrayDePosicoes[2] || arrayDePosicoes[0]+20 != arrayDePosicoes[3] || arrayDePosicoes[0]+21 != arrayDePosicoes[4]){if(arrayDePosicoes[0]+1!= arrayDePosicoes[1] || arrayDePosicoes[0]+2 != arrayDePosicoes[2] || arrayDePosicoes[0]+11 != arrayDePosicoes[3] || arrayDePosicoes[0]+21 != arrayDePosicoes[4]){return false;}}}}}
        return true;
    }

    public static boolean checarNavios(int[] array,int n)// FUNCAO PARA CHECAR SE CERTA ESTRUTURA AFUNDOU
    {
        for(int i = 0;i < 100;i++){
            if(array[i] == n){return false;}
        }
        return true;
    }}
