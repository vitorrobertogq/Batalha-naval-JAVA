package jogo;
import java.util.Scanner;


public class pecas {
    //PEGAR A POSIÇAO EX: B-6 e determinar a posiçao a ser alterada no array
     
    static int posiçao(String input) {
        String[] S = input.split("-");
        if(Integer.parseInt(S[1]) > 10) {System.out.print("Linha INVALIDA");}
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
        else {System.out.print("erro");}
        
        return 0;
    }
    
    //FUNÇOES ESPECIFICAS PARA COLOCAR CADA PEÇA NO MAPA
    //FALTA FAZER A VALIDAÇAO DE CADA UMA E AJEITAR O SCANNER CLOSE

    static int[] colocarPortaAvioes(int[] array) {
        System.out.print(" Digite 5 posiçoes de maneira que forme uma das seguinte posiçoes (Obs : Digite as posiçoes separadas por virgula)\n\n");
        System.out.print("  █       ███      █          █\n");
        System.out.print("  █   ou   █   ou  ███  ou  ███\n"); 
        System.out.print(" ███       █       █          █\n\n");
        Scanner sc1 = new Scanner(System.in);
        System.out.print(" Resposta  : ");
        String sac1 = sc1.nextLine();

        String[] A = sac1.split(",");
        for(int i = 0;i < 5;i++) {
            array[posiçao(A[i])] = 1;   
        }
        return array;
    }

    static int[] colocarNavioDe4canos(int[] array) {
        System.out.print(" Digite 4 posiçoes de maneira que forme uma das seguinte posiçoes (Obs : Digite as posiçoes separadas por virgula)\n\n");
        System.out.print("  █             \n");
        System.out.print("  █   ou   █████\n"); 
        System.out.print("  █ \n");
        System.out.print("  █ \n\n");
        Scanner sc2 = new Scanner(System.in);
            System.out.print(" Resposta  : ");
            String sac2 = sc2.nextLine();

            String[] A = sac2.split(",");
            for(int i = 0;i < 4;i++) {
                array[posiçao(A[i])] = 1;
            }
        return array;
    }

    static int[] colocarNavioDe3canos(int[] array) {
        System.out.print(" Digite 3 posiçoes de maneira que forme uma das seguinte posiçoes (Obs : Digite as posiçoes separadas por virgula)\n\n");
        System.out.print("  █             \n");
        System.out.print("  █   ou   ████\n"); 
        System.out.print("  █ \n\n");
        Scanner sc3 = new Scanner(System.in);
            System.out.print(" Resposta  : ");
            String sac3 = sc3.nextLine();

            String[] A = sac3.split(",");
            for(int i = 0;i < 3;i++) {
                array[posiçao(A[i])] = 1;
            }
        
        return array;
     
    }

    static int[] colocarNavioDe2canos(int[] array) {
        System.out.print(" Digite 2 posiçoes de maneira que forme uma das seguinte posiçoes (Obs : Digite as posiçoes separadas por virgula)\n\n");
        System.out.print("  █             \n");
        System.out.print("  █   ou   ██\n\n"); 
        Scanner sc4 = new Scanner(System.in);
            System.out.print(" Resposta  : ");
            String sac4 = sc4.nextLine();

            String[] A = sac4.split(",");
            for(int i = 0;i < 2;i++) {
                array[posiçao(A[i])] = 1;
            }
        return array;
    }

    static int[] colocarNavioDe1cano(int[] array) {
        System.out.print(" Digite a posiçao desejada para colocar a seguinte peça  :\n\n");
        System.out.print("  █ \n\n");
        Scanner sc5 = new Scanner(System.in);
            System.out.print(" Resposta  : ");
            String sac5 = sc5.nextLine();
            array[posiçao(sac5)] = 1;

        return array;
       }
}
