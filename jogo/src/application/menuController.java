package application;

import javafx.scene.Scene;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Node;

public class menuController {
	private Stage stage;
	private Scene scene;
	private Parent root;

	
	public void trocarParaJogo(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("jogo.fxml"));
		stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		String css = this.getClass().getResource("jogo.css").toExternalForm();
        scene.getStylesheets().add(css);
		stage.setScene(scene);
		stage.show();
	}
	public void trocarParaTutorial(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("tutorial.fxml"));
		stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root,1024,768);
		stage.setResizable(false);
		String css = this.getClass().getResource("menu.css").toExternalForm();
        scene.getStylesheets().add(css);
		stage.setScene(scene);
		stage.show();
	}
	
}
