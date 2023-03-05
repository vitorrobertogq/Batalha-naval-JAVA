package jogo;
import java.util.Scanner;


public class pecas {
    //PEGAR A POSIcAO EX: B-6 e determinar a posicao a ser alterada no array
     
    static int posicao(String input) {
        String[] S = input.split("-");
        if(S.length != 2){return 100;}
        else if(!(isNumeric(S[1]))){return 100;}
        else if(S[0] == ""){return 100;}
        else if(Integer.parseInt(S[1]) > 10 ) {return 100;} //FILTRANDO POSIÇOES INEXISTENTES
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
    
    static int[] inputDefesa(int[] array,int nDePecas,int vez,int tipoDeNavio) //PEGA O INPUT DAS PEÇAS E FILTRA ERROS
    {
        Scanner sc1 = new Scanner(System.in);
        System.out.print(" VEZ DO JOGADOR " + vez + "\n");
        System.out.print(" Resposta (DEFESA)  : ");
        String sac1 = sc1.nextLine();
        String[] A = sac1.split(",");

        if(valida.validaDefesa(A,nDePecas) && valida.validapecas(array, A, nDePecas)){
        for(int i = 0;i < nDePecas;i++) {
            array[posicao(A[i])] = tipoDeNavio;}
        return array;
        } else {return inputDefesa(array, nDePecas,vez,tipoDeNavio);}
    }

    static int[] inputAtaque(int [] arrayAtacada,int vez) // PEGA O INPUT DO ATAQUE E FILTRA ERROS
    {
        Scanner sc2 = new Scanner(System.in);
        System.out.print(" VEZ DO JOGADOR " + vez + "\n");
        System.out.print(" Resposta (ATAQUE)  : ");
        String sac2 = sc2.nextLine();
        

        if(posicao(sac2) < 100 && arrayAtacada[posicao(sac2)] != 0 && arrayAtacada[posicao(sac2)] != 9 && arrayAtacada[posicao(sac2)] != 10){
        
        if(arrayAtacada[posicao(sac2)] == 8){System.out.print("\n TIRO!! NO PORTA-AVIOES\n");
        arrayAtacada[posicao(sac2)] = 9;
        if(valida.checarNavios(arrayAtacada, 8)){System.out.print(" PORTA AVIOES AFUNDOU !!\n");}}
        else if(arrayAtacada[posicao(sac2)] == 7){System.out.print("\n TIRO!! NO NAVIO DE 4 CANOS\n");
        arrayAtacada[posicao(sac2)] = 9;
        if(valida.checarNavios(arrayAtacada, 7)){System.out.print(" NAVIO DE 4 CANOS AFUNDOU\n");}}
        else if(arrayAtacada[posicao(sac2)] == 6){System.out.print("\n TIRO!! EM UM NAVIO DE 3 CANOS\n");
        arrayAtacada[posicao(sac2)] = 9;
        if(valida.checarNavios(arrayAtacada, 6)){System.out.print(" UM NAVIO DE 3 CANOS AFUNDOU\n");}}
        else if(arrayAtacada[posicao(sac2)] == 5){System.out.print("\n TIRO!! EM UM NAVIO DE 3 CANOS\n");
        arrayAtacada[posicao(sac2)] = 9;
        if(valida.checarNavios(arrayAtacada, 5)){System.out.print(" UM NAVIO DE 3 CANOS AFUNDOU\n");}}
        else if(arrayAtacada[posicao(sac2)] == 4){System.out.print("\n TIRO!! EM UM NAVIO DE 2 CANOS\n");
        arrayAtacada[posicao(sac2)] = 9;
        if(valida.checarNavios(arrayAtacada, 4)){System.out.print(" UM NAVIO DE 2 CANOS AFUNDOU\n");}}
        else if(arrayAtacada[posicao(sac2)] == 3){System.out.print("\n TIRO!! EM UM NAVIO DE 2 CANOS\n");
        arrayAtacada[posicao(sac2)] = 9;
        if(valida.checarNavios(arrayAtacada, 3)){System.out.print(" UM NAVIO DE 2 CANOS AFUNDOU\n");}}
        else if(arrayAtacada[posicao(sac2)] == 2){System.out.print("\n TIRO!! EM UM NAVIO DE 2 CANOS\n");
        arrayAtacada[posicao(sac2)] = 9;
        if(valida.checarNavios(arrayAtacada, 2)){System.out.print(" UM NAVIO DE 2 CANOS AFUNDOU\n");}}
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

    //FUNcOES ESPECIFICAS PARA COLOCAR CADA PEcA NO MAPA

    static int[] colocarPortaAvioes(int[] array,int vez) {
        System.out.print(" Digite 5 posicoes de maneira que forme uma das seguinte posicoes (Obs : Digite as posicoes separadas por virgula)\n\n");
        System.out.print("  █       ███      █          █\n");
        System.out.print("  █   ou   █   ou  ███  ou  ███\n"); 
        System.out.print(" ███       █       █          █\n\n");
        return inputDefesa(array, 5,vez,8);
        
    }

    static int[] colocarNavioDe4canos(int[] array,int vez) {
        System.out.print(" Digite 4 posicoes de maneira que forme uma das seguinte posicoes (Obs : Digite as posicoes separadas por virgula)\n\n");
        System.out.print("  █             \n");
        System.out.print("  █   ou   █████\n"); 
        System.out.print("  █ \n");
        System.out.print("  █ \n\n");
        return inputDefesa(array, 4,vez,7);
    }

    static int[] colocarNavioDe3canos(int[] array,int vez,int separar) {
        System.out.print(" Digite 3 posicoes de maneira que forme uma das seguinte posicoes (Obs : Digite as posicoes separadas por virgula)\n\n");
        System.out.print("  █             \n");
        System.out.print("  █   ou   ████\n"); 
        System.out.print("  █ \n\n");
        return inputDefesa(array, 3,vez,separar);
     
    }

    static int[] colocarNavioDe2canos(int[] array,int vez,int separar) {
        System.out.print(" Digite 2 posicoes de maneira que forme uma das seguinte posicoes (Obs : Digite as posicoes separadas por virgula)\n\n");
        System.out.print("  █             \n");
        System.out.print("  █   ou   ██\n\n"); 
        return inputDefesa(array, 2,vez,separar);
    }

    static int[] colocarNavioDe1cano(int[] array,int vez) {
        System.out.print(" Digite a posicao desejada para colocar a seguinte peca  :\n\n");
        System.out.print("  █ \n\n");
        return inputDefesa(array, 1,vez,1);
       }

    static int[] ataque(int[] atacada,int vez) {
        return inputAtaque(atacada,vez);
    }


    public static boolean isNumeric(String str) //FUNCAO PRA TESTAR SE É NUMERICO PRA EVITAR ERRO NO INPUT
    { 
        try {  
        Double.parseDouble(str);  
        return true;
        } catch(NumberFormatException e){  
        return false;  
            }  
        }
    }
  