public class Teste {
    public static void main(String[] args){
        char escCode = 0x1B;
        int row = 10; int column = 10;
        System.out.print(String.format("%c[%d;%df",escCode,row,column)); //aaa 
    }
}
