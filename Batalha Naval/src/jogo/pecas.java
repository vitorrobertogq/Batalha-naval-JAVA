package jogo;
import java.util.Scanner;


public class pecas {
    //PEGAR A POSIcAO EX: B-6 e determinar a posicao a ser alterada no array
     
    static int posicao(String input) {
        String[] S = input.split("-");
        if(Integer.parseInt(S[1]) > 10 ) {return 100;} //FILTRANDO POSIÇOES INEXISTENTES
        else if(S.length != 2){return 100;} //FILTRANDO POSIÇOES INEXISTENTES
        else if(S[0].charAt(0) == 'A' || S[0].charAt(0) == 'a'){return Integer.parseInt(S[1]) - 1;}
        else if(S[0].charAt(0) == 'B' || S[0].charAt(0) == 'b'){return 10 + Integer.parseInt(S[1]) - 1;}
        else if(S[0].charAt(0) == 'C' || S[0].charAt(0) == 'c'){return 20 + Integer.parseInt(S[1]) - 1;}
        else if(S[0].charAt(0) == 'D' || S[0].charAt(0) == 'd'){return 30 + Integer.parseInt(S[1]) - 1;}
        else if(S[0].charAt(0) == 'E' || S[0].charAt(0) == 'e'){return 40 + Integer.parseInt(S[1]) - 1;}
        else if(S[0].charAt(0) == 'F' || S[0].charAt(0) == 'f'){return 50 + Integer.parseInt(S[1]) - 1;}
        else if(S[0].charAt(0) == 'G' || S[0].charAt(0) == 'g'){return 60 + Integer.parseInt(S[1]) - 1;}
        else if(S[0].charAt(0) == 'H' || S[0].charAt(0) == 'h'){return 70 + Integer.parseInt(S[1]) - 1;}
        else if(S[0].charAt(0) == 'I' || S[0].charAt(0) == 'i'){return 80 + Integer.parseInt(S[1]) - 1;}
        else if(S[0].charAt(0) == 'J' || S[0].charAt(0) == 'j'){return 90 + Integer.parseInt(S[1]) - 1;}
        else {return 100;}
        
    }
    
    static int[] inputDefesa(int[] array,int nDePecas,int vez) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print(" VEZ DO JOGADOR " + vez + "\n");
        System.out.print(" Resposta (DEFESA)  : ");
        String sac1 = sc1.nextLine();
        String[] A = sac1.split(",");

        if(valida.validaDefesa(A,nDePecas)){
        for(int i = 0;i < nDePecas;i++) {
            array[posicao(A[i])] = 1;}
        return array;
        } else {return inputDefesa(array, nDePecas,vez);}}

    static int[] inputAtaque(int [] arrayAtacada,int vez){
        Scanner sc2 = new Scanner(System.in);
        System.out.print(" VEZ DO JOGADOR " + vez + "\n");
        System.out.print(" Resposta (ATAQUE)  : ");
        String sac2 = sc2.nextLine();
        

        if(posicao(sac2) < 100 && arrayAtacada[posicao(sac2)] == 1){
        arrayAtacada[posicao(sac2)] = 2;
        return arrayAtacada;} 
        else if (posicao(sac2) < 100 && arrayAtacada[posicao(sac2)] == 0) {
        arrayAtacada[posicao(sac2)] = 3;
        return arrayAtacada;}
        else {return inputAtaque(arrayAtacada,vez);}

    }

    //FUNcOES ESPECIFICAS PARA COLOCAR CADA PEcA NO MAPA

    static int[] colocarPortaAvioes(int[] array,int vez) {
        System.out.print(" Digite 5 posicoes de maneira que forme uma das seguinte posicoes (Obs : Digite as posicoes separadas por virgula)\n\n");
        System.out.print("  █       ███      █          █\n");
        System.out.print("  █   ou   █   ou  ███  ou  ███\n"); 
        System.out.print(" ███       █       █          █\n\n");
        return inputDefesa(array, 5,vez);
        
    }

    static int[] colocarNavioDe4canos(int[] array,int vez) {
        System.out.print(" Digite 4 posicoes de maneira que forme uma das seguinte posicoes (Obs : Digite as posicoes separadas por virgula)\n\n");
        System.out.print("  █             \n");
        System.out.print("  █   ou   █████\n"); 
        System.out.print("  █ \n");
        System.out.print("  █ \n\n");
        return inputDefesa(array, 4,vez);
    }

    static int[] colocarNavioDe3canos(int[] array,int vez) {
        System.out.print(" Digite 3 posicoes de maneira que forme uma das seguinte posicoes (Obs : Digite as posicoes separadas por virgula)\n\n");
        System.out.print("  █             \n");
        System.out.print("  █   ou   ████\n"); 
        System.out.print("  █ \n\n");
        return inputDefesa(array, 3,vez);
     
    }

    static int[] colocarNavioDe2canos(int[] array,int vez) {
        System.out.print(" Digite 2 posicoes de maneira que forme uma das seguinte posicoes (Obs : Digite as posicoes separadas por virgula)\n\n");
        System.out.print("  █             \n");
        System.out.print("  █   ou   ██\n\n"); 
        return inputDefesa(array, 2,vez);
    }

    static int[] colocarNavioDe1cano(int[] array,int vez) {
        System.out.print(" Digite a posicao desejada para colocar a seguinte peca  :\n\n");
        System.out.print("  █ \n\n");
        return inputDefesa(array, 1,vez);
       }

    static int[] ataque(int[] atacada,int vez) {
        return inputAtaque(atacada,vez);
    }
}
