package pecas;

import java.util.Scanner;
import comando.validacao;


public abstract class defesa implements validacao {
    

    
    int[] inputDefesa(int[] array,int nDePecas,int vez,int tipoDeNavio) //PEGA O INPUT DAS PEÇAS E FILTRA ERROS
    {
        Scanner sc1 = new Scanner(System.in);
        System.out.print(" VEZ DO JOGADOR " + vez + "\n");
        System.out.print(" Resposta (DEFESA)  : ");
        String sac1 = sc1.nextLine();
        String[] A = sac1.split(",");

        if(validaDefesa(A,nDePecas) && validapecas(array, A, nDePecas)){
        for(int i = 0;i < nDePecas;i++) {
            array[posicao(A[i])] = tipoDeNavio;}
        return array;
        } else {return inputDefesa(array, nDePecas,vez,tipoDeNavio);}
    }

    public int[] PortaAvioes(int[] array,int vez) {
        System.out.print(" Digite 5 posicoes de maneira que forme uma das seguinte posicoes (Obs : Digite as posicoes separadas por virgula)\n\n");
        System.out.print("  █       ███      █          █\n");
        System.out.print("  █   ou   █   ou  ███  ou  ███\n"); 
        System.out.print(" ███       █       █          █\n\n");
        return inputDefesa(array, 5,vez,8);
        
    }

    public int[] NavioDe4canos(int[] array,int vez) {
        System.out.print(" Digite 4 posicoes de maneira que forme uma das seguinte posicoes (Obs : Digite as posicoes separadas por virgula)\n\n");
        System.out.print("  █             \n");
        System.out.print("  █   ou   █████\n"); 
        System.out.print("  █ \n");
        System.out.print("  █ \n\n");
        return inputDefesa(array, 4,vez,7);
    }

    public int[] NavioDe3canos(int[] array,int vez,int separar) {
        System.out.print(" Digite 3 posicoes de maneira que forme uma das seguinte posicoes (Obs : Digite as posicoes separadas por virgula)\n\n");
        System.out.print("  █             \n");
        System.out.print("  █   ou   ████\n"); 
        System.out.print("  █ \n\n");
        return inputDefesa(array, 3,vez,separar);
     
    }

    public int[] NavioDe2canos(int[] array,int vez,int separar) {
        System.out.print(" Digite 2 posicoes de maneira que forme uma das seguinte posicoes (Obs : Digite as posicoes separadas por virgula)\n\n");
        System.out.print("  █             \n");
        System.out.print("  █   ou   ██\n\n"); 
        return inputDefesa(array, 2,vez,separar);
    }

    public int[] NavioDe1cano(int[] array,int vez) {
        System.out.print(" Digite a posicao desejada para colocar a seguinte peca  :\n\n");
        System.out.print("  █ \n\n");
        return inputDefesa(array, 1,vez,1);
       }
}
