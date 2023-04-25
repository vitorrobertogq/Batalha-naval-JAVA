package application;




import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;



public class funcaobutao {
	
	
	
	@FXML
	private GridPane grid;

	@FXML
	private Label text;
	public void direcao(Label text,int n) {
		if (n == 0) {
		text.setText("Direção Atual:⬆️");
		text.setLayoutX(872);
		text.setLayoutY(38);}
		if (n == 1) {
			text.setText("Direção Atual:⬇️");
			text.setLayoutX(872);
			text.setLayoutY(38);}
		if (n == 2) {
			text.setText("Direção Atual:➡️");
			text.setLayoutX(872);
			text.setLayoutY(38);}
		if (n == 3) {
			text.setText("Direção Atual:⬅️");
			text.setLayoutX(872);
			text.setLayoutY(38);}
}
	}

	
