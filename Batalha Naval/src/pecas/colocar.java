package pecas;

public class colocar {
    defesa defesa = new defesa();
    
    public int[] PortaAvioes(int[] array,int vez) {
        System.out.print(" Digite 5 posicoes de maneira que forme uma das seguinte posicoes (Obs : Digite as posicoes separadas por virgula)\n\n");
        System.out.print("  █       ███      █          █\n");
        System.out.print("  █   ou   █   ou  ███  ou  ███\n"); 
        System.out.print(" ███       █       █          █\n\n");
        return defesa.inputDefesa(array, 5,vez,8);
        
    }

    public int[] NavioDe4canos(int[] array,int vez) {
        System.out.print(" Digite 4 posicoes de maneira que forme uma das seguinte posicoes (Obs : Digite as posicoes separadas por virgula)\n\n");
        System.out.print("  █             \n");
        System.out.print("  █   ou   █████\n"); 
        System.out.print("  █ \n");
        System.out.print("  █ \n\n");
        return defesa.inputDefesa(array, 4,vez,7);
    }

    public int[] NavioDe3canos(int[] array,int vez,int separar) {
        System.out.print(" Digite 3 posicoes de maneira que forme uma das seguinte posicoes (Obs : Digite as posicoes separadas por virgula)\n\n");
        System.out.print("  █             \n");
        System.out.print("  █   ou   ████\n"); 
        System.out.print("  █ \n\n");
        return defesa.inputDefesa(array, 3,vez,separar);
     
    }

    public int[] NavioDe2canos(int[] array,int vez,int separar) {
        System.out.print(" Digite 2 posicoes de maneira que forme uma das seguinte posicoes (Obs : Digite as posicoes separadas por virgula)\n\n");
        System.out.print("  █             \n");
        System.out.print("  █   ou   ██\n\n"); 
        return defesa.inputDefesa(array, 2,vez,separar);
    }

    public int[] NavioDe1cano(int[] array,int vez) {
        System.out.print(" Digite a posicao desejada para colocar a seguinte peca  :\n\n");
        System.out.print("  █ \n\n");
        return defesa.inputDefesa(array, 1,vez,1);
       }

}
