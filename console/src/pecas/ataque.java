package pecas;

import java.util.Scanner;
import comando.validacao;

public class ataque implements validacao {

    
    
    int[] inputAtaque(int [] arrayAtacada,int vez) // PEGA O INPUT DO ATAQUE E FILTRA ERROS
    {
        Scanner sc2 = new Scanner(System.in);
        System.out.print(" VEZ DO JOGADOR " + vez + "\n");
        System.out.print(" Resposta (ATAQUE)  : ");
        String sac2 = sc2.nextLine();
        

        if(posicao(sac2) < 100 && arrayAtacada[posicao(sac2)] != 0 && arrayAtacada[posicao(sac2)] != 9 && arrayAtacada[posicao(sac2)] != 10){
        
        if(arrayAtacada[posicao(sac2)] == 8){System.out.print("\n TIRO!! NO PORTA-AVIOES\n");
        arrayAtacada[posicao(sac2)] = 9;
        if(checarNavios(arrayAtacada, 8)){System.out.print(" PORTA AVIOES AFUNDOU !!\n");}}
        else if(arrayAtacada[posicao(sac2)] == 7){System.out.print("\n TIRO!! NO NAVIO DE 4 CANOS\n");
        arrayAtacada[posicao(sac2)] = 9;
        if(checarNavios(arrayAtacada, 7)){System.out.print(" NAVIO DE 4 CANOS AFUNDOU\n");}}
        else if(arrayAtacada[posicao(sac2)] == 6){System.out.print("\n TIRO!! EM UM NAVIO DE 3 CANOS\n");
        arrayAtacada[posicao(sac2)] = 9;
        if(checarNavios(arrayAtacada, 6)){System.out.print(" UM NAVIO DE 3 CANOS AFUNDOU\n");}}
        else if(arrayAtacada[posicao(sac2)] == 5){System.out.print("\n TIRO!! EM UM NAVIO DE 3 CANOS\n");
        arrayAtacada[posicao(sac2)] = 9;
        if(checarNavios(arrayAtacada, 5)){System.out.print(" UM NAVIO DE 3 CANOS AFUNDOU\n");}}
        else if(arrayAtacada[posicao(sac2)] == 4){System.out.print("\n TIRO!! EM UM NAVIO DE 2 CANOS\n");
        arrayAtacada[posicao(sac2)] = 9;
        if(checarNavios(arrayAtacada, 4)){System.out.print(" UM NAVIO DE 2 CANOS AFUNDOU\n");}}
        else if(arrayAtacada[posicao(sac2)] == 3){System.out.print("\n TIRO!! EM UM NAVIO DE 2 CANOS\n");
        arrayAtacada[posicao(sac2)] = 9;
        if(checarNavios(arrayAtacada, 3)){System.out.print(" UM NAVIO DE 2 CANOS AFUNDOU\n");}}
        else if(arrayAtacada[posicao(sac2)] == 2){System.out.print("\n TIRO!! EM UM NAVIO DE 2 CANOS\n");
        arrayAtacada[posicao(sac2)] = 9;
        if(checarNavios(arrayAtacada, 2)){System.out.print(" UM NAVIO DE 2 CANOS AFUNDOU\n");}}
        else if(arrayAtacada[posicao(sac2)] == 1){System.out.print("\n TIRO!! NAVIO DE 1 CANO AFUNDADO\n");
        arrayAtacada[posicao(sac2)] = 9;}
        
        System.out.print(" ENTER PARA ATUALIZAR MAPA");
        
        sac2 = sc2.nextLine();
        return arrayAtacada;} 
        else if (posicao(sac2) < 100 && arrayAtacada[posicao(sac2)] == 0) {
        arrayAtacada[posicao(sac2)] = 10;
        System.out.print("\n ÁGUA!!\n ");
        System.out.print("ENTER PARA ATUALIZAR MAPA");
        sac2 = sc2.nextLine();
        return arrayAtacada;}
        else {return inputAtaque(arrayAtacada,vez);}

    }

    public int[] atacar(int[] atacada,int vez) {
        return inputAtaque(atacada,vez);
    }

}
