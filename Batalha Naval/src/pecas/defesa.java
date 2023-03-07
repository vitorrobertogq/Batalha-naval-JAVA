package pecas;

import java.util.Scanner;
import comando.valida;


public class defesa {
    valida valida = new valida();
    lugar lugar = new lugar();
    
    int[] inputDefesa(int[] array,int nDePecas,int vez,int tipoDeNavio) //PEGA O INPUT DAS PEÇAS E FILTRA ERROS
    {
        Scanner sc1 = new Scanner(System.in);
        System.out.print(" VEZ DO JOGADOR " + vez + "\n");
        System.out.print(" Resposta (DEFESA)  : ");
        String sac1 = sc1.nextLine();
        String[] A = sac1.split(",");

        if(valida.validaDefesa(A,nDePecas) && valida.validapecas(array, A, nDePecas)){
        for(int i = 0;i < nDePecas;i++) {
            array[lugar.posicao(A[i])] = tipoDeNavio;}
        return array;
        } else {return inputDefesa(array, nDePecas,vez,tipoDeNavio);}
    }
}
