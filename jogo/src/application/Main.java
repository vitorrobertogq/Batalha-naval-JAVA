package application;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;



public class Main extends Application {
	
	@Override
	public void start(Stage stage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
			Scene scene = new Scene(root,1024,768);
			String css = this.getClass().getResource("menu.css").toExternalForm();
            scene.getStylesheets().add(css);
			stage.setScene(scene);
			stage.setResizable(false);
			stage.setTitle("BATALHA NAVAL");
			Image icon = new Image(getClass().getResourceAsStream("icon1.png"));
			stage.getIcons().add(icon);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
