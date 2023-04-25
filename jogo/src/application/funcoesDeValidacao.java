package application;

public class funcoesDeValidacao{
	public boolean clique(int n) {
		if(n==0) {return true;}
		return false;
	}
	public boolean validacao(int direcao,int posicaoInicial,int[] arrayDeNavios,int QuantidadeDeNavios) {
		int n = 0;
		if(direcao == 0) {
			if(posicaoInicial-((QuantidadeDeNavios-1)*10) >= 0 && posicaoInicial-((QuantidadeDeNavios-1)*10) <= 99) {
				for(int i = 0;i<QuantidadeDeNavios;i++) {
					if(arrayDeNavios[posicaoInicial-(10*i)] == 0) {
						n+=1;}
					}if(n ==QuantidadeDeNavios) {return true;} else {return false;}
			}else {return false;}
			}
		else if(direcao == 1){
			if(posicaoInicial+((QuantidadeDeNavios-1)*10) >= 0 && posicaoInicial+((QuantidadeDeNavios-1)*10) <= 99) {
				for(int i = 0;i<QuantidadeDeNavios;i++) {
					if(arrayDeNavios[posicaoInicial+(10*i)] == 0) {
						n+=1;}
					}if(n ==QuantidadeDeNavios) {return true;} else {return false;}
			}else {return false;}
		}
		else if(direcao == 2) {
			int linhaAtual = posicaoInicial/10;
			if(posicaoInicial+QuantidadeDeNavios-1 >= 0 && posicaoInicial+QuantidadeDeNavios-1 <= 99) {
				for(int i = 0;i<QuantidadeDeNavios;i++) {
					if(arrayDeNavios[posicaoInicial+i] == 0 && (posicaoInicial+i)/10 == linhaAtual) {
						n+=1;}
					}if(n ==QuantidadeDeNavios) {return true;} else {return false;}
			}else {return false;}
		}
		else {
			int linhaAtual = posicaoInicial/10;
			if(posicaoInicial-QuantidadeDeNavios+1 >= 0 && posicaoInicial-QuantidadeDeNavios+1 <= 99) {
				for(int i = 0;i<QuantidadeDeNavios;i++) {
					if(arrayDeNavios[posicaoInicial-i] == 0 && (posicaoInicial-i)/10 == linhaAtual) {
						n+=1;}
					}if(n ==QuantidadeDeNavios) {return true;} else {return false;}
			}else {return false;}
			
		}
		
	}
	
}