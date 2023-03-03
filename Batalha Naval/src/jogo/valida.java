package jogo;

public class valida {
    static boolean validaDefesa (String [] inputs,int nDePecas) {
        if(inputs.length != nDePecas){return false;}
        
        for(int i = 0;i < nDePecas;i++) {
            if(pecas.posicao(inputs[i]) == 100){return false;}
        }
        return true;
        
    }
}
