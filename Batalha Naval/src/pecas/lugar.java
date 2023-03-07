package pecas;

public class lugar {
    
        //PEGAR A POSIcAO EX: B-6 e determinar a posicao a ser alterada no array
         
        public int posicao(String input) {
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

        public boolean isNumeric(String str) //FUNCAO PRA TESTAR SE É NUMERICO PRA EVITAR ERRO NO INPUT
    { 
        try {  
        Double.parseDouble(str);  
        return true;
        } catch(NumberFormatException e){  
        return false;  
            }  
        }
    }
