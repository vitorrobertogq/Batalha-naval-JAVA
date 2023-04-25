package application;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class jogoController implements Initializable {
	
	@FXML
	private AnchorPane pane;
	@FXML
	private GridPane grid;
	@FXML
	private GridPane gridAtaque;
	@FXML
	private Label text;
	@FXML
	private Button trocaDeTurno;
	@FXML
	private Label chat;
	@FXML
	private Label avisos;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	
	funcaobutao funcoesb = new funcaobutao();
	funcoesDeValidacao valida = new funcoesDeValidacao();
	
	static int[] posicao = new int[100];
	static int[] posicao1 = new int[100];
	static int tipoDeNavio=5;
	static int tipoDeNavio1=5;
	static int direcao = 0;
	static int vez = 0;
	static int Tiros = 3;
	static String texto = "Vez do Jogador";
	
	public boolean acabouOjogo(int[]array) {
		for(int p = 9;p<100;p++) {
			if(array[p]== 1 || array[p]== 2 ||array[p]== 3||array[p]== 4||array[p]== 5) {
				return false;
			}
		}
		return false;
	}
	
	public void imprimirMapaAtaque(int array[]) {
		for(int z = 0;z<100;z++) {
		if(array[z]==10) {
		Label desenho = new Label("🚢");
		desenho.setTextFill(Color.RED);
		desenho.setLayoutX(548+(40*(z%10)));
		desenho.setLayoutY(180+(40*(z/10)));
		desenho.setFont(Font.font ("Verdana", 20));
		pane.getChildren().addAll(desenho);
		}
		if(array[z]==9) {
			Label desenho = new Label("~");
			desenho.setTextFill(Color.RED);
			desenho.setLayoutX(548+(40*(z%10)));
			desenho.setLayoutY(180+(40*(z/10)));
			desenho.setFont(Font.font ("Verdana", 20));
			pane.getChildren().addAll(desenho);
			}} 
		}
	
	public void imprimirMapa(int[] array) {
			for(int z = 0;z<100;z++) {
			if(array[z]==9) {
					Label desenho = new Label("~");
					desenho.setTextFill(Color.RED);
					desenho.setLayoutX(85+(40*(z%10)));
					desenho.setLayoutY(180+(40*(z/10)));
					desenho.setFont(Font.font ("Verdana", 20));
					pane.getChildren().addAll(desenho);
					}
			else if(array[z]==10) {
					Label desenho = new Label("🚢");
					desenho.setTextFill(Color.RED);
					desenho.setLayoutX(85+(40*(z%10)));
					desenho.setLayoutY(180+(40*(z/10)));
					desenho.setFont(Font.font ("Verdana", 20));
					pane.getChildren().addAll(desenho);
					}
			else if(array[z] !=0) {
				Label desenho = new Label("🚢");
				desenho.setLayoutX(85+(40*(z%10)));
				desenho.setLayoutY(180+(40*(z/10)));
				desenho.setFont(Font.font ("Verdana", 20));
				pane.getChildren().addAll(desenho);
			}}} 
		
		
	
	public void trocarParaJogo(ActionEvent event) throws IOException {
		if(vez == 0) {vez=1;}
		else if(vez == 1) {vez=0;}
		Tiros = 3;
		root = FXMLLoader.load(getClass().getResource("jogo.fxml"));
		stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		String css = this.getClass().getResource("jogo.css").toExternalForm();
        scene.getStylesheets().add(css);
		stage.setScene(scene);
		stage.show();
		
	}
	
	public void initialize(URL url,ResourceBundle resourcebundle) {
		
		if(vez == 0) {
			imprimirMapa(posicao);
			imprimirMapaAtaque(posicao1);
			chat.setText("Vez do Jogador 1");
		}
		
		if(vez == 1) {imprimirMapa(posicao1);
					  imprimirMapaAtaque(posicao);
					  chat.setText("Vez do Jogador 2");}
		
		System.out.print(vez);
		
		for(int i = 0;i < 10;i++) {
			
			for(int j = 0;j<10;j++) {
			Button butao = new Button();
			Button butaoAtaque = new Button();
			butao.setStyle("-fx-background-color:transparent");
			butaoAtaque.setStyle("-fx-background-color:transparent");
			butao.setOnMouseClicked(MouseEvent ->{
			int posicaoinicial = (int) ((butao.getLayoutY()/40)*10+(butao.getLayoutX()/40));//POSICAO DO CLIQUE
			
			
//SETA VIRADA PARA CIMA
			
			if(direcao == 0) {
				if(tipoDeNavio == 5 && vez == 0) {
					if(valida.validacao(0, posicaoinicial, posicao, 5)) {
						for(int m = 0;m<5;m++) {							 
						posicao[posicaoinicial-(10*m)] = 5;
						imprimirMapa(posicao);
						tipoDeNavio=4;
							
						}}}
				 if(tipoDeNavio == 4 && vez == 0) {
						if(valida.validacao(0, posicaoinicial, posicao, 4)) {
							for(int m = 0;m<4;m++) {									 
							posicao[posicaoinicial-(10*m)] = 4;
							imprimirMapa(posicao);
							tipoDeNavio=3;
									
						}}}
				 if(tipoDeNavio == 3 && vez == 0) {
						if(valida.validacao(0, posicaoinicial, posicao, 3)) {
							for(int m = 0;m<3;m++) {									 
							posicao[posicaoinicial-(10*m)] = 3;
							imprimirMapa(posicao);
							tipoDeNavio=2;						
						}}}
				 if(tipoDeNavio == 2 && vez == 0) {
						if(valida.validacao(0, posicaoinicial, posicao, 2)) {
							for(int m = 0;m<2;m++) {									 
							posicao[posicaoinicial-(10*m)] = 2;
							imprimirMapa(posicao);
							tipoDeNavio=1;						
						}}}
				 if(tipoDeNavio == 1 && vez == 0) {
						if(valida.validacao(0, posicaoinicial, posicao, 1)) {
							posicao[posicaoinicial] = 1;
							imprimirMapa(posicao);
							tipoDeNavio=0;
						}}
				 if(tipoDeNavio1 == 5 && vez == 1) {
					if(valida.validacao(0, posicaoinicial, posicao1, 5)) {
						for(int m = 0;m<5;m++) {							 
						posicao1[posicaoinicial-(10*m)] = 5;
						imprimirMapa(posicao1);
						tipoDeNavio1=4;
							
						}}}
				 if(tipoDeNavio1 == 4 && vez == 1) {
						if(valida.validacao(0, posicaoinicial, posicao1, 4)) {
							for(int m = 0;m<4;m++) {									 
							posicao1[posicaoinicial-(10*m)] = 4;
							imprimirMapa(posicao1);
							tipoDeNavio1=3;
									
						}}}
				 if(tipoDeNavio1 == 3 && vez == 1) {
						if(valida.validacao(0, posicaoinicial, posicao1, 3)) {
							for(int m = 0;m<3;m++) {									 
							posicao1[posicaoinicial-(10*m)] = 3;
							imprimirMapa(posicao1);
							tipoDeNavio1=2;						
						}}}
				 if(tipoDeNavio1 == 2 && vez == 1) {
						if(valida.validacao(0, posicaoinicial, posicao1, 2)) {
							for(int m = 0;m<2;m++) {									 
							posicao1[posicaoinicial-(10*m)] = 2;
							imprimirMapa(posicao1);
							tipoDeNavio1=1;						
						}}}
				 if(tipoDeNavio1 == 1 && vez == 1) {
						if(valida.validacao(0, posicaoinicial, posicao1, 1)) {
							posicao1[posicaoinicial] = 1;
							imprimirMapa(posicao1);
							tipoDeNavio1=0;
						}}}
			
//SETA VIRADA PARA BAIXO
			
			if(direcao == 1) {
				if(tipoDeNavio == 5 && vez == 0) {
					if(valida.validacao(1, posicaoinicial, posicao, 5)) {
						for(int m = 0;m<5;m++) {							 
						posicao[posicaoinicial+(10*m)] = 5;
						imprimirMapa(posicao);
						tipoDeNavio=4;
							
						}}}
				if(tipoDeNavio == 4 && vez == 0) {
						if(valida.validacao(1, posicaoinicial, posicao, 4)) {
							for(int m = 0;m<4;m++) {									 
							posicao[posicaoinicial+(10*m)] = 4;
							imprimirMapa(posicao);
							tipoDeNavio=3;
									
						}}}
				if(tipoDeNavio == 3 && vez == 0) {
						if(valida.validacao(1, posicaoinicial, posicao, 3)) {
							for(int m = 0;m<3;m++) {									 
							posicao[posicaoinicial+(10*m)] = 3;
							imprimirMapa(posicao);
							tipoDeNavio=2;						
						}}}
				if(tipoDeNavio == 2 && vez == 0) {
						if(valida.validacao(1, posicaoinicial, posicao, 2)) {
							for(int m = 0;m<2;m++) {									 
							posicao[posicaoinicial+(10*m)] = 2;
							imprimirMapa(posicao);
							tipoDeNavio=1;						
						}}}
				if(tipoDeNavio == 1 && vez == 0) {
						if(valida.validacao(1, posicaoinicial, posicao, 1)) {
							posicao[posicaoinicial] = 1;
							imprimirMapa(posicao);
							tipoDeNavio=0;
						}}
				if(tipoDeNavio1 == 5 && vez == 1) {
					if(valida.validacao(1, posicaoinicial, posicao1, 5)) {
						for(int m = 0;m<5;m++) {							 
						posicao1[posicaoinicial+(10*m)] = 5;
						imprimirMapa(posicao1);
						tipoDeNavio1=4;
							
						}}}
				if(tipoDeNavio1 == 4 && vez == 1) {
						if(valida.validacao(1, posicaoinicial, posicao1, 4)) {
							for(int m = 0;m<4;m++) {									 
							posicao1[posicaoinicial+(10*m)] = 4;
							imprimirMapa(posicao1);
							tipoDeNavio1=3;
									
						}}}
				if(tipoDeNavio1 == 3 && vez == 1) {
						if(valida.validacao(0, posicaoinicial, posicao1, 3)) {
							for(int m = 0;m<3;m++) {									 
							posicao1[posicaoinicial+(10*m)] = 3;
							imprimirMapa(posicao1);
							tipoDeNavio1=2;						
						}}}
				if(tipoDeNavio1 == 2 && vez == 1) {
						if(valida.validacao(0, posicaoinicial, posicao1, 2)) {
							for(int m = 0;m<2;m++) {									 
							posicao1[posicaoinicial+(10*m)] = 2;
							imprimirMapa(posicao1);
							tipoDeNavio1=1;						
						}}}
				if(tipoDeNavio1 == 1 && vez == 1) {
						if(valida.validacao(1, posicaoinicial, posicao1, 1)) {
							posicao1[posicaoinicial] = 1;
							imprimirMapa(posicao1);
							tipoDeNavio1=0;
						}}}
				if(direcao == 2) {

					if(tipoDeNavio == 5 && vez == 0) {
						if(valida.validacao(2, posicaoinicial, posicao, 5)) {
							for(int m = 0;m<5;m++) {							 
							posicao[posicaoinicial+m] = 5;
							imprimirMapa(posicao);
							tipoDeNavio=4;
								
							}}}
					if(tipoDeNavio == 4 && vez == 0) {
							if(valida.validacao(2, posicaoinicial, posicao, 4)) {
								for(int m = 0;m<4;m++) {									 
								posicao[posicaoinicial+m] = 4;
								imprimirMapa(posicao);
								tipoDeNavio=3;
										
							}}}
					if(tipoDeNavio == 3 && vez == 0) {
							if(valida.validacao(2, posicaoinicial, posicao, 3)) {
								for(int m = 0;m<3;m++) {									 
								posicao[posicaoinicial+m] = 3;
								imprimirMapa(posicao);
								tipoDeNavio=2;						
							}}}
					if(tipoDeNavio == 2 && vez == 0) {
							if(valida.validacao(2, posicaoinicial, posicao, 2)) {
								for(int m = 0;m<2;m++) {									 
								posicao[posicaoinicial+m] = 2;
								imprimirMapa(posicao);
								tipoDeNavio=1;						
							}}}
					if(tipoDeNavio == 1 && vez == 0) {
							if(valida.validacao(2, posicaoinicial, posicao, 1)) {
								posicao[posicaoinicial] = 1;
								imprimirMapa(posicao);
								tipoDeNavio=0;
							}}
					if(tipoDeNavio1 == 5 && vez == 1) {
						if(valida.validacao(2, posicaoinicial, posicao1, 5)) {
							for(int m = 0;m<5;m++) {							 
							posicao1[posicaoinicial+m] = 5;
							imprimirMapa(posicao1);
							tipoDeNavio1=4;
								
							}}}
					if(tipoDeNavio1 == 4 && vez == 1) {
							if(valida.validacao(2, posicaoinicial, posicao1, 4)) {
								for(int m = 0;m<4;m++) {									 
								posicao1[posicaoinicial+m] = 4;
								imprimirMapa(posicao1);
								tipoDeNavio1=3;
										
							}}}
					if(tipoDeNavio1 == 3 && vez == 1) {
							if(valida.validacao(2, posicaoinicial, posicao1, 3)) {
								for(int m = 0;m<3;m++) {									 
								posicao1[posicaoinicial+m] = 3;
								imprimirMapa(posicao1);
								tipoDeNavio1=2;						
							}}}
					if(tipoDeNavio1 == 2 && vez == 1) {
							if(valida.validacao(2, posicaoinicial, posicao1, 2)) {
								for(int m = 0;m<2;m++) {									 
								posicao1[posicaoinicial+m] = 2;
								imprimirMapa(posicao1);
								tipoDeNavio1=1;						
							}}}
					if(tipoDeNavio1 == 1 && vez == 1) {
							if(valida.validacao(2, posicaoinicial, posicao1, 1)) {
								posicao1[posicaoinicial] = 1;
								imprimirMapa(posicao1);
								tipoDeNavio1=0;
							}}}
				
				if(direcao == 3) {
					if(tipoDeNavio == 5 && vez == 0) {
						if(valida.validacao(3, posicaoinicial, posicao, 5)) {
							for(int m = 0;m<5;m++) {							 
							posicao[posicaoinicial-m] = 5;
							imprimirMapa(posicao);
							tipoDeNavio=4;
								
							}}}
					if(tipoDeNavio == 4 && vez == 0) {
							if(valida.validacao(3, posicaoinicial, posicao, 4)) {
								for(int m = 0;m<4;m++) {									 
								posicao[posicaoinicial-m] = 4;
								imprimirMapa(posicao);
								tipoDeNavio=3;
										
							}}}
					if(tipoDeNavio == 3 && vez == 0) {
							if(valida.validacao(3, posicaoinicial, posicao, 3)) {
								for(int m = 0;m<3;m++) {									 
								posicao[posicaoinicial-m] = 3;
								imprimirMapa(posicao);
								tipoDeNavio=2;						
							}}}
					if(tipoDeNavio == 2 && vez == 0) {
							if(valida.validacao(3, posicaoinicial, posicao, 2)) {
								for(int m = 0;m<2;m++) {									 
								posicao[posicaoinicial-m] = 2;
								imprimirMapa(posicao);
								tipoDeNavio=1;						
							}}}
					if(tipoDeNavio == 1 && vez == 0) {
							if(valida.validacao(3, posicaoinicial, posicao, 1)) {
								posicao[posicaoinicial] = 1;
								imprimirMapa(posicao);
								tipoDeNavio=0;
							}}
					if(tipoDeNavio1 == 5 && vez == 1) {
						if(valida.validacao(3, posicaoinicial, posicao1, 5)) {
							for(int m = 0;m<5;m++) {							 
							posicao1[posicaoinicial-m] = 5;
							imprimirMapa(posicao1);
							tipoDeNavio1=4;
								
							}}}
					if(tipoDeNavio1 == 4 && vez == 1) {
							if(valida.validacao(3, posicaoinicial, posicao1, 4)) {
								for(int m = 0;m<4;m++) {									 
								posicao1[posicaoinicial-m] = 4;
								imprimirMapa(posicao1);
								tipoDeNavio1=3;
										
							}}}
					if(tipoDeNavio1 == 3 && vez == 1) {
							if(valida.validacao(3, posicaoinicial, posicao1, 3)) {
								for(int m = 0;m<3;m++) {									 
								posicao1[posicaoinicial-m] = 3;
								imprimirMapa(posicao1);
								tipoDeNavio1=2;						
							}}}
					if(tipoDeNavio1 == 2 && vez == 1) {
							if(valida.validacao(3, posicaoinicial, posicao1, 2)) {
								for(int m = 0;m<2;m++) {									 
								posicao1[posicaoinicial-m] = 2;
								imprimirMapa(posicao1);
								tipoDeNavio1=1;						
							}}}
					if(tipoDeNavio1 == 1 && vez == 1) {
							if(valida.validacao(3, posicaoinicial, posicao1, 1)) {
								posicao1[posicaoinicial] = 1;
								imprimirMapa(posicao1);
								tipoDeNavio1=0;
							}}
				}
				}
			
				
				
		);//FINAL EVENTO BUTAO
			
			butao.setOnKeyPressed(event->{
			if(event.getCode()== KeyCode.UP) {
				direcao = 0;
				funcoesb.direcao(text, direcao);
				
			}
			if(event.getCode()== KeyCode.DOWN) {
				direcao = 1;
				funcoesb.direcao(text, direcao);
			}
			if(event.getCode()== KeyCode.RIGHT) {
				direcao = 2;
				funcoesb.direcao(text, direcao);
				
			}
			if(event.getCode()== KeyCode.LEFT) {
				direcao = 3;
				funcoesb.direcao(text, direcao);
				}
			if(event.getCode()== KeyCode.ENTER) {
				for(int v = 0;v<100;v++) {
					System.out.print("/"+posicao[v]);
				}
				}
			
			});
			
			butaoAtaque.setOnMouseClicked(MouseEvent ->{
				int posicaoinicial2 = (int) ((butaoAtaque.getLayoutY()/40)*10+(butaoAtaque.getLayoutX()/40));
				
				if(posicao1[posicaoinicial2] == 0 && posicao1[posicaoinicial2]!= 10 && posicao1[posicaoinicial2]!= 9 && vez == 0 && tipoDeNavio == 0 & tipoDeNavio1 == 0 && Tiros != 0) {
						posicao1[posicaoinicial2] = 9;
						chat.setText("AGUA");
						imprimirMapaAtaque(posicao1);
						Tiros -=1;
						
					}
					else if(vez == 0 && posicao1[posicaoinicial2] != 0 && posicao1[posicaoinicial2]!= 10 && posicao1[posicaoinicial2]!= 9&& tipoDeNavio == 0 && tipoDeNavio1 == 0 && Tiros !=0) {
						if(posicao1[posicaoinicial2] == 5) {chat.setText("Acertou Navio de 5 canos");}
						if(posicao1[posicaoinicial2] == 4) {chat.setText("Acertou Navio de 4 canos");}
						if(posicao1[posicaoinicial2] == 3) {chat.setText("Acertou Navio de 3 canos");}
						if(posicao1[posicaoinicial2] == 2) {chat.setText("Acertou Navio de 2 canos");}
						if(posicao1[posicaoinicial2] == 1) {chat.setText("Acertou Navio de 1 cano");}
						posicao1[posicaoinicial2] = 10;
						imprimirMapaAtaque(posicao1);
						Tiros -=1;
						if(acabouOjogo(posicao)) {chat.setText("JOGADOR 2 VENCEU O JOGO");}}
				
				if(posicao[posicaoinicial2] == 0 && vez == 1 && tipoDeNavio == 0 && tipoDeNavio1 == 0 && Tiros != 0&& posicao[posicaoinicial2]!= 9&& posicao[posicaoinicial2]!= 10) {
						posicao[posicaoinicial2] = 9;
						chat.setText("AGUA");
						Tiros -=1;
						imprimirMapaAtaque(posicao);}
					
					else if(vez == 1 && posicao[posicaoinicial2] != 0 && posicao[posicaoinicial2]!= 10 && posicao[posicaoinicial2]!= 9&& tipoDeNavio == 0 && tipoDeNavio1 == 0 && Tiros !=0) {
						if(posicao[posicaoinicial2] == 5) {chat.setText("Acertou Navio de 5 canos");}
						if(posicao[posicaoinicial2] == 4) {chat.setText("Acertou Navio de 4 canos");}
						if(posicao[posicaoinicial2] == 3) {chat.setText("Acertou Navio de 3 canos");}
						if(posicao[posicaoinicial2] == 2) {chat.setText("Acertou Navio de 2 canos");}
						if(posicao[posicaoinicial2] == 1) {chat.setText("Acertou Navio de 1 cano");}
						posicao[posicaoinicial2] = 10;
						imprimirMapaAtaque(posicao);
						Tiros -=1;
						if(acabouOjogo(posicao)) {chat.setText("JOGADOR 2 VENCEU O JOGO");}}
				}
				
			);
			butao.setPrefHeight(40);
			butao.setPrefWidth(40);
			butaoAtaque.setPrefHeight(40);
			butaoAtaque.setPrefWidth(40);
			grid.add(butao, i, j);
			gridAtaque.add(butaoAtaque, i, j);
			}
			
		}
	  
	}}
	

	
