
public class peças {
    //PEGAR A POSIÇAO EX: B-6 e determinar a posiçao a ser alterada no array
     
    int posiçao(String input) {
        String[] S = input.split("-");
        if(S[0] == "A"){return 0 + Integer.parseInt(S[1]);}
        else if(S[0] == "B"){return 10 + Integer.parseInt(S[1]) - 1;}
        else if(S[0] == "C"){return 20 + Integer.parseInt(S[1]) - 1;}
        else if(S[0] == "D"){return 30 + Integer.parseInt(S[1]) - 1;}
        else if(S[0] == "E"){return 40 + Integer.parseInt(S[1]) - 1;}
        else if(S[0] == "F"){return 50 + Integer.parseInt(S[1]) - 1;}
        else if(S[0] == "G"){return 60 + Integer.parseInt(S[1]) - 1;}
        else if(S[0] == "H"){return 70 + Integer.parseInt(S[1]) - 1;}
        else if(S[0] == "I"){return 80 + Integer.parseInt(S[1]) - 1;}
        else if(S[0] == "J"){return 90 + Integer.parseInt(S[1]) - 1;}
        else if(Integer.parseInt(S[1]) > 10) {System.out.print("Linha INVALIDA");}
        else {System.out.print("Coluna INVALIDA");}
        
        return 0;
    }
    
    //RECEBE COMO PARAMETROS A POSICAO A SER ALTERADA E O ARRAY DE NAVIOS
    int[] AlterarPosiçao(int IndexDaArray,int[] array) {
        for(int i = 0;i < 100; i++) {
            if(i == IndexDaArray) {
                array[i] = 1;
            }
        }
        return array;
    }


}
