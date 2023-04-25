package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class tutorialController {
	private Parent root;
	private Stage stage;
	private Scene scene;

	public void trocarParaMenu(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("menu.fxml"));
		stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		String css = this.getClass().getResource("menu.css").toExternalForm();
        scene.getStylesheets().add(css);
		stage.setScene(scene);
		stage.show();
	}
}
